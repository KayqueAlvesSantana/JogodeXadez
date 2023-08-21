package atividadefigura;

public class circulo extends figura{
    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public circulo(){
    }

    public circulo(String cor, double raio){
        super(cor);
        this.raio = raio;
    }

    public double diametro(){
        return raio * 2;
    }

    @Override
    public double area(){
        return raio * 3.14 * 2;
    }

    @Override
    public String toString(){
        return "Circulo: Cor: " + super.getCor() + "raio: " + raio;
    }

}
