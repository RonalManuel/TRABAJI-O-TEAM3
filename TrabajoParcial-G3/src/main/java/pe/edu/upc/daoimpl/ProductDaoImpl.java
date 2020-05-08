package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.IProductDao;
import pe.edu.upc.entity.Product;
import pe.edu.upc.entity.Rent;


public class ProductDaoImpl implements  Serializable, IProductDao{


	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "TrabajoParcial-G3")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insert(Product pro) {
		try {
			em.persist(pro);
			
		} catch (Exception e) {
			System.out.println("Error insert RentDAOImpl1");
		}
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public List<Product> listar() {
		List<Product> lista = new ArrayList<Product>();
		try {
			Query q = em.createQuery("select i from Rent i");
			lista = (List<Product>) q.getResultList();
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
	public void modificar(Product ia) {
			try {
				em.merge(ia);

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}

	
}
