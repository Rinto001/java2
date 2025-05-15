import java.util.Scanner;

class Publisher {
    String pubName;
    
    Publisher(String pub) {
        pubName = pub;
    }
}

class Book extends Publisher {
    String book;
    
    Book(String pub, String bk) {
        super(pub);
        book = bk;
    }
}

class Literature extends Book {
    String category;
    
    Literature(String pub, String bk, String ctgry) {
        super(pub, bk);
        category = ctgry;
    }
    
    void display() {
        System.out.println("Publisher: " + pubName);
        System.out.println("Book: " + book);
        System.out.println("Category: " + category);
    }
}

class Fiction extends Book {
    String category;
    
    Fiction(String pub, String bk, String ctgry) {
        super(pub, bk);
        category = ctgry;
    }
    
    void display() {
        System.out.println("Publisher: " + pubName);
        System.out.println("Book: " + book);
        System.out.println("Category: " + category);
    }
}

public class BookDetails {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter Literature Book Details:");
        System.out.print("Book name: ");
        String b = s.nextLine();
        System.out.print("Publisher: ");
        String pub = s.nextLine();
        System.out.print("Category: ");
        String c = s.nextLine();
        Literature ob1 = new Literature(pub, b, c);
        
        System.out.println("Enter Fiction Book Details:");
        System.out.print("Book name: ");
        String b1 = s.nextLine();
        System.out.print("Publisher: ");
        String pt = s.nextLine();
        System.out.print("Category: ");
        String c1 = s.nextLine();
        Fiction ob2 = new Fiction(pt, b1, c1);
        
        System.out.println("\n*** Literature Book ***");
        ob1.display();
        
        System.out.println("\n*** Fiction Book ***");
        ob2.display();
        
        s.close();
    }
}
