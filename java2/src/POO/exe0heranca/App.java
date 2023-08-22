package POO.exe0heranca;
public class App {
    public static void main(String[] args) throws Exception {
        /*Motor m1 = new Motor();
        m1.velocidade = 5;
        m1.modelo = "ftx890";
        m1.tamanho = 60;
        System.out.println("Velocidade " + m1.velocidade);
        System.out.println("Modelo " + m1.modelo);
        System.out.println("Tamanho " + m1.tamanho);
        m1.acelerar(20);
        System.out.println(m1.velocidade);*/

        Carro ferrari = new Carro();
        ferrari.acelerar(30);
        System.out.println(ferrari.velocidade);

        Moto moto = new Moto();
        moto.acelerar(10);
        moto.frear(5);
        //System.out.print(moto.frear(5));
        System.out.print(moto.velocidade);
    }
}
