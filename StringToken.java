import java.util.Scanner;

public class StringToken {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String[] tokens= s.split("[^a-zA-Z]");
        int numTokens = 0;
        for(int i=0; i<tokens.length; i++)
        if(tokens[i].length()>0)
        numTokens++;
        System.out.println(numTokens);
        for(int i=0; i<tokens.length;i++)
        if(tokens[i].length()>0)
        System.out.println(tokens[i]);
    }
    
}
