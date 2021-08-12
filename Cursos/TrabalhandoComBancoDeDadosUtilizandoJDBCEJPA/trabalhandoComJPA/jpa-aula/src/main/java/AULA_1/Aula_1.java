package AULA_1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Classes.Aluno;
import Classes.Estado;

public class Aula_1 {
    
    public static void main(String[] args) {
        
        // criou uma gestão das entidades
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aula1");

        // manipular os bancos de dados através das classes Java
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Estado estado1 = new Estado("São Paulo", "SP");
        Aluno alunoAdicionar = new Aluno("Pedro", 18, estado1);

        entityManager.getTransaction().begin();

        entityManager.persist(estado1);
        entityManager.persist(alunoAdicionar);

        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}
