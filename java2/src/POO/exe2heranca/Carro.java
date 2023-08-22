package POO.exe2heranca;

public class Carro extends Veiculo{
    int numeroPortas;

    
    void addPortas(int nPortas){
        this.numeroPortas = nPortas;
    }

    @Override
    void displayInfo() {
        // TODO Auto-generated method stub
        System.out.println(numeroPortas);
        super.displayInfo();
    }

    
}
