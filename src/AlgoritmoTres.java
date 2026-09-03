

public class AlgoritmoTres {
    
    void main() {
        int nota1,nota2,nota3;
        // média é real (Double)
        double media;
        // operadores: + , - , * , / , %
        //  ENTRADA das Notas do Alunos
        nota1 = Integer.parseInt(IO.readln("Digite a primeira notas: "));
        nota2 = Integer.parseInt(IO.readln("Digite a primeira notas: "));
        nota3 = Integer.parseInt(IO.readln("Digite a primeira notas: "));

        // SOMAS das Notas
        int soma = nota1 + nota2 + nota3;
        // MÉDIA das Notas
        media = soma / 3.0;
        // SAÍDA das Notas, SOMA e MEDIA
        IO.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3);
        IO.println("Soma: " + soma);
        IO.println("Média: " + media);
        if (media >= 7){
            IO.println("Parabéns! Você foi aprovado. ");
        } else {
            IO.println("Você não foi aprovado, estude e tente outra vez.");
        }
    }
}
