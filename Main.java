
class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int age;

    public Employee(String fullName, String position, String email, String phone, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    public String getFullName() { return fullName; }
    public String getPosition() { return position; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
    public int getAge() { return age; }

    public void setPosition(String position) { this.position = position; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone(String phone) { this.phone = phone; }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public void printInfo() {
        System.out.println("ПІБ: " + fullName + ", Посада: " + position
                + ", Email: " + email + ", Телефон: " + phone + ", Вік: " + age);
    }
}

class Car {
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("Автомобіль запущено");
    }

    private void startElectricity() {
        System.out.println("Електрика запущена");
    }

    private void startCommand() {
        System.out.println("Команда запуску виконана");
    }

    private void startFuelSystem() {
        System.out.println("Паливна система запущена");
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("Іваненко Іван Іванович", "Розробник",
                "ivan@example.com", "+380501234567", 30);
        e.printInfo();

        Car car = new Car();
        car.start();
    }
}