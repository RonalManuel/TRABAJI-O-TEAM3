package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import pe.edu.upc.daointerface.IRentDao;
import pe.edu.upc.entity.Rent;
import pe.edu.upc.serviceinterface.IRentService;


public class RentServiceImpl implements IRentService, Serializable{
	
	private static final long serialVersionUID = 1L;
	@Inject
	private IRentDao rD;
	
	@Override
	public void insert(Rent rent) {
		try {
			rD.insert(rent);

		} catch (Exception e) {
			System.out.println("Error en el service al registrar un alquiler");
		}
	}

	@Override
	public List<Rent> list() {
		return rD.listar();
	}
	
	@Override
	public void delete(int idRent) {
			rD.delete(idRent);
			
		}

	@Override
	public void modificar(Rent ia) {
			// TODO Auto-generated method stub
			rD.modificar(ia);
		}

}
