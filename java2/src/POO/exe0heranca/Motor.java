package POO.exe0heranca;
public class Motor {
    int velocidade;
    int tamanho = 60;
    String modelo = "476-fxt";

    int acelerar(int valor){
        this.velocidade = velocidade + valor;
        return velocidade;
    }


}
