public class Rettangolo extends Forma{
    private double base;
    private double altezza;
    private identifForma forma;
    public Rettangolo(double base, double altezza, identifForma forma){
        this.altezza=altezza;
        this.base=base;
        this.forma=forma;
    }
    public double calcolaArea(){
        return base * altezza;
    }
    @Override
    public String toString() {
        return "Rettangolo {" +
                "base=" + base +
                ", altezza=" + altezza +
                ", con forma =" + forma;
    }
}
