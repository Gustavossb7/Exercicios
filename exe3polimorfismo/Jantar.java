package exe3polimorfismo;

public class Jantar{
    public static void main(String[] args) {
        Pessoa joao = new Pessoa(200.5);
        
        System.out.println(joao.getPeso());

        Comida c1 = new Arroz(0.2);
        Comida c2 = new Feijao(0.3);
        Comida c3 = new Sorvete(0.1);

        joao.comer(c1);
        joao.comer(c2);
        joao.comer(c3);
        System.out.println(joao.getPeso());

    }
}