class InheritanceDemo { // Parent class
    int rollno = 10;
    String name = "Anitha";
}

class ChildInheritance extends InheritanceDemo { // Child class
    int marks = 80;

    void display() {
        System.out.println("Roll no.: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        ChildInheritance ob = new ChildInheritance();
        ob.display();
    }
}