package atividadefigura;

public class triangulo extends figura{
    private double base;
    private double altura;

    public void setBase(double base) {
        this.base = base;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public triangulo(){
    }

    public triangulo(double base, double altura) {
        super();
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area(){
        return base * altura;
    }

    @Override
    public String toString(){
        return "Triângulo [base =" + base + "altura: " + altura + "cor: " + super.getCor();
    }
}
