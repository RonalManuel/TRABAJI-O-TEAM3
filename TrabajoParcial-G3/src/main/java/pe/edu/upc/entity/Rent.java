package pe.edu.upc.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Rents")
public class Rent implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRent;
	
	@ManyToOne
	@JoinColumn(name = "idProduct", nullable = true)
	private Product product; 
	
	private String amountRent;
	private String registerdateRent;
	private String startdateRent;
	private String enddateRent;
	private String quantityRent;
	
	@ManyToOne
	@JoinColumn(name = "idVoucher", nullable = true)
	private Voucher voucher;
////////////////////////////	
	public Rent(int idRent, Product product, String amountRent, String registerdateRent, String startdateRent,
			String enddateRent, String quantityRent, Voucher voucher) {
		super();
		this.idRent = idRent;
		this.product = product;
		this.amountRent = amountRent;
		this.registerdateRent = registerdateRent;
		this.startdateRent = startdateRent;
		this.enddateRent = enddateRent;
		this.quantityRent = quantityRent;
		this.voucher = voucher;
	}

	
	public Rent() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getIdRent() {
		return idRent;
	}

	public void setIdRent(int idRent) {
		this.idRent = idRent;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getAmountRent() {
		return amountRent;
	}

	public void setAmountRent(String amountRent) {
		this.amountRent = amountRent;
	}

	public String getRegisterdateRent() {
		return registerdateRent;
	}


	public void setRegisterdateRent(String registerdateRent) {
		this.registerdateRent = registerdateRent;
	}


	public String getStartdateRent() {
		return startdateRent;
	}


	public void setStartdateRent(String startdateRent) {
		this.startdateRent = startdateRent;
	}


	public String getEnddateRent() {
		return enddateRent;
	}


	public void setEnddateRent(String enddateRent) {
		this.enddateRent = enddateRent;
	}


	public String getQuantityRent() {
		return quantityRent;
	}


	public void setQuantityRent(String quantityRent) {
		this.quantityRent = quantityRent;
	}


	public Voucher getVoucher() {
		return voucher;
	}

	public void setVoucher(Voucher voucher) {
		this.voucher = voucher;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
///////////////////////////////////
	
	
}
