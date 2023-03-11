import java.util.ArrayList;

public class MyThreadSynchronized extends Thread {
    @Override //переопределяем метод run() интерфейса Runnable
    public void run() {
        generalMethodWithSynchronized(); //вызываем метод главныйМетодССинхронизацией()
    }
    public synchronized void generalMethodWithSynchronized() { //обьявляем синхронизированный метод главныйМетодССинхронизацией()
        ArrayList<String> list = new ArrayList<>(); //создаем список
        list.add("I "); //добавляем в список строковый литерал
        list.add("really "); //добавляем в список строковый литерал
        list.add("like "); //добавляем в список строковый литерал
        list.add("coding!"); //добавляем в список строковый литерал
        printList(list); //вызываем метод печататьСписок(аргумент: наш список)

    }
    public synchronized void printList(ArrayList<String> list) { //обьявляем синхронизированный метод печататьСписок(параметр: список)
        for (String str : list) { //циклом для каждого проходимся по списку
            System.out.println(str + " - " + getName()); //печатаем каждый элемент списка + системное(автоматическое) имя потока
        }
    }
}