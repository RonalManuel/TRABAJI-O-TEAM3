package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.Product;

public interface IproductService {
	
	public void insert(Product product);
	
	
	public List<Product> list();
	
	public void delete(int idProduct);
	
	public List<Product> finByNameProduct(Product pd);
	
	public void modificar(Product pd);

}
