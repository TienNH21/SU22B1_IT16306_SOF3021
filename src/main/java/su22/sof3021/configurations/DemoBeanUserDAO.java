package su22.sof3021.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import su22.sof3021.demo_bean_config.UserDAOInterface;
import su22.sof3021.demo_bean_config.UserDAOMySql;
import su22.sof3021.demo_bean_config.UserDAOSqlServer;

@Configuration
public class DemoBeanUserDAO {
	@Bean("user_dao_mysql")
	public UserDAOInterface getUserDAOMySql()
	{
		return new UserDAOMySql();
	}
	
	@Bean("user_dao_sqlserver")
	public UserDAOInterface getUserDAOSqlServer()
	{
		return new UserDAOSqlServer();
	}
}
