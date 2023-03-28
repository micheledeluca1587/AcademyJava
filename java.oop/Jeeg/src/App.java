public class App {
    public static void main(String[] args) throws Exception {


        Arm armDx = new Laser("Destro");
        Arm armSx = new LanciaMissili("Sinistro");
     
        Legs legs = new Legs();

        Jeeg jeeg = new Jeeg(armDx, armSx, legs);

        jeeg.muovitiInAvanti();
        jeeg.attacca();
        jeeg.muovitiIndietro();

        Jeeg jeeg2 = new Jeeg(new Trivella("Destro"), new Laser("Sinistro"), new Legs());
        jeeg2.muovitiInAvanti();
        jeeg2.attacca();
        jeeg2.muovitiIndietro();
    }
}
