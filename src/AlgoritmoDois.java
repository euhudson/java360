public class AlgoritmoDois {
    void main(){
        //ENTRADA DE DADOS
        IO.println("Seja bem vindo ao portal java360!");
        String usuario = IO.readln("Qual o seu nome? ");
        IO.println("Olá " + usuario + ", Bem-vindo ao portal! ");
        //int estrelas = 0; /// int é do tipo primitivo (mais rapido, sem método)
        //Integer.parseInt(valor para conversão) estrelas = 0; /// o Integer é uma classe (Mais lento) Classes Wrappers.
        int estrelas = 0;
        IO.println("Quem criou o Java? ");
        IO.println("1 - James Gosling");
        IO.println("2 - Tiririca");
        IO.println("3 - Lula");
        IO.println("4 - Bolsonaro");
        int resp = Integer.parseInt(IO.readln("Digite o número: "));
        if (resp == 1){
            IO.println("Parabéns, você acertou! Ganhou uma estela.");
            estrelas = estrelas +1; // variável de inceremento
        } else {
            IO.println("Você errou! E não ganhou nenhuma estrela.");
        }
        IO.println("Você obteve " + estrelas + " estrelas. ");
    }
}
