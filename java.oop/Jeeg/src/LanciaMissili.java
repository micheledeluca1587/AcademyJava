public class LanciaMissili extends Arm {

    public LanciaMissili(String side) {
        super(side);
    }

    @Override
    public void attacca(){
        System.out.println("Ti lancio un missile dal braccio " + this.side);
    }

}
