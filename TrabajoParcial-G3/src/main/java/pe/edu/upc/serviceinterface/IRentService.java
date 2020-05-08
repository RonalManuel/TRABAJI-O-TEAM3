package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.Rent;

public interface IRentService {
	public void insert(Rent rent);
	public List<Rent> list();
	public void delete(int idRent);
	public void modificar(Rent ia);
}
