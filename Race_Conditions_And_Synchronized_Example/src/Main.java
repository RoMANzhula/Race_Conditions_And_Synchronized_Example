import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Якщо ви хочете побачити синхронізований метод - введіть Y, інакше - N");
        Scanner scanner = new Scanner(System.in); //зчитуємо дані з клавіатури
        String str = scanner.nextLine().toLowerCase(); //створюємо змінну-посилання, у яку кладемо зчитаний
        //рядок із клавіатури та переводимо його в нижній регістр
        if (str.equals("y")) { //якщо зчитаний рядок із клавіатури дорівнює "y" (тобто ми хочемо побачити роботу
            //синхронізованого методу, то
            for (int i = 0; i < 7; i++) { //7 разів
                MyThreadSynchronized myThreadSynchronized = new MyThreadSynchronized(); //створюємо новий об'єкт
                //класу MyThreadSynchronized
                myThreadSynchronized.start(); //запустити потік
            }
        } else if (str.equals("n")) { //якщо зчитаний рядок із клавіатури дорівнює "n" (тобто ми хочемо побачити роботу
            //НЕ синхронізованого методу, то
            for (int i = 0; i < 7; i++) { //7 разів
                MyThreadNotSynchronized myThreadNotSynchronized = new MyThreadNotSynchronized(); //створюємо новий об'єкт
                //класу MyThreadNotSynchronized
                myThreadNotSynchronized.start(); //запустити потік
            }
        }
    }
}
