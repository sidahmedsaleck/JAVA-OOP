
import java.util.Scanner;

public class tp1ex03q4 {
    public static void main(String args[])
    {
        int[] tab = {12,15,13,8,9,13,14};

        Scanner cmd = new Scanner(System.in);
        System.out.println("- DONNER les deux indice : ");

        int index1 = cmd.nextInt();
        int index2 =cmd.nextInt();

        //avant
        for (int index = 0; index < tab.length; index++) {
            System.out.print(tab[index] +"\t");
        }
        System.out.print("\n");

        if ( index1 < tab.length && index2 < tab.length )
        {
            int tmp;
            tmp=tab[index1];
            tab[index1]= tab[index2];
            tab[index2]=tmp;
        }

        //apres
        for (int index = 0; index < tab.length; index++) {
            System.out.print(tab[index] +"\t");
        }
        
    
    cmd.close();
    }
}

