class A {
    void f() throws ArithmeticException,InterruptedException {
        try{
        throw new ArithmeticException();
        throw new InterruptedException("BYE");
    }
    catch(Exception e){
        System.out.println(e);
    }
}
}

public class hell extends A {
    public static void main(String[] args) {
        A obj = new A();
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
