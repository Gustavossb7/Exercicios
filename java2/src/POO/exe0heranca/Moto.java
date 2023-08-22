package POO.exe0heranca;
public class Moto extends Motor {
    @Override
    int acelerar(int valor) {
        // TODO Auto-generated method stub
        valor = valor *2;
        return super.acelerar(valor);
    }

    int frear(int valor){
        velocidade = velocidade - valor;
        return super.velocidade;
    }
}
