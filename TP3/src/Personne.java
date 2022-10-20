import java.util.Date;

public class Personne {
    String nom , prenom , civil;
    char sexe ;
    int birth;
    boolean conjoint;

    Personne(String nom,String prenom, char sexe, String civil, int birth)
    {
        this.nom=nom;
        this.prenom=prenom;
        this.sexe=sexe;
        this.civil=civil;
        this.birth=birth;
        if (this.civil.toLowerCase() == "marie") {conjoint=true;}
        else {conjoint=false;}
    }

    public void retourneInfos(){
        if ( this.sexe == 'M' ) 
        { System.out.println("M."+nom+" "+ prenom + " est ne en "+ birth+", il est "+civil); }
        else if (this.conjoint == true)
        { System.out.println("Mme."+nom+" "+ prenom + " est ne en "+ birth+", il est "+civil); }
        else
        { System.out.println("Mlle."+nom+" "+ prenom + " est ne en "+ birth+", il est "+civil); }
    }

    public int age(){
        Date today = new Date(birth);
        int year=Integer.valueOf(String.format("%1$tY",today));
        int age =year - this.birth;
        return age;
    }

    public void marier(Personne p)
    {
        if (this.conjoint==false && p.conjoint==false && this.sexe!=p.sexe){
            this.civil="marie";
            p.civil="marie";

            this.conjoint=true;
            p.conjoint=true;

            if (this.sexe=='M') {p.nom=this.nom;}
            else {this.nom = p.nom;}
        }
        else {System.out.println("mariage impossible");}
    }
}