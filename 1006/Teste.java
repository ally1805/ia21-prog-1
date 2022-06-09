import Seres.Aluno;

public class Teste {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
    
        aluno1.nome = "Ally";
        aluno1.idade = 17;
        aluno1.matricula = "2021311463";

        System.out.println("nome: " + aluno1.nome);
        System.out.println("idade: " + aluno1.idade);
        System.out.println("matricula: " + aluno1.matricula);
    }
}