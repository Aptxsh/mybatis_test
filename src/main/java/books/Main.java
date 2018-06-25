package books;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import books.mapper.AuthorMapper;
import books.mapper.BookCommentMapper;
import books.mapper.BookMapper;
import books.pojo.Author;
import books.pojo.Book;
import books.pojo.Book_Comment;

public class Main {

	public static void main(String[] args) throws IOException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);
		BookMapper mapper = context.getBean(BookMapper.class);
		Book book = mapper.findOne(1);
		System.out.println(book.getName() + "--" + book.getPublisher().getName());
		for (Author author : book.getAuthor()) {
			System.out.println(book.getName() + "--" + book.getPublisher().getName() + "--"
					+ author.getName());
		}

		BookCommentMapper commentMapper = context.getBean(BookCommentMapper.class);
		Book_Comment comment = commentMapper.findOne(1);
		System.out.println(comment.getBook().getName() + "--" + comment.getComment());
		Book_Comment bookcomment = commentMapper.findOneAndPublisher(1);
		System.out.println(bookcomment.getBook().getPublisher().getName() + "--"
				+ bookcomment.getBook().getName() + "--" + bookcomment.getComment());

		AuthorMapper authorMapper = context.getBean(AuthorMapper.class);
		Author author = authorMapper.findOne(21);
		System.out.println(author.getName() + "[" + author.getGender() + "]");
		for (Book b : author.getBook()) {
			System.out.println("《" + b.getName() + "》");
		}
	}
}
