package POO.exe1heranca;

public class Carro {
    int velocidade = 0;

    void acelerar(){
        this.velocidade = velocidade + 10;
    }

    void frear(){
        if (velocidade >= 10){
        this.velocidade = velocidade - 10;
        }
        else{
            this.velocidade = 0;
        }
    }
}
