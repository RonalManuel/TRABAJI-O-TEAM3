package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.daointerface.IProductDao;
import pe.edu.upc.entity.Product;
import pe.edu.upc.serviceinterface.IProductService;

public class ProductServiceImpl implements IProductService, Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private IProductDao pD;

	@Override
	public void insert(Product rent) {
		try {
			pD.insert(rent);

		} catch (Exception e) {
			System.out.println("Error en el service al registrar un alquiler");
		}
	}

	@Override
	public List<Product> list() {
		
		return pD.listar();
	}

	@Override
	public void delete(int idRent) {
		pD.delete(idRent);
	}

	@Override
	public void modificar(Product ia) {
		pD.modificar(ia);
	}

}
