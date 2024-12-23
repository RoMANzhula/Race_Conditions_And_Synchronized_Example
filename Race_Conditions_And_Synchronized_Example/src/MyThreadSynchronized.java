import java.util.ArrayList;

public class MyThreadSynchronized extends Thread {
    @Override //перевизначаємо метод run() інтерфейсу Runnable
    public void run() {
        generalMethodWithSynchronized(); //викликаємо метод generalMethodWithSynchronized()
    }
    public synchronized void generalMethodWithSynchronized() { //оголошуємо синхронізований метод generalMethodWithSynchronized()
        ArrayList<String> list = new ArrayList<>(); //створюємо список
        list.add("I "); //додаємо до списку рядковий літерал
        list.add("really "); //додаємо до списку рядковий літерал
        list.add("like "); //додаємо до списку рядковий літерал
        list.add("coding!"); //додаємо до списку рядковий літерал
        printList(list); //викликаємо метод printList(аргумент: наш список)

    }
    public synchronized void printList(ArrayList<String> list) { //оголошуємо синхронізований метод printList(параметр: список)
        for (String str : list) { //циклом для кожного проходимося по списку
            System.out.println(str + " - " + getName()); //виводимо кожен елемент списку + системне (автоматичне) ім'я потоку
        }
    }
}
