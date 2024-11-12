public class Retangulo extends Quadrilatero {
    private double base, altura;

    public Retangulo(double base, double altura) {
        super(base, altura, base, altura);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "Retângulo: base=" + base + ", altura=" + altura;
    }
}
