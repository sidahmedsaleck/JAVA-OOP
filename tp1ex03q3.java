
import java.util.Scanner;

public class tp1ex03q3 {
    public static void main(String args[])
    {
        int[] tab = {12,15,13,8,9,13,14};

        Scanner cmd = new Scanner(System.in);
        System.out.println("- DONNER UNE VALEUR A RECHERCHER: ");
        int n = cmd.nextInt();

        int index=-1;

        for (int i = 0; i < tab.length; i++) 
        {
            if( tab[i] == n)
            {
                index=i;
                break;
            }
        }

        if( index != -1)
        {
            System.out.println(n+" existe a l'indice: "+index);
        }
        else
        {
            System.out.println(n+" n'existe pas");
        }
    
    cmd.close();
    }
}

