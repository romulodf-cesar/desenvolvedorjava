import java.util.Scanner;//importar uma classe externa

public class AppEscola { //PascalCasing
    // main
    //public = publico
    // static = da classe
    // void = retorno vazio
    // main = principal
    // String args[] = parâmetro inicial
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o seu  nome");
        String nome = teclado.nextLine();
        System.out.println("Qual a sua idade");
        int idade = teclado.nextInt();
        System.out.println("Tem faculdade: 0-não e 1-sim");
        boolean temFaculdade = teclado.nextBoolean();
        //método principal
        //Classe objeto = new Construtor(parametros);
        Aluno aluno = new Aluno(nome,idade,temFaculdade);
        System.out.println(aluno.getNome());
        System.out.println(aluno.getIdade());
        System.out.println(aluno.getTemFaculdade());
        //Desafio
        /*
         * Implementar uma interface com usuário
         * Scanner.
         */

    }
  
}
