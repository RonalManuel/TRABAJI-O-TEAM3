package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.IRentDao;
import pe.edu.upc.entity.Rent;


public class RentDaoImpl implements  Serializable, IRentDao{


	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "TrabajoParcial-G3")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Rent rent) {
		try {
			em.persist(rent);
			
		} catch (Exception e) {
			System.out.println("Error insert RentDAOImpl1");
		}
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public List<Rent> listar() {
		List<Rent> lista = new ArrayList<Rent>();
		try {
			Query q = em.createQuery("select i from Rent i");
			lista = (List<Rent>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar RentDAOImpl2");
		}
		return lista;
	}
	
	@Override
	@Transactional
	public void delete(int idRent) {
			Rent ia = new Rent();
			try {
				ia = em.getReference(Rent.class, idRent);
				em.remove(ia);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	@Override
	@Transactional
	public void modificar(Rent ia) {
			try {
				em.merge(ia);

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
}
