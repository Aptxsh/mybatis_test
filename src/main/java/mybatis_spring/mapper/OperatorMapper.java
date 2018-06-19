package mybatis_spring.mapper;

import java.util.List;

import mybatis_spring.Operator;

public interface OperatorMapper {

	List<Operator> findAll();

	Operator findOne(Integer id);

	void create(Operator operator);

	void delete(Integer id);

	void update(Operator operator);
}
