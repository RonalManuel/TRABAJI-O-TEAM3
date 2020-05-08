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
@Table(name = "Vouchers")
public class Voucher implements Serializable{
	//Esta sera mi clave unica
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idVoucher;
	
	
	private String dateVoucher;
	
	//uno a muchos con ID Person
	@ManyToOne
	@JoinColumn(name = "idPerson", nullable = true)
	private Person Person;
	
	//uno a muchos con ID IdTypepay
	@ManyToOne
	@JoinColumn(name = "idTypepay", nullable = true)
	private TypePay Typepay;

	

	public String getDateVoucher() {
		return dateVoucher;
	}
	public void setDateVoucher(String dateVoucher) {
		this.dateVoucher = dateVoucher;
	}
	
	public Person getPerson() {
		return Person;
	}
	public void setPerson(Person person) {
		Person = person;
	}
	public TypePay getTypepay() {
		return Typepay;
	}
	public void setTypepay(TypePay typepay) {
		Typepay = typepay;
	}
	public int getIdVoucher() {
		return idVoucher;
	}
	public void setIdVoucher(int idVoucher) {
		this.idVoucher = idVoucher;
	}
	
}