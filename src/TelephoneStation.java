public class TelephoneStation {
    private String name; // Название телефонной станции
    private int capacity; // Вместимость телефонной станции
    private int numberOfConnectedPhones; // Количество подключенных телефонов
    private double totalCallDuration; // Общая длительность звонков
    private double averageCallDuration; // Средняя длительность звонков

    // Конструктор
    public TelephoneStation(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.numberOfConnectedPhones = 0;
        this.totalCallDuration = 0;
        this.averageCallDuration = 0.0;
    }

    // Геттеры и сеттеры для свойств
    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getNumberOfConnectedPhones() {
        return numberOfConnectedPhones;
    }

    public double getTotalCallDuration() {
        return totalCallDuration;
    }

    public double getAverageCallDuration() {
        return averageCallDuration;
    }
}