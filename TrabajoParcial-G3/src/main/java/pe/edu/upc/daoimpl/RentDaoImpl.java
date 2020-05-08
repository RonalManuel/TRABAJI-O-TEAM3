package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pe.edu.upc.daointerface.IRentDao;
import pe.edu.upc.entity.Rent;

public class RentDaoImpl implements IRentDao , Serializable{

	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "ejemploJpa")
	private EntityManager em;
	@Override
	public void insert(Rent rent) {
		try {
			em.persist(rent);
		} catch (Exception e) {
			System.out.println("Error insert DAOImpl");
		}
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Rent> list() {
		List<Rent> lista = new ArrayList<Rent>();
		try {
			Query q = em.createQuery("select i from rent i");
			lista = (List<Rent>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar DAOImpl");
		}
		return lista;
	}

	@Override
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
	public void modificar(Rent ia) {
		try {
			em.merge(ia);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		
	}
	
	

}
