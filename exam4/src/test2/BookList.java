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
		System.out.println("정상적으로 추가되었습니다.");
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
				System.out.println("정상적으로 삭제되었습니다.");
				return true;
			}
		}
		System.out.println("존재하지 않는 ID입니다.");
		return false;
	}
	
	public void showAllBook() {
		System.out.println("현재 도서관에 등록된 모든 책입니다.");
		
		for (Book<T, N> i : arrayList) {
			System.out.println(i);
		}
	}
	
	public void showBook(int showId) {
		
		System.out.println(arrayList.get(showId - 1));
		
	}



	

	

	
}