package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.Product;

	public interface IproductDao {
	public void insert(Product product);
	
	public void delete(int idProduct);

	public List<Product> list();

	public List<Product> finByNameProduct(Product pd);

	void modificar(Product pd);
}
