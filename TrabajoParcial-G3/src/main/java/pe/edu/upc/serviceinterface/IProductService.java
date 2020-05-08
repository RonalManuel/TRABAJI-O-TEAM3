package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.Product;

public interface IProductService {

	public void insert(Product pre);
	public List<Product> list();
	public void delete(int idRent);
	public void modificar(Product ia);
}
