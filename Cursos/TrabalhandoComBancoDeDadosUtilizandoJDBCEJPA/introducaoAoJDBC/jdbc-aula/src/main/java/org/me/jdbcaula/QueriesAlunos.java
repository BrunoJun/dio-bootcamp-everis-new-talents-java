package org.me.jdbcaula;

import java.util.List;

public class QueriesAlunos {
    
    public static void main(String[] args) {
        
        AlunoDAO alunoDAO = new AlunoDAO();

        // Aluno alunoInserir = new Aluno("Bruna", 32, "SP");
        // alunoDAO.insert(alunoInserir);
        // alunoDAO.delete(6);

        Aluno alunoPeloId = alunoDAO.getById(2);
        
        Aluno alunoAtualizar = alunoDAO.getById(4);
        alunoAtualizar.setNome("Jucelina");
        alunoAtualizar.setIdade(29);
        alunoAtualizar.setEstado("MG");

        alunoDAO.update(alunoAtualizar);
        
        List<Aluno> lista = alunoDAO.list();

        lista.stream().forEach(System.out::println);

        // System.out.println(alunoPeloId);
    }
}
