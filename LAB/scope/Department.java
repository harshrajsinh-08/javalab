package scope;

public class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Department: " + name);
        System.out.println();
    }
}
