import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Aluno> alunosProgramando = new ArrayList<>();
        alunosProgramando.add(new Aluno(1,"Sofía"));
        alunosProgramando.add(new Aluno(2,"Rodolfo"));
        /*alunosProgramando.add("Rodolfo");
        alunosProgramando.add("Sofía");
        alunosProgramando.add("Lisandro");
        alunosProgramando.add("Patricia");
        alunosProgramando.add("Alicia");*/

        List<Aluno> alunosPreVestibular = new ArrayList<>();
        alunosPreVestibular.add(new Aluno(1,"Sofía"));
        alunosPreVestibular.add(new Aluno(2,"Romina"));
       /* alunosPreVestibular.add("Sofía");
        alunosPreVestibular.add("Romina");
        alunosPreVestibular.add("Samanta");
        alunosPreVestibular.add("Helena");
        alunosPreVestibular.add("Jaime");*/

        Set<Aluno> alunosIFSP = new HashSet<>();
        for(Aluno aluno : alunosProgramando){
            alunosIFSP.add(aluno);
        }
        for(Aluno aluno : alunosPreVestibular){
            alunosIFSP.add(aluno);
        }
        for(Aluno aluno : alunosIFSP){
            System.out.println(aluno.getNome());
        }

       /* for(String nome: alunosProgramando){
            alunosIFSP.add(nome);
        }

        for(String nome: alunosPreVestibular){
            alunosIFSP.add(nome);
        }

        for(String nome: alunosIFSP){
            System.out.println(nome);
        }*/
    }
}