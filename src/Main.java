import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        String decision = null;
        Scanner key = new Scanner(System.in);
        do
        {
            String word = null;
            System.out.println("Type any word:");
            word = key.next();
            for(int i = word.length(); i > 0; i--)
            {
                System.out.print(word.charAt(i - 1));
            }
            System.out.println("\nType y to repeat the operation or else I am turning off the machine");
            decision = key.next();
        }
        while(decision.equals("y"));
    }
}