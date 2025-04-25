/* encapsulamento */
// public
// private
// protected
// package
public class Aluno { //classe

    //variáveis = atributos
    //características
    private String nome; //atributo do tipo Texto
    private int idade; // atributo do tipo Número
    private boolean temFaculdade; // atributo do tipo Booleano (0 e 1)

    public Aluno(){

    }
    public Aluno(String nome,int idade,boolean temFaculdade){
        this.nome = nome;
        this.idade = idade;
        this.temFaculdade = temFaculdade;
    }
    public String getNome(){ //método para pegar o nome
        return nome;
    }
    public int getIdade(){ //método para pegar a idade
        return idade;
    }
    public boolean getTemFaculdade(){ //método para pegar temFaculdade
        return temFaculdade;
    }
    // classes Wrappers
    /*
     * Considerando a explicação do professor:
     * tipo primitivo x classes wrappers
     * 
     * Você tem que descobrir quantos alunos
     * tem faculdade (sim ou não)
     * temFaculdade
     * sim/não - 0 ou 1
     * Como declarar um atributo booleano?
     * 2 minutos
     */


}
