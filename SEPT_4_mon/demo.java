package SEPT_4_mon;
public class demo{
    public static void main(String[] args) {
        String question = "which course have you opted? ";
        System.out.println(Answer.submit(question));
    }


}
class Answer{
    static String answer = "programming with java";
    static String submit(String question){
        return("the answer to the question is , "+question+ " is "+answer);
    }
}