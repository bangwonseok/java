package test2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import test2.Book;
import test2.BookTest;

public class BookList<T, N>{
	ArrayList<Book> arrayList = new ArrayList<Book>();
	
	public void addBook(Book id) {
		
		arrayList.add(id);
		System.out.println("���������� �߰��Ǿ����ϴ�.");
	}
	
	public void setBook(int editId, Book<T, N> id) {
		
		arrayList.set(editId - 1, id);	
}
	
	public <T, N> boolean removeBook(int bookId) {
		for(int i = 0; i < arrayList.size(); i++) {
			Book<T, N> bookId2 = arrayList.get(i);
			int tempId = (int)bookId2.getBookId();
			if (tempId == bookId) {
				arrayList.remove(i);
				System.out.println("���������� �����Ǿ����ϴ�.");
				return true;
			}
		}
		System.out.println("�������� �ʴ� ID�Դϴ�.");
		return false;
	}
	
	public void showAllBook() {
		System.out.println("���� �������� ��ϵ� ��� å�Դϴ�.");
		
		for (Book<T, N> i : arrayList) {
			System.out.println(i);
		}
	}
	
	public void showBook(int showId) {
		
		System.out.println(arrayList.get(showId - 1));
		
	}



	

	

	
}