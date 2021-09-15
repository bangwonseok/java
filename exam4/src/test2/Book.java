package test2;

public class Book<T, N>{

	N bookId;
	T bookName;
	N price;
	
	public Book(N bookId, T bookName, N price) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
	}
	
	public N getBookId() {
		return bookId;
	}

	public void setBookId(N bookId) {
		this.bookId = bookId;
	}

	public T getBookName() {
		return bookName;
	}

	public void setBookName(T bookName) {
		this.bookName = bookName;
	}

	public N getPrice() {
		return price;
	}

	public void setPrice(N price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "아이디 : " + bookId + ", 이름 : " + bookName + ", 가격 : " + price;
	}
	
	
	
	
	
}