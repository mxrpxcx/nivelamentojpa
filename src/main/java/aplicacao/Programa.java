package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
 
		Pessoa p1 = new Pessoa("Teste", "T@T.T");
		Pessoa p2 = new Pessoa("Teste2", "T2@T.T");
		Pessoa p3 = new Pessoa("Teste3", "T3@T.T");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		System.out.println("Pronto");

	}

}
