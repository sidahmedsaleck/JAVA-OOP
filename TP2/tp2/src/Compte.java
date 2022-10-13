public class Compte {

    String nom;
    int solde = 0;

    Compte(String nom, int solde){
        this.nom=nom;
        this.solde=solde;
    }

    public void deposer(int n){
        this.solde+=n;
    }
    
    public void retirer(int a){
        this.solde-=a;
    }

    public void vierment(int amount , Compte c){
        this.retirer(amount);
        c.deposer(amount);
    }

    public void afficher(){
        System.out.println("le compte du "+this.nom+" a pour solde : "+this.solde+" Dt");
    }

}