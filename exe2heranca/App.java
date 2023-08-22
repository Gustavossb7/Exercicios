package exe2heranca;

public class App{

public static void main(String[] args) {
    Carro c = new Carro();
    c.addPortas(5);
    c.addAno(2000);
    c.addMarca("seila");
    c.addModelo("Civic");
    c.displayInfo();

    Moto m = new Moto();
    m.addAno(2005);
    m.addMarca("yamaha");
    m.addModelo("Suzuki");
    m.addSideCar(3>2);
    m.displayInfo();

}
}