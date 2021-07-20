package Lucas.Spring_Boot_Sample.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import Lucas.Spring_Boot_Sample.model.Aluno;
import Lucas.Spring_Boot_Sample.model.Contato;

@Repository
public class AlunoDao {
	@PersistenceContext
	private EntityManager em;
	@Transactional
	public void save(Aluno aluno) {
		em.persist(aluno);
	}
	
}
