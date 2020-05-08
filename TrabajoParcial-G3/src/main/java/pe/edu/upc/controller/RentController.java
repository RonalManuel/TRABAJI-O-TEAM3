package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Product;
import pe.edu.upc.entity.Rent;
import pe.edu.upc.entity.Voucher;
import pe.edu.upc.serviceinterface.IRentService;

@Named
@RequestScoped
public class RentController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IRentService rService;

	private Product p;

	private Rent r;
	private String mensaje;
	private Voucher v;

	List<Rent> listaRent;

	//////////////////////
	@PostConstruct
	public void init() {
		this.listaRent = new ArrayList<Rent>();
		this.r = new Rent();
		this.v = new Voucher();
		this.p = new Product();
		this.listRent();
	}

	/////////////////////
	public String newRent() {
		this.setR(new Rent());
		return "rent.xhtml";
	}
	
	public void delete(Rent ti) {
		try {
			rService.delete(ti.getIdRent());
			listRent();
			setMensaje("se eliminó correctamente");
		} catch (Exception e) {
			e.getMessage();
			setMensaje("No se eliminó");

		}
	}


public void modificar() {
		try {
			rService.modificar(this.r);
			cleanRent();
			this.listRent();

		} catch (Exception e) {
			e.getMessage();
		}
	}
public String Modifpre(Rent ia) {
		this.setR(ia);
		return "rentMod.xhtml";
		
	}

	public void insert() {
		try {
			r.setVoucher(v);
			r.setProduct(p);
			rService.insert(r);
			this.listRent();
			cleanRent();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void cleanRent() {
		this.init();
	}

	public void listRent() {
		try {
			listaRent = rService.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	////////////////////////

	//////////////////////////

	public IRentService getrService() {
		return rService;
	}

	public void setrService(IRentService rService) {
		this.rService = rService;
	}

	public Product getP() {
		return p;
	}

	public void setP(Product p) {
		this.p = p;
	}

	public Rent getR() {
		return r;
	}

	public void setR(Rent r) {
		this.r = r;
	}

	public Voucher getV() {
		return v;
	}

	public void setV(Voucher v) {
		this.v = v;
	}

	public List<Rent> getListaRent() {
		return listaRent;
	}

	public void setListaRent(List<Rent> listaRent) {
		this.listaRent = listaRent;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
