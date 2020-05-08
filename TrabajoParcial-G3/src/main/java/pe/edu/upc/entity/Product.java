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
@Table(name = "Products")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProduct;

	private String nameProduct;
	private String stockProduct;
	private String descriptionProduct;
	private String imageProduct;
	private String priceProduct;

	@ManyToOne
	@JoinColumn(name = "idCategory", nullable = true)
	private CategoryProduct categoryproduct;

	public Product(int idProduct, String nameProduct, String stockProduct, String descriptionProduct,
			String imageProduct, String priceProduct, CategoryProduct catproduct) {
		super();
		this.idProduct = idProduct;
		this.nameProduct = nameProduct;
		this.stockProduct = stockProduct;
		this.descriptionProduct = descriptionProduct;
		this.imageProduct = imageProduct;
		this.priceProduct = priceProduct;
		this.categoryproduct = catproduct;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public String getStockProduct() {
		return stockProduct;
	}

	public void setStockProduct(String stockProduct) {
		this.stockProduct = stockProduct;
	}

	public String getDescriptionProduct() {
		return descriptionProduct;
	}

	public void setDescriptionProduct(String descriptionProduct) {
		this.descriptionProduct = descriptionProduct;
	}

	public String getImageProduct() {
		return imageProduct;
	}

	public void setImageProduct(String imageProduct) {
		this.imageProduct = imageProduct;
	}

	public String getPriceProduct() {
		return priceProduct;
	}

	public void setPriceProduct(String priceProduct) {
		this.priceProduct = priceProduct;
	}

	public CategoryProduct getCatproduct() {
		return categoryproduct;
	}

	public void setCatproduct(CategoryProduct catproduct) {
		this.categoryproduct = catproduct;
	}

}
