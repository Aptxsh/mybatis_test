package books.pojo;

public class Book_Comment {

	private Integer id;
	private Book book; // 一对一关系
	private String comment;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "Book_Comment [id=" + id + ", book=" + book + ", comment=" + comment + "]";
	}
}
