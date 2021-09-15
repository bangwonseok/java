package ws;


public class Book {
	  private int num; // 4 - 6 ���� ) Ŭ������ ��������� private�� ���������� �� 
	    private String title;
	    private String author;
	  
	    public Book()
	    {}
	    
	    public Book(int num, String title, String author) // 11 - 16 ���� ) �Ű������� �Ѿ�� num, title, author�� ���� Ŭ���� Book�� num, title, author�� ����
	    {
	        super();
	        this.num = num;
	        this.title = title;
	        this.author = author;
	        
	    }
	    
	    public int getNum()	//20 - 49 ���� ) num, title, author�� ���� �ְų� �д� getter and setter
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
	    
	    public String toString()	//51 - 54 ���� ) �� �޼ҵ尡 ȣ�� �Ǹ� Book�� ������ ��ȯ
	    {
	        return "Book[num : " +this.num +"] [title : "+this.title +"] [author : "+this.author+"])";
	    }
	}
