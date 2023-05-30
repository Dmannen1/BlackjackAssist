import java.util.Scanner;
public class BlackjackAssist
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Välkommen till Blackjack! Vad heter du?: ");
        String userNm = scan.nextLine();
        int Score = 0;
        System.out.println("Vad är värdet på första kortet?");
        int cdValue = scan.nextInt();

        int Card = Score + cdValue;

        System.out.println("Vad är värdet på det andra kortet?");
        int secValue = scan.nextInt();

        Card = Score + secValue;

        if(Card == 21)
        {
            System.out.println("Blackjack B)");
        } else if (Card >= 12 && Card <= 20)
        {
            System.out.println("Läskigt att dra kort nu är du ute på tunn is!");
        }

        if(Card >= 2 && Card <= 11)
        {
            System.out.println("Lugna puckar du kan dra kort");
        }
        else
        {
            System.out.print("Ajajaj du bustade");
        }



    }
}

