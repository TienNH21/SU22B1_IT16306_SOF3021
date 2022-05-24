package su22.sof3021.demo_bean_config;

import su22.sof3021.beans.User;

public class UserDAOSqlServer implements UserDAOInterface {

	@Override
	public void insert(User u) {
		System.out.println("Them SQL Server");
	}

	@Override
	public void update(User u) {
		System.out.println("Cap nhat SQL Server");
	}

	@Override
	public void delete(User u) {
		System.out.println("Xoa SQL Server");
	}

	@Override
	public void all() {
		System.out.println("All SQL Server");
	}

}
