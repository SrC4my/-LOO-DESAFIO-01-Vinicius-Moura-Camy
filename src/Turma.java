import java.util.ArrayList;

public class Turma {
    private String nomeTurma;
    private String codigoTurma;
    private String professor;
    private ArrayList<Aluno> alunos;

    
    public Turma(String nomeTurma, String codigoTurma, String professor) {
        this.nomeTurma = nomeTurma;
        this.codigoTurma = codigoTurma;
        this.professor = professor;
        this.alunos = new ArrayList<>();
    }

    
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public void listarAlunos() {
        System.out.println("Alunos da Turma " + nomeTurma + ":");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }
    }

   
    public String getNomeTurma() {
        return nomeTurma;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public String getCodigoTurma() {
        return codigoTurma;
    }

    public void setCodigoTurma(String codigoTurma) {
        this.codigoTurma = codigoTurma;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
}
