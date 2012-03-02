package info.seosh81.toby30.chapter1.dao;

public class UserDaoFactory {
	public UserDao userDao() {
		ConnectionMaker connectionMaker = connectionMaker();
		UserDao userDao = new UserDao(connectionMaker);
		return userDao;
	}
	
	private ConnectionMaker connectionMaker() {
		return new PConnectionMaker();
	}
}
