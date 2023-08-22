package POO.exe2heranca;

public class Moto extends Veiculo{
    Boolean hasSideCar;

    void addSideCar(Boolean valor){
        hasSideCar = valor;
    }

    @Override
    void displayInfo() {
        System.out.println(hasSideCar);
        super.displayInfo();
    }
    
}
