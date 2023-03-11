import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("If you want to see Synchronized method - please enter Y, else - N");
        Scanner scanner = new Scanner(System.in); //читіваем данные с клавиатуры
        String str = scanner.nextLine().toLowerCase(); //создаем ссыл.переменную, в кот.-ю кладем считанную
        //строку с клавиатуры и приводим ее к нижнему регистру
        if (str.equals("y")) { //если считанная строка с клавиатуры будет равна у (т.е. мы хотим увидеть работу
            // Синхронизированного метода, то
            for (int i = 0; i < 7; i++) { //7 раз
                MyThreadSynchronized myThreadSynchronized = new MyThreadSynchronized(); //создаем новый обьект
                //класса МойПотокСинхронизирован
                myThreadSynchronized.start(); //запустить поток
            }
        } else if (str.equals("n")) { //если считанная строка с клавиатуры будет равна "n" (т.е. мы хотим увидеть работу
            // НЕ Синхронизированного метода, то
            for (int i = 0; i < 7; i++) { //7 раз
                MyThreadNotSynchronized myThreadNotSynchronized = new MyThreadNotSynchronized(); //создаем новый обьект
                //класса МойПотокНеСинхронизирован
                myThreadNotSynchronized.start(); //запустить поток
            }
        }
    }
}