package books.mapper;

import books.pojo.Book;

public interface BookMapper {

	Book findOne(Integer id);
	
}
