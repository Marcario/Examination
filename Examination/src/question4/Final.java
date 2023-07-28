package question4;

class Person {
    private int age;
    private double salary;

    // Constructor
    public Person(int age, double salary) {
        this.age = age;
        this.salary = salary;
    }

    // Getter methods
    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    // Setter methods
    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class Final {
    public static void main(String[] args) {
        // Create a Person object
        Person person1 = new Person(30, 50000.0);

        // Get and print the initial values
        System.out.println("Initial Age: " + person1.getAge());
        System.out.println("Initial Salary: " + person1.getSalary());

        // Set new values using setter methods
        person1.setAge(35);
        person1.setSalary(60000.0);

        // Get and print the updated values
        System.out.println("Updated Age: " + person1.getAge());
        System.out.println("Updated Salary: " + person1.getSalary());
    }
}


