public class Trivella extends Arm {
    public Trivella(String side) {
        super(side);
    }

    @Override
    public void attacca(){
        System.out.println("Ti buco con la trivella del braccio " + this.side);
    }
}
