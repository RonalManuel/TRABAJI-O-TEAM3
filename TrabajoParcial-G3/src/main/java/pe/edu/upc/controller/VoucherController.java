package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Person;
import pe.edu.upc.entity.TypePay;
import pe.edu.upc.entity.Voucher;
import pe.edu.upc.serviceinterface.IVoucherService;

@Named
@RequestScoped
public class VoucherController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IVoucherService vService;

	private String mensaje;

	private Voucher v;
	private Person p;
	private TypePay t;

	List<Voucher> listaVoucher;

	@PostConstruct
	public void init() {
		this.listaVoucher = new ArrayList<Voucher>();

		this.v = new Voucher();
		this.p= new Person();
		this.t=new TypePay();
		this.listVoucher();
	}

	public String newVoucher() {
		this.setV(new Voucher());
		return "voucher.xhtml";
	}

	// esto limpia
	public void cleanVoucher() {
		this.init();
	}

	public void insert() {
		try {
			v.setTypepay(t);
			v.setPerson(p);
			vService.insert(v);
			cleanVoucher();
			this.listVoucher();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	private void listVoucher() {
		// TODO Auto-generated method stub
		try {
			listaVoucher = vService.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public IVoucherService getvService() {
		return vService;
	}

	public void setvService(IVoucherService vService) {
		this.vService = vService;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Voucher getV() {
		return v;
	}

	public void setV(Voucher v) {
		this.v = v;
	}

	public List<Voucher> getListaVoucher() {
		return listaVoucher;
	}

	public void setListaVoucher(List<Voucher> listaVoucher) {
		this.listaVoucher = listaVoucher;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Person getP() {
		return p;
	}

	public void setP(Person p) {
		this.p = p;
	}

	public TypePay getT() {
		return t;
	}

	public void setT(TypePay t) {
		this.t = t;
	}

}