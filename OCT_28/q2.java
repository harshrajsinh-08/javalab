class MyException extends Exception {
    public MyException(int param) {
        super(String.valueOf(param));
    }
}

public class q2 {
    public static void main(String[] args) {
        try {
            int numerator = 10;
            int denominator = 0;

            if (denominator == 0) {
                throw new ArithmeticException();
            }

            int result = numerator / denominator;

            String numericString = "exceptionhandlingtime";
            int numericValue = Integer.parseInt(numericString);

            int index = 15; // This index is out of bounds
            String sampleString = "Hello, World!";
            if (index < 0 || index >= sampleString.length()) {
                throw new StringIndexOutOfBoundsException();
            }

            int[] arr = { 1, 2, 3 };
            int arrayIndex = 5; // This index is out of bounds
            if (arrayIndex < 0 || arrayIndex >= arr.length) {
                throw new ArrayIndexOutOfBoundsException();
            }

            int customExceptionValue = 117; // You can set your own parameter value
            if (customExceptionValue == 117) {
                throw new MyException(customExceptionValue);
            }

            // Your code logic here

        } catch (ArithmeticException e) {
            System.out.println("Invalid division");
        } catch (NumberFormatException e) {
            System.out.println("Format mismatch");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index is invalid");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is invalid");
        } catch (MyException e) {
            System.out.println("MyException[" + e.getMessage() + "]");
        } catch (Exception e) {
            System.out.println("Exception encountered");
        } finally {
            System.out.println("Exception Handling Completed");
        }
    }
}
