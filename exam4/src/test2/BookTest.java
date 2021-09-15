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
		
		System.out.println("��ɾ �Է����ֽʽÿ�.");
		System.out.println("add : å �߰�");
		System.out.println("edit : å ����");
		System.out.println("del : å ����");
		System.out.println("show : å ��ȸ");
		System.out.println("showall : ��� å ��ȸ");
		
		while(true) {
			
			String menu = scanner.nextLine();
			
			switch (menu) {
			case "add" : 
				System.out.println("����� å ���̵� �Է��Ͻʽÿ�.");
				int Id = scanner.nextInt();
				
				System.out.println("����� å �̸��� �Է��Ͻʽÿ�.");
				String name = scanner.next();
				
				System.out.println("����� å ������ �Է��Ͻʽÿ�.");
				int price = scanner.nextInt();
				
				Book newbook = new Book(Id, name, price);
				book.addBook(newbook); 

				break;
				
			case "edit" : 
				System.out.println("������ å ���̵� �Է��Ͻʽÿ�.");
				int editId = scanner.nextInt();
				
				
				System.out.println("å �̸��� ��� �ٲٽðڽ��ϱ�?");
				String editName = scanner.next();
				
				System.out.println("å ������ ��� �ٲٽðڽ��ϱ�?");
				int editPrice = scanner.nextInt();
				
				Book editBook = new Book(editId, editName, editPrice);
				book.setBook(editId, editBook);
				
				break;
				
			case "del" :
				System.out.println("������ å ���̵� �Է��Ͻʽÿ�.");
				int bookId = scanner.nextInt();
				book.removeBook(bookId);
				
				break;
				
			case "show" : 
				System.out.println("��ȸ�� å ���̵� �Է��Ͻʽÿ�.");
				
				int showId = scanner.nextInt();
				book.showBook(showId);
				
				break;
				
			case "showall" : 
				book.showAllBook();
				
				break;
			
			/*default :
				System.out.println("�������� �ʴ� ��ɾ��Դϴ�.");
				
				break;*/
			}
			
			
		}

	}

}
