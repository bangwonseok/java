package test2;

import test2.Book;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) throws IOException {
		BookList book = new BookList();
		

		
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("명령어를 입력해주십시오.");
		System.out.println("add : 책 추가");
		System.out.println("edit : 책 수정");
		System.out.println("del : 책 삭제");
		System.out.println("show : 책 조회");
		System.out.println("showall : 모든 책 조회");
		
		while(true) {
			
			String menu = scanner.nextLine();
			
			switch (menu) {
			case "add" : 
				System.out.println("등록할 책 아이디를 입력하십시오.");
				int Id = scanner.nextInt();
				
				System.out.println("등록할 책 이름을 입력하십시오.");
				String name = scanner.next();
				
				System.out.println("등록할 책 가격을 입력하십시오.");
				int price = scanner.nextInt();
				
				Book newbook = new Book(Id, name, price);
				book.addBook(newbook); 

				break;
				
			case "edit" : 
				System.out.println("수정할 책 아이디를 입력하십시오.");
				int editId = scanner.nextInt();
				
				
				System.out.println("책 이름을 어떻게 바꾸시겠습니까?");
				String editName = scanner.next();
				
				System.out.println("책 가격을 어떻게 바꾸시겠습니까?");
				int editPrice = scanner.nextInt();
				
				Book editBook = new Book(editId, editName, editPrice);
				book.setBook(editId, editBook);
				
				break;
				
			case "del" :
				System.out.println("삭제할 책 아이디를 입력하십시오.");
				int bookId = scanner.nextInt();
				book.removeBook(bookId);
				
				break;
				
			case "show" : 
				System.out.println("조회할 책 아이디를 입력하십시오.");
				
				int showId = scanner.nextInt();
				book.showBook(showId);
				
				break;
				
			case "showall" : 
				book.showAllBook();
				
				break;
			
			/*default :
				System.out.println("지원하지 않는 명령어입니다.");
				
				break;*/
			}
			
			
		}

	}

}
