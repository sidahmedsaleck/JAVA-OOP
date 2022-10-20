
public class App {
    public static void main(String[] args) throws Exception {
        
        Personne p1=new Personne("ABIDI", "Ali",'M', "celibataire", 1975);
        Personne p2=new Personne("AMRI", "Sarra", 'F', "marie", 1970);
        Personne p3=new Personne("ALLANI", "Wassila", 'F', "celibataire", 1970);

        p1.retourneInfos();
        p2.retourneInfos();
        p3.retourneInfos();

        p1.marier(p2);
        p1.marier(p3);
        p1.retourneInfos();

        

}

}