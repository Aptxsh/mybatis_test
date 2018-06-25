package books.mapper;

import books.pojo.Book_Comment;

public interface BookCommentMapper {

	Book_Comment findOne(Integer id);

	Book_Comment findOneAndPublisher(Integer id);
}
