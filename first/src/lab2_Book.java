import java.util.Scanner;

class Book{
    String title;
    int pages;
    int book_id;

    public Book(String title,int pages,int book_id){
        this.title=title;
        this.pages=pages;
        this.book_id=book_id;
    }
    public String getTitle(){
        return title;
    }

    public int getPages(){
        return pages;
    }

    public int getBook_id(){
        return book_id;
    }
}

class Author{
    String name;
    int Auth_id;

    public Author(String name,int Auth_id){
        this.name=name;
        this.Auth_id=Auth_id;
    }
    public String getName(){
        return name;
    }
    public int getAuth_id(){
        return Auth_id;
    }

}

class Bookstore{
    int shopNo;
    public Bookstore(int shopNo){
        this.shopNo=shopNo;
    }
    public int getShopNo(){
        return shopNo;
    }

}
public class lab2_Book {
    public static void main(String[] args) {

        Book B1=new Book("harry potter and The Prisoner of Azkaban",500,1);
        System.out.printf("Book details:\nTitle: %s\nPages: %d\nBook id: %d\n",B1.getTitle(),B1.getPages(),B1.getBook_id());
        Author A1=new Author("J K Rowling",101);
        Bookstore BS1= new Bookstore(10);
        System.out.printf("Author: %s\nAuthor id: %d\nShop Number: %d",A1.getName(),A1.getAuth_id(),BS1.getShopNo());

    }
}
