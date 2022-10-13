public class App {
    public static void main(String[] args) throws Exception {

        Compte c1= new Compte("Ahmed", 0);
        Compte c2= new Compte("Mohamed", 0);

        c1.deposer(500);
        c2.deposer(300);

        c1.retirer(100);
        c1.vierment(100, c2);

        c1.afficher();
        c2.afficher();
    }
}
