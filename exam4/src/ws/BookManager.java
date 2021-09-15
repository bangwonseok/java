package ws;

import java.util.Scanner;
public class BookManager {
    Scanner sc = new Scanner(System.in);
    Book[] books = new Book[100];
    
    boolean isRun = true;
    int selectNo = 0;
    int count = 1;
    
    public BookManager() //11 - 47 라인 ) BookManager 클래스가 실행되면 run()메소드가 자동으로 실행 되면서 도서등록, 도서목록, 도서수정, 도서삭제, 종료 메소드가 실행됨 
    {
        run();
    }
    
    public void run()
    {
        while(isRun)
        {
            System.out.println("============================================================");
            System.out.println("1. 도서등록 | 2. 도서목록 | 3. 도서수정 | 4. 도서삭제 | 5. 종료");
            System.out.println("============================================================");
            selectNo = getSelectNum("번호를 선택하세요 > ");
            
            switch(selectNo)
            {
            case 1 :
                registerBook();
                break;
            case 2 :
                selectBook();
                break;
            case 3 :
                updateBook();
                break;
            case 4 :
                deleteBook();
                break;
            case 5 : 
                terminate();
                break;
            default : 
                    System.out.println("등록된 메뉴가 아닙니다.");
            }
            
        }
    }
    
    public void terminate() {	// terminate() 메소드 -- 프로그램 종료 메소드 while문에 false값이 들어가면서 프로그램 종료
        System.out.println("프로그램 종료");
        isRun = false;
    }
    
    public void registerBook()
    {
        System.out.println("1.도서등록");
        String title = getData("등록할 도서의 제목을 입력해주세요  :");
        String author = getData("등록할 도서의 저자를 입력해주세요 : ");
        
        for(int i = 0; i < books.length; i++)// 60 - 69 라인 ) 5 라인 Book[] books = new Book[100] 으로 100개의 배열을 만들어 
        	//도서 등록이 될때 마다 카운트 됨번호가 이미 있을 떄는 count = i + 1을 통해 값을 증가 시켜줌 count, title, author에 값을 넣음 
        {
            if(books[i] == null)
            {
                count = i+1;
                books[i] = new Book(count,title,author);
                System.out.println("등록완료");
                break;
            }
        }
    }
    
    public void selectBook()	//	--도서목록 메소드....
    {
        System.out.println("2.도서목록");
        for(Book b : books)
        {
            if( b != null )
            {
                printBookInfo(b);
            }
        }
    }
    
    public void updateBook()	//	-- 도서수정 메소드...
    //내가 등록한 도서의 관리번호를 selectnum을 통해 읽어와 findBook 메소드를 통해 도서의 num, title, author의 값을 읽어옴 
    //다음으로 title을 수정할 것인지 author을 수정할 것인지 선택함 
    {
        System.out.println("3. 도서수정");
        int bookNum = getSelectNum("수정할 도서의 관리 번호를 입력하세요 > ");
        
        Book b = findBook(bookNum);
        if(b == null)
        {
            System.out.println("입력하신 관리번호의 책이 존재하지 않습니다.");
            return;
        }
        
        boolean isUpdate = true;
        
        while(isUpdate) 
        {
            System.out.println("====================================================");
            System.out.println("1. 제목수정 | 2. 저자수정 | 3. 수정완료");
            System.out.println("====================================================");
            
            selectNo = getSelectNum("번호입력 >>");
            
            switch(selectNo)
            {
            case 1 :
                String title = getData("제목을 수정해주세요 >>");
                b.setTitle(title);
                System.out.println("제목 수정 완료 ");
                
            case 2 : 
                String author = getData("저자 이름을 수정해주세요 >>");
                b.setAuthor(author);
                System.out.println("저자 이름 수정완료");
            case 3 :
                System.out.println("수정메뉴 종료");
                isUpdate = false;
                break;
            }
        }
    }
    
    public void deleteBook()
    //	--도서삭제 메소드 
    //내가 등록한 도서의 관리번호를 selectnum을 통해 읽어와 findBook메소드를 통해 도서의 num, title, author의 값을 읽어옴 
    //다음으로 num을 찾아 num의 값을 null로 만들어 삭제를 완료함 ....
    {
        System.out.println("4. 도서삭제");
        int bookNum = getSelectNum("삭제할 도서의 관리번호를 입력하세요.");
        
        Book b = findBook(bookNum);
        
        if(b == null)
        {
            System.out.println("입력하신 관리번호의 책이 존재하지 않습니다.");
            return;
        }
        
        for(int i = 0; i < books.length; i++)
        {
            if(books[i] != null && books[i].getNum() == bookNum)
            {
                books[i] = null;
                System.out.println("삭제 완료");
                return;
            }
        }
    }
    
    public void printBookInfo(Book b)
    {
        System.out.println(b.toString());
    }
    
    public Book findBook(int num)
    {
        for(int i = 0; i< books.length; i++)
        {
            if(books[i] != null && books[i].getNum() == num)
            {
                return books[i];
            }
        }
        
        return null;
    }
    
    String getData(String message)
    {
        System.out.println(message);
        return sc.next();
    }
    
    int getSelectNum(String message)
    {
        System.out.println(message);
        return sc.nextInt();
    }
    
    public static void main(String[] args)
    {
        new BookManager();
    }
}
