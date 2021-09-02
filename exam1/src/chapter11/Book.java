package chapter11;

public class Book {
	private String Title;
	private int price;
	
	Book(String title, int price){
		this.Title = title;
		this.price = price;
	}
	
	public String toString() {
		return "책 제목 : " + title + ", 판매가 : " + price;
	}
}
