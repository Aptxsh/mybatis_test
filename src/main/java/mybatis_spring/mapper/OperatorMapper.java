package mybatis_spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import mybatis_spring.Operator;
import mybatistest.Student;

public interface OperatorMapper {

	List<Operator> findAll();

	Operator findOne(Integer id);

	void create(Operator operator);

	void delete(Integer id);

	void update(Operator operator);

	List<Operator> findByRoleAndDisabled(@Param("role") String role,
			@Param("disabled") Boolean disabled);

	Integer count();

	List<String> findAllRoles();

	List<Operator> findByUsernameLike(@Param("username") String username);

	void batchDisable(@Param("ids") List<Integer> ids, @Param("disabled") Boolean disabled);

	List<Student> search(Operator operator);
}
