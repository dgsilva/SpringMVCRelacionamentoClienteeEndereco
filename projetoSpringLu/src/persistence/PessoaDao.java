package persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import entity.Endereco;
import entity.Pessoa;

public class PessoaDao {
	
	EntityManager entityManager;
	TypedQuery<Pessoa>query;
	
	public PessoaDao() {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("projetoSpringLu");
	if(entityManager==null) {
		entityManager = factory.createEntityManager();
	}
	}
	
	public void create(Pessoa pessoa,Endereco endereco)throws Exception{
		entityManager.getTransaction().begin();
		entityManager.persist(pessoa);
		endereco.setPessoa(pessoa);
		entityManager.persist(endereco);
		entityManager.getTransaction().commit();
	}
	
	public void update(Pessoa pessoa) {
		entityManager.getTransaction().begin();
		entityManager.merge(pessoa);
		entityManager.getTransaction().commit();
	}
	
	public void delete(Pessoa pessoa) {
		entityManager.getTransaction().begin();
		entityManager.remove(pessoa);
		entityManager.getTransaction().commit();
	}

	public List<Pessoa>findAll()throws Exception{
		List<Pessoa>lista = entityManager.createQuery
				("select p from Pessoa as p", Pessoa.class).getResultList();
		return lista;
	}
	
	public static void main(String[] args) {
		PessoaDao pd = new PessoaDao();
		try {
			Pessoa p = new Pessoa(null,"Isabela","isabela@gmail.com","https://randomuser.me/api/portraits/women/64.jpg");
			Endereco e = new Endereco(null,"Itaque campo grande,89","Campo Grande","Rio de janeiro","rj","2309370");
			pd.create(p, e);
		}catch(Exception ex) {
			ex.printStackTrace();
		  
		}
	}
}
