public class Triangolo extends Forma{
    private double base;
    private double altezza;
    private identifForma forma;
    public Triangolo(double base, double altezza, identifForma forma){
        this.altezza=altezza;
        this.base=base;
        this.forma=forma;
    }
    public double calcolaArea(){
        return (base * altezza) / 2;
    }
    @Override
    public String toString() {
        return "Triangolo {" +
                "base=" + base +
                ", altezza=" + altezza +
                ", con forma =" + forma;
    }
}
