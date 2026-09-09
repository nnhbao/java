import java.util.*; 
class Dog {
    String name, color;
    int year;
    Dog (String n, String c, int y) {
        name = n;
        color = c;
        year = y;
    }
    void chao () {
        System.out.println("Xin chao, toi la " + name + ", mau " + color + ", tuoi " + year);
    }
}
public class CS211_Bai20 {
    public static void main(String[] args) {
        Dog d1 = new Dog("Bingo", "vang", 2);
        Dog d2 = new Dog("Lucky", "den", 3);
        Dog d3 = new Dog("Max", "trang", 1);
        d1.chao();
        d2.chao();
        d3.chao();
    }
}