package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerface.IRentDao;
import pe.edu.upc.entity.Rent;
import pe.edu.upc.serviceinterface.IRentService;
@Named
@RequestScoped
public class RentServiceImpl implements IRentService, Serializable{
	
	private static final long serialVersionUID = 1L;
	@Inject /* inyeccion de dependencias */
	private IRentDao iD;
	@Override
	public void insert(Rent rent) {
		try {
			iD.insert(rent);

		} catch (Exception e) {
			System.out.println("Error en el service al insertar un infectious agent");
		}
		
	}

	
	@Override
	public List<Rent> list() {
		// TODO Auto-generated method stub
		return iD.list();
	}

	@Override
	public void delete(int idRent) {
		iD.delete(idRent);
		
	}

	@Override
	public void modificar(Rent ia) {
		// TODO Auto-generated method stub
		iD.modificar(ia);
	}

	
	
	
	

}
