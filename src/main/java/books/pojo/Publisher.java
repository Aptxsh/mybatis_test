package books.pojo;

import java.util.List;

public class Publisher {

	private Integer id;
	private String name;
	private String about;
	private List<Book> book; // 一对多关系

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Publisher [id=" + id + ", name=" + name + ", about=" + about + ", book=" + book
				+ "]";
	}
}
