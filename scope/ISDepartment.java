package scope;
public class ISDepartment {
    private String name;

    public ISDepartment(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("IS Department: " + name);
        System.out.println();
    }
}