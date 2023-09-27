public class Question5 {
    public static void main(String args[]) {
        String question = "Which course have you opted?";
        System.out.print(Answer.submit(question));
    }
}

class Answer {
    static String answer = "Programming with Java";

    static String submit(String question) {
        return ("The answer to the guestion, " + question + " is " + answer);
    }
}
