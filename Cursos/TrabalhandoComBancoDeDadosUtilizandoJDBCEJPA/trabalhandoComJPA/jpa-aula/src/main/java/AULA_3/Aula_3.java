package AULA_3;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Classes.Aluno;
import Classes.Estado;

public class Aula_3 {
    
    public static void main(String[] args) {
        
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("aula2");
        EntityManager entityManager =  entityManagerFactory.createEntityManager();

        Estado estado1 = new Estado("Minas Gerais", "MG");
        Estado estado2 = new Estado("Rio Grande do Sul", "RS");

        Aluno aluno1 = new Aluno("Bruno", 22, estado1);
        Aluno aluno2 = new Aluno("Ana", 34, estado2);
        Aluno aluno3 = new Aluno("Rafael", 28, estado1);

        entityManager.getTransaction().begin();

        entityManager.persist(estado1);
        entityManager.persist(estado2);
        entityManager.persist(aluno1);
        entityManager.persist(aluno2);
        entityManager.persist(aluno3);

        entityManager.getTransaction().commit();

        String nome = "Bruno";

        //JPQL

        String jpql = "select a from Aluno a where a.nome = :nome";


        // Não precisa fazer conversão
        Aluno alunoJPQL = entityManager
               .createQuery(jpql, Aluno.class)
               .setParameter("nome", nome)
               .getSingleResult();


        // Também é possivel fazer com id e objeto.
        String jpqlList = "select a from Aluno a where a.estado.nome = :estadoNome";
        List<Aluno> alunoJPQLList = entityManager
            .createQuery(jpqlList, Aluno.class)
            .setParameter("estadoNome", "Rio Grande do Sul")
            .getResultList();

        System.out.println(alunoJPQL);
        alunoJPQLList.forEach(System.out::println);

        entityManager.close();
        entityManagerFactory.close();
    }
}

