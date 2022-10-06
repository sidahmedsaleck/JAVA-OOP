import java.util.Scanner;

public class tp1ex03q1 {
    public static void main(String args[])
    {
        int[] tab = {12,15,13,8,9,13,14};

        Scanner cmd = new Scanner(System.in);
        System.out.println("- DONNER UNE VALEUR A RECHERCHER: ");
        int n = cmd.nextInt();

        boolean x=false;

        for (int i = 0; i < tab.length; i++) 
        {
            if( tab[i] == n)
            {
                x=true;
                break;
            }
        }

        if( x == true)
        {
            System.out.println(n+" existe dans le tab ");
        }
        else
        {
            System.out.println(n+" n'existe pas dans le tab ");
        }
    
    cmd.close();
    }
}
