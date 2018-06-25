package mybatis_spring;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import mybatis_spring.mapper.OperatorMapper;

public class Main {

	public static void main(String[] args) throws IOException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);
		OperatorMapper operatorMapper = context.getBean(OperatorMapper.class);

		// 查询所有管理员
		// System.out.println("findAll:" + operatorMapper.findAll());

		// 根据ID查询管理员
		// System.out.println("findOne:" + operatorMapper.findOne(1001));

		// 添加管理员
		// try {
		// Operator operator = new Operator("赵二", "root", "HR");
		// operatorMapper.create(operator);
		// System.out.println("create:id=" + operator.getId());
		// } catch (Exception e) {
		// System.out.println("添加失败");
		// }

		// 根据ID删除管理员
		// operatorMapper.delete(1012);

		// 修改管理员信息
		// Operator operator = operatorMapper.findOne(1002);
		// operator.setRole("PS");
		// operator.setPassword("123456");
		// operatorMapper.update(operator);

		// 根据角色和权限查询管理员
		// List<Operator> list = operatorMapper.findByRoleAndDisabled("HR",
		// false);
		// System.out.println(list);

		// 统计管理员人数
		// System.out.println(operatorMapper.count());

		// 批量修改管理员权限
		// List<String> list = operatorMapper.findAllRoles();
		// System.out.println(list);
		// System.out.println(operatorMapper.findByUsernameLike("王"));
		// operatorMapper.batchDisable(Arrays.asList(1001, 1002, 1005), true);

		// 多条件查询管理员
		// Operator operator = new Operator();
		// operator.setRole("HR");
		// operator.setDisabled(false);
		// System.out.println(operatorMapper.search(operator));
		
		
	}

}
