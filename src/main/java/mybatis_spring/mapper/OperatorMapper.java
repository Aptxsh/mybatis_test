package mybatis_spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import mybatis_spring.Operator;

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
}
