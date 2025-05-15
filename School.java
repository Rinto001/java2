
import java.util.Scanner;

class Sports {
    String sport;
    int rating;

    Sports(String sp, int rt) {
        sport = sp;
        rating = rt;
    }
}

class Student extends Sports {
    String grade;
    double overall_per;

    Student(String sp, int rt, String gd, double per) {
        super(sp, rt);
        grade = gd;
        overall_per = per;
    }
}

class Result extends Student {
    Result(String sp, int rt, String gd, double per) {
        super(sp, rt, gd, per);
    }

    void display() {
        System.out.println("\n===== Student Details =====");
        System.out.println("\nSports Details:");
        System.out.println("-----------------------");
        System.out.println("Sport: " + sport);
        System.out.println("Rating: " + rating + "/10");

        System.out.println("\nAcademic Details:");
        System.out.println("---------------------------");
        System.out.println("Academic Grade: " + grade);
        System.out.println("Overall Percentage: " + overall_per + "%");
    }
}

class School {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sports details of the student:");
        System.out.print("Sport: ");
        sc.nextLine(); 
        String s = sc.nextLine(); 
        System.out.print("Sport Rating (out of 10): ");
        int r = sc.nextInt();

        System.out.println("\nEnter the academic details of the student:");
        System.out.print("Academic Grade (A-D): ");
        String g = sc.next();
        System.out.print("Overall Percentage: ");
        double p = sc.nextDouble();

        sc.close();

        Result obj = new Result(s, r, g, p);
        obj.display();
    }
}