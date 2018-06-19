package mybatis_spring;

import java.io.IOException;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import mybatis_spring.mapper.OperatorMapper;

public class Main {

	public static void main(String[] args) throws IOException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);
		OperatorMapper operatorMapper = context.getBean(OperatorMapper.class);
		System.out.println("findAll:" + operatorMapper.findAll());
		// System.out.println("findOne:" + operatorMapper.findOne(1001));
		// try {
		// operatorMapper.create(new Operator("赵六", "root", "HR"));
		// } catch (Exception e) {
		// System.out.println("添加失败");
		// }
		// operatorMapper.delete(1003);
		// Operator operator = operatorMapper.findOne(1002);
		// operator.setRole("PS");
		// operator.setPassword("123456");
		// operatorMapper.update(operator);
	}

}
