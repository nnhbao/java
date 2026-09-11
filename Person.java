import java.util.*;

public class Person {
    String ten, que;
    int ns;
    void in() {
        System.out.println("Ten: " + ten + " Que: " + que + " Nam sinh: " + ns);
    }
    void nhap() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        ten = kb.nextLine();
        System.out.print("Nhap que: ");
        que = kb.nextLine();
        System.out.print("Nhap nam sinh: ");
        ns = kb.nextInt();
    }
    Person(String t, String q, int n) {
        ten = t;
        que = q;
        ns = n;
    }
    Person() {
        ten = "Chua xac dinh";
        que = "Chua xac dinh";
        ns = 0;
    }
    Person(String t) {
        ten = t;
    }
    String getque() {return que;}
    void sosanhque(Person b) {
        if (this.getque().compareTo(b.getque()) == 0) {
            System.out.println("Hai nguoi cung que");
        } else {
            System.out.println("Hai nguoi khac que");
        }
    }
    public static void main(String[] args) {
        System.out.println("Nhap thong tin cho Person 1:");
        Person p1 = new Person("Rwp", "Hanoi", 1990);
        p1.in();
        Person p2 = new Person("rewa", "Hanoi", 1992);
        p2.in();
        Person p3 = new Person();
        p3.nhap();
        p3.in();
        p1.sosanhque(p2);
        p2.sosanhque(p3);
    }
}