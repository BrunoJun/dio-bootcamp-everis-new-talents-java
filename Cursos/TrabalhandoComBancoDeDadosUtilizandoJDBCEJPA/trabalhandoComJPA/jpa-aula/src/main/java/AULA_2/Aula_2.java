package AULA_2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Classes.Aluno;
import Classes.Estado;

public class Aula_2 {
    
    public static void main(String[] args) {
        
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aula2");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Estado estado1 = new Estado("Rio de Janeiro", "RJ");
        Estado estado2 = new Estado("São Paulo", "SP");
        Aluno alunoAdicionar1 = new Aluno("Pedro", 18, estado1);
        Aluno alunoAdicionar2 = new Aluno("Bruno", 22, estado2);

        entityManager.getTransaction().begin();

        entityManager.persist(estado1);
        entityManager.persist(estado2);
        entityManager.persist(alunoAdicionar1);
        entityManager.persist(alunoAdicionar2);

        entityManager.getTransaction().commit();

        // Procurar uma entidade

        Estado estadoProcurar = entityManager.find(Estado.class, 1);
        Aluno alunoProcurar = entityManager.find(Aluno.class, 2);

        System.out.println(estadoProcurar);
        System.out.println(alunoProcurar);

        // Alterar uma entidade

        entityManager.getTransaction().begin();

        alunoProcurar.setIdade(33);

        entityManager.getTransaction().commit();

        // Remover uma entidade
        
        entityManager.getTransaction().begin();

        entityManager.remove(alunoAdicionar1);

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();


    }
}
