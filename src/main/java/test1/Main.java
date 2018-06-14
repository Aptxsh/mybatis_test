package test1;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import mybatistest.Student;
import mybatistest.StudentMapper;

public class Main {

	public static void main(String[] args) throws IOException {
		String resource = "test1/mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		SqlSession session = sqlSessionFactory.openSession();
		try {
			OperatorMapper mapper = session.getMapper(OperatorMapper.class);
			List<Operator> list = mapper.findAll();
			System.out.println(list);
		} finally {
			session.close();
		}
	}

}
