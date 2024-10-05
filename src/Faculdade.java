import java.util.ArrayList;

public class Faculdade {
    private String nomeFaculdade;
    private String cnpj;
    private String endereco;
    private ArrayList<Curso> cursos;

    
    public Faculdade(String nomeFaculdade, String cnpj, String endereco) {
        this.nomeFaculdade = nomeFaculdade;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.cursos = new ArrayList<>();
    }

    
    public void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void removerCurso(Curso curso) {
        cursos.remove(curso);
    }

    public void editarNomeCurso(Curso curso, String novoNome) {
        curso.setNomeCurso(novoNome);
    }

    public void listarCursos() {
        System.out.println("Cursos da Faculdade " + nomeFaculdade + ":");
        for (Curso curso : cursos) {
            System.out.println(curso.getNomeCurso());
        }
    }

    
    public String getNomeFaculdade() {
        return nomeFaculdade;
    }

    public void setNomeFaculdade(String nomeFaculdade) {
        this.nomeFaculdade = nomeFaculdade;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }
}
