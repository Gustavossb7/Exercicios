package POO.exe1heranca;

public class app {

    public static void main(String[] args) {
        
        Carro c1 = new Carro();
        c1 = new Ferrari();
        c1.acelerar();
        c1.acelerar();
        System.out.println(c1.velocidade);
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        System.out.println(c1.velocidade);

        c1 = new Civic();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        System.out.println(c1.velocidade);

    }
    
}
