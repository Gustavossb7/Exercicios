package POO.exe2heranca;

public class Veiculo {
    String marca;
    String modelo;
    int ano;

    void addMarca(String marca){
        this.marca = marca;
    }

    void addModelo(String modelo){
        this.modelo = modelo;
    }

    void addAno(int ano){
        this.ano = ano;
    }
    

    void displayInfo(){
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(ano);
    }
}


