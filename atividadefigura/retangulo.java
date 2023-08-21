package atividadefigura;

public class retangulo extends figura{

    private double lado1;
    private double lado2;

    public retangulo(){
    }

    public retangulo(double lado1, double lado2, String cor){
        super(cor);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1(){
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado1(double lado1){
        this.lado1 = lado1;
    }

    public void setLado2(double lado2){
        this.lado2 = lado2;
    }

    @Override
    public double area(){
        return lado2 * lado1;
    }

    @Override
    public String toString(){
        return "Retangulo: Cor " + super.getCor() + "Lado 1 " + lado1 + "Lado 2" + lado2;
    }
}
