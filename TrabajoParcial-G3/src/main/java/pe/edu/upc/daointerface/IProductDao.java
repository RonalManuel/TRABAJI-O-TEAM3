package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.Product;

public interface IProductDao {

	List<Product> listar();

	void insert(Product pro);

	void delete(int idRent);

	void modificar(Product ia);

}
