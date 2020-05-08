package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Rent;

import pe.edu.upc.serviceinterface.IRentService;
@Named
@RequestScoped
public class RentController implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Inject //filosofia obtimiza los recurso -- no te carga todo los metodos de la instancia.
	private IRentService RService;
	private Rent r;
	
	private String mensaje;
	List<Rent> listaRent;
	
	
	@PostConstruct
	public void init() {
		this.listaRent = new ArrayList<Rent>();
		this.r = new Rent();
		this.listRent();
	}
	public String newRents() {
		this.setR(new Rent());
		return "Rent.xhtml";
	}
	
	public void insert() {
		try {
			RService.insert(r);
			cleanRent();
			this.listRent();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void listRent() {
		try {
			listaRent = RService.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void cleanRent() {
		this.init();
	}

	public void delete(Rent ti) {
		try {
			RService.delete(ti.getIdRent());
			listRent();
			mensaje = "se eliminó correctamente";
		} catch (Exception e) {
			e.getMessage();
			mensaje = "No se eliminó";

		}
	}


	public void modificar() {
		try {
			RService.modificar(this.r);
			cleanRent();
			this.listRent();

		} catch (Exception e) {
			e.getMessage();
		}
	}
	public String Modifpre(Rent ia) {
		this.setR(ia);
		return "Rentmod.xhtml";
		
	}

	public Rent getR() {
		return r;
	}




	public void setR(Rent r) {
		this.r = r;
	}




	public String getMensaje() {
		return mensaje;
	}




	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	
	public List<Rent> getListaRent() {
		return listaRent;
	}
	public void setListaRent(List<Rent> listaRent) {
		this.listaRent = listaRent;
	}



	

	
}
