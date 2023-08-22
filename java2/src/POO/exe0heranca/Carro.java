package POO.exe0heranca;
public class Carro extends Motor{
    @Override
    int acelerar(int valor) {
        // TODO Auto-generated method stub
        valor = valor*5;
        return super.acelerar(valor);
    }
}
