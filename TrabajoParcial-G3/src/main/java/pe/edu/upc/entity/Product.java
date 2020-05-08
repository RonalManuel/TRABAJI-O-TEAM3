package pe.edu.upc.entity;

 


import java.io.Serializable;

 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

 


@Entity
@Table(name="Product")
public class Product implements Serializable{
    
    
    private static final long serialVersionUID = 1L;

 


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProduct;
    @Column(name = "nameProduct", nullable = false, length = 50)
    private String nameProduct;
    @ManyToOne
    @JoinColumn(name = "idcategory", nullable = false)
    private CategoryProduct category;
    
 
  
    private String stockProduct;
    private String descriptionProduct;
    private String imageProduct;
    private float priceProduct;
    
///////////////////////////////    
    
    
    
    public Product() {
        super();
        // TODO Auto-generated constructor stub
    }

 


//////////////////////////

 


    public Product(int idProduct, String nameProduct, String stockProduct,
            String descriptionProduct, String imageProduct, float priceProduct, CategoryProduct category) {
        super();
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.stockProduct = stockProduct;
        this.imageProduct = imageProduct;
        this.priceProduct = priceProduct;
        this.category=category;
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

 


    public CategoryProduct getCategory() {
        return category;
    }

 


    public void setCategory(CategoryProduct category) {
        this.category = category;
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

 


    public float getPriceProduct() {
        return priceProduct;
    }

 


    public void setPriceProduct(float priceProduct) {
        this.priceProduct = priceProduct;
    }

 


    

 


 
}

