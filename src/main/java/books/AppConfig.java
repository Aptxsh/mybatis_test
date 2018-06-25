package books;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "books")
@MapperScan("books.mapper")
@PropertySource("classpath:books/jdbc.properties")
public class AppConfig {

	@Bean
	public DataSource dataSource(Environment env) {
		DriverManagerDataSource dds = new DriverManagerDataSource(env.getProperty("jdbc.url"),
				env.getProperty("jdbc.username"), env.getProperty("jdbc.password"));
		dds.setDriverClassName(env.getProperty("jdbc.driverClassName"));
		return dds;
	}

	@Bean
	public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) {
		SqlSessionFactoryBean sf = new SqlSessionFactoryBean();
		sf.setConfigLocation(new ClassPathResource("books/mybatis-config.xml"));
		sf.setDataSource(dataSource);
		return sf;
	}
}
