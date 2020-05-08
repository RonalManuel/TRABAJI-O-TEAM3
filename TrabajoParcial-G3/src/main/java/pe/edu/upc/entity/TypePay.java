package pe.edu.upc.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TypePay")
public class TypePay implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTypepay;
	

	public TypePay() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TypePay(int idTypepay) {
		super();
		this.idTypepay = idTypepay;
	}
	public int getIdTypepay() {
		return idTypepay;
	}
	public void setIdTypepay(int idTypepay) {
		this.idTypepay = idTypepay;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}