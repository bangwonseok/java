package chapter11;

public class Book {
	private String Title;
	private int price;
	
	Book(String title, int price){
		this.Title = title;
		this.price = price;
	}
	
	public String toString() {
		return "å ���� : " + title + ", �ǸŰ� : " + price;
	}
}
