package codsoft;

public class mainn 
{
    public static void main(String[] args) 
    {
        Question[] questions = {
            new Question("What is the capital of France?",
                new String[]{"Berlin", "Paris", "Madrid", "Rome"},
                "B", 10),
            new Question("Which country has highest population?",
            	new String[] {"China","Russia","India","America" },"C",10),
            new Question("Which country is largest country ?",
                	new String[] {"China","Russia","India","America" },"B",10),
            new Question("Which planet has the most moons? ",
            		new String[] {"Saturn","Earth","Neptune","Mercury"},"A",10)
        };

        quiz q = new quiz(questions);
        q.startQuiz();
    }
}
