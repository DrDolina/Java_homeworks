public class Employee {
    private String name;
    private String position;
    private String email;
    private int telephone;
    private int age;

    // Конструктор
    public Employee(String name, String position, String email, int telephone, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public int getTelephone() {
        return telephone;
    }

    public int getAge() {
        return age;
    }

}