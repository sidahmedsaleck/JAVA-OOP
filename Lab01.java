import java.util.Scanner;

public class Lab01{
    public static void main(String args[]){

        Scanner emplo = new Scanner(System.in);
        System.out.println("Nom: ");
        String nom = emplo.nextLine();
        System.out.println("age: ");
        int age = emplo.nextInt();
        System.out.println("salaire: ");
        double salaire = emplo.nextDouble();



        System.out.println("nom: "+ nom + " age:" +age + " salaire: "+salaire );
        
        
        emplo.close();
    }
}
