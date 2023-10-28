/*Класс Phone.
Создайте класс Phone, который содержит переменные number, model и weight.
        Создайте три экземпляра этого класса.
        Выведите на консоль значения их переменных.
        Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
        Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
        Вызвать эти методы для каждого из объектов.
        Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
        Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
        Добавить конструктор без параметров.*/

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this(number, model, 0.0);
    }


    public Phone() {
        this("", "", 0.0);
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public String getNumber() {
        return number;
    }
    public static void main(String[] args) {

        Phone phone1 = new Phone("123-456-7890", "iPhone X", 0.4);
        Phone phone2 = new Phone("987-654-3210", "Samsung Galaxy");
        Phone phone3 = new Phone();

        System.out.println("Phone 1: Number - " + phone1.getNumber() + ", Model - " + phone1.model + ", Weight - " + phone1.weight);
        System.out.println("Phone 2: Number - " + phone2.getNumber() + ", Model - " + phone2.model + ", Weight - " + phone2.weight);
        System.out.println("Phone 3: Number - " + phone3.getNumber() + ", Model - " + phone3.model + ", Weight - " + phone3.weight);

        phone1.receiveCall("Alice");
        phone2.receiveCall("Bob");
        phone3.receiveCall("Charlie");
    }
}