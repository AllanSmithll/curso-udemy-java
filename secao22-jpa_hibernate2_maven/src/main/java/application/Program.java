package application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Program {

	public static void main(String[] args) {

		// Criamos objetos Pessoa; usamos em.persist(); usamos o em.find() e o
		// em.remove(); Não esquecer de sempre começar (begin) e terminar (commit ou
		// roolback) a transação

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		Pessoa p = em.find(Pessoa.class, 4);
		em.remove(p);
		em.getTransaction().commit();
		System.out.println("Pronto!");
		em.close();
		emf.close();
	}

}
