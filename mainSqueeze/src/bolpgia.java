import java.util.*;
public class bolpgia {
    public static void game (String secret, String guess){
        int bolCount = 0;
        int pgCount = 0;
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i)==guess.charAt(i))
                bolCount++;
            else if (secret.indexOf(guess.charAt(i))>-1)
                pgCount++;
        }
        if (bolCount>0) {
            for (int i = 0; i < bolCount; i++)
                System.out.println("בול");
        }
        if (pgCount > 0) {
            for (int i = 0; i < pgCount; i++){
                System.out.println("פגיעה");
            }
        }
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String secret = reader.next();
        String guess = reader.next();
        game(secret, guess);
    }
}

