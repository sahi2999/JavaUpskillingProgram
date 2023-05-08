package Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

class Book{
	String name;
	String author;
	int price;
	
	public Book(String name, String author, int price) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", price=" + price + "]";
	}
	
	
	
}


public class BookSet {

	public static void main(String[] args) {
    Set<Book> myset=new LinkedHashSet<>();
    Book b1=new Book("Let us C","C.Balu",280);
    Book b2=new Book("Programming with Java","E.Balaguruswamy",602);
    Book b3=new Book("Spring in Action","Craig Walls",720);
    Book b4=new Book("Clean code"," Robert C. Martin",500);
    Book b5=new Book("Thinking in java","Bruce Eckel",900);
    
    myset.add(b1);
    myset.add(b2);
    myset.add(b5);
    myset.add(b4);
    myset.add(b3);
    myset.add(b1);

    Iterator<Book> itr=myset.iterator();
    while(itr.hasNext()) {
    System.out.println(itr.next());
	}




    
	}

}
