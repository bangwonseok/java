package ws;


public class Book {
	  private int num; // 4 - 6 라인 ) 클래스의 멤버변수를 private로 접근제한을 둠 
	    private String title;
	    private String author;
	  
	    public Book()
	    {}
	    
	    public Book(int num, String title, String author) // 11 - 16 라인 ) 매개변수로 넘어온 num, title, author의 값을 클래스 Book의 num, title, author에 저장
	    {
	        super();
	        this.num = num;
	        this.title = title;
	        this.author = author;
	        
	    }
	    
	    public int getNum()	//20 - 49 라인 ) num, title, author에 값을 넣거나 읽는 getter and setter
	    {
	        return num;
	    }
	    
	    
	    public void setNum(int num)
	    {
	        this.num = num;
	    }
	    
	    public String getTitle()
	    {
	        return title;
	    }
	    
	    public void setTitle(String title)
	    {
	        this.title = title;
	    }
	    
	    public String getAuthor()
	    {
	        return author;
	    }
	    
	    public void setAuthor(String author)
	    {
	        this.author = author;
	    }
	    
	    public String toString()	//51 - 54 라인 ) 이 메소드가 호출 되면 Book의 정보를 반환
	    {
	        return "Book[num : " +this.num +"] [title : "+this.title +"] [author : "+this.author+"])";
	    }
	}
