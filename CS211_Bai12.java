import java.util.Scanner;

public class CS211_Bai12 {
    public static void main(String[] args) {
        String[] zodiacAnimals = {"Than", "Dau", "Tuat", "Hoi", "Ty", "Suu", "Dan", "Meo", "Thin", "Ty", "Ngo", "Mui"};
        String[] heavenlyStems = {"Canh", "Tan", "Nham", "Quy", "Giap", "At", "Binh", "Dinh", "Mau", "Ky"};
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhap nam sinh: ");
        int birthYear = kb.nextInt();
        switch(birthYear % 12) {
                case 0: System.out.print(heavenlyStems[birthYear % 10] + " " + zodiacAnimals[birthYear % 12]);
                        break;
                case 1: System.out.print(heavenlyStems[birthYear % 10] + " " + zodiacAnimals[birthYear % 12]);
                        break;
                case 2: System.out.print(heavenlyStems[birthYear % 10] + " " + zodiacAnimals[birthYear % 12]);
                        break;
                case 3: System.out.print(heavenlyStems[birthYear % 10] + " " + zodiacAnimals[birthYear % 12]);
                        break;
                case 4: System.out.print(heavenlyStems[birthYear % 10] + " " + zodiacAnimals[birthYear % 12]);
                        break;
                case 5: System.out.print(heavenlyStems[birthYear % 10] + " " + zodiacAnimals[birthYear % 12]);
                        break;
                case 6: System.out.print(heavenlyStems[birthYear % 10] + " " + zodiacAnimals[birthYear % 12]);
                        break;
                case 7: System.out.print(heavenlyStems[birthYear % 10] + " " + zodiacAnimals[birthYear % 12]);
                        break;
                case 8: System.out.print(heavenlyStems[birthYear % 10] + " " + zodiacAnimals[birthYear % 12]);
                        break;
                case 9: System.out.print(heavenlyStems[birthYear % 10] + " " + zodiacAnimals[birthYear % 12]);
                        break;
                case 10: System.out.print(heavenlyStems[birthYear % 10] + " " + zodiacAnimals[birthYear % 12]);
                        break;
                case 11: System.out.print(heavenlyStems[birthYear % 10] + " " + zodiacAnimals[birthYear % 12]);
                        break;
        }
        kb.close();
    }
}