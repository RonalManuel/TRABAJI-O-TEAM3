package pe.edu.upc.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rent")
public class Rent implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRent;
	@Column(name = "amountRent ", nullable = false ,length = 50)
	private int amountRent;
	private Date startdateRent;
	private Date enddateRent;
	
	/*
	@OneToOne(mappedBy = "rent", cascade = CascadeType.ALL)
	private Product product;*/
	/*
	@OneToOne(mappedBy = "rent", cascade = CascadeType.ALL)
	private Voucher vou;*/
	
	private int quantityRent;
	
	

	//////////////////
	public Rent(int idRent, int amountRent, Date startdateRent, Date enddateRent,
			int quantityRent) { //Voucher vou //Date registerdateRent
		super();
		this.idRent = idRent;
		this.amountRent = amountRent;
		this.startdateRent = startdateRent;
		this.enddateRent = enddateRent;
		this.quantityRent = quantityRent;
		
	}
	
	public Rent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//////////////////////

	public int getIdRent() {
		return idRent;
	}

	public void setIdRent(int idRent) {
		this.idRent = idRent;
	}

	public int getAmountRent() {
		return amountRent;
	}

	public void setAmountRent(int amountRent) {
		this.amountRent = amountRent;
	}

	public Date getStartdateRent() {
		return startdateRent;
	}

	public void setStartdateRent(Date startdateRent) {
		this.startdateRent = startdateRent;
	}

	public Date getEnddateRent() {
		return enddateRent;
	}

	public void setEnddateRent(Date enddateRent) {
		this.enddateRent = enddateRent;
	}

	public int getQuantityRent() {
		return quantityRent;
	}

	public void setQuantityRent(int quantityRent) {
		this.quantityRent = quantityRent;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/*public Product getProductRent() {
		return productRent;
	}*/

	/*public void setProductRent(Product productRent) {
		this.productRent = productRent;
	}*/

}
