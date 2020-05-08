package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CategoryProduct")
public class CategoryProduct implements Serializable {


	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCategory;
	
	private String descriptionCategory;
	public CategoryProduct(int idCategory, String descriptionCategory) {
		super();
		this.idCategory = idCategory;
		this.descriptionCategory = descriptionCategory;
	}
	public CategoryProduct() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdCategory() {
		return idCategory;
	}
	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}
	public String getDescriptionCategory() {
		return descriptionCategory;
	}
	public void setDescriptionCategory(String descriptionCategory) {
		this.descriptionCategory = descriptionCategory;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	


}