package POO.exe3polimorfismo;

public abstract class Comida{
    private double peso;

    public Comida(double peso){
        setPeso(peso);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}