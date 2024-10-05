public class Main {
    public static void main(String[] args) {
        
        Faculdade faculdade = new Faculdade("Uniderp", "12.345.678/0001-99", "Rua Ceara, 123");

        
        Curso curso1 = new Curso("Ciência da Computação", "C001", "Prof. João");
        Curso curso2 = new Curso("Engenharia da Computação", "C002", "Prof. Maria");
        Curso curso3 = new Curso("Direito", "C003", "Prof. Pedro");

        
        faculdade.adicionarCurso(curso1);
        faculdade.adicionarCurso(curso2);
        faculdade.adicionarCurso(curso3);

        
        Turma turma1CC = new Turma("Turma 1", "T001", "Prof. Carlos");
        Turma turma2CC = new Turma("Turma 2", "T002", "Prof. Julia");
        curso1.adicionarTurma(turma1CC);
        curso1.adicionarTurma(turma2CC);

        Turma turma1EC = new Turma("Turma 1", "T003", "Prof. Ana");
        Turma turma2EC = new Turma("Turma 2", "T004", "Prof. Felipe");
        curso2.adicionarTurma(turma1EC);
        curso2.adicionarTurma(turma2EC);

        Turma turma1Adm = new Turma("Turma 1", "T005", "Prof. Fernanda");
        Turma turma2Adm = new Turma("Turma 2", "T006", "Prof. Bruno");
        curso3.adicionarTurma(turma1Adm);
        curso3.adicionarTurma(turma2Adm);

        
        Aluno aluno1 = new Aluno("Carlos Silva", "123.456.789-00", 20, "Rua A", "1234-5678", "carlos@exemplo.com");
        Aluno aluno2 = new Aluno("Maria Souza", "987.654.321-00", 22, "Rua B", "9876-5432", "maria@exemplo.com");
        Aluno aluno3 = new Aluno("Pedro Oliveira", "456.123.789-00", 21, "Rua C", "4567-1234", "pedro@exemplo.com");

        turma1CC.adicionarAluno(aluno1);
        turma1CC.adicionarAluno(aluno2);
        turma1CC.adicionarAluno(aluno3);

        
        faculdade.removerCurso(curso3);

        
        faculdade.editarNomeCurso(curso1, "Sistemas de Informação");

        
        turma1CC.removerAluno(aluno2);

        
        aluno3.setNome("Pedro Silva Oliveira");
        aluno3.setEmail("pedro.silva@exemplo.com");

        
        faculdade.listarCursos();
        curso1.listarTurmas();
        turma1CC.listarAlunos();
    }
}
