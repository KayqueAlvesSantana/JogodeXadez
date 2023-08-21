package atividadefigura;
public abstract class figura {

     String cor;

    public figura() {
    }

    public figura(String cor) {
        super();
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public abstract double area();
    @Override
    public String toString(){
        return "Figura: Cor: " + cor;
    }
}