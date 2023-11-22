class A {
    void f() throws ArithmeticException {
        throw new ArithmeticException();
    }
}

public class Myclass extends A {
    public static void main(String[] args) {
        A obj = new Myclass();
        try {
            obj.f();
        } catch (ArithmeticException e) {
            System.out.println(e);
        } 
        catch (Exception e) {
            System.out.println(e);
            return;
        }
        throw new RuntimeException("Something wrong here");

}
}
