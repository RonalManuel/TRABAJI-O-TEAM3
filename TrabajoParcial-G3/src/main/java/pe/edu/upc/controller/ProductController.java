package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.CategoryProduct;
import pe.edu.upc.entity.Product;
import pe.edu.upc.serviceinterface.IProductService;

@Named
@RequestScoped
public class ProductController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IProductService pService;

	private CategoryProduct c;
	private Product p;

	List<Product> listaProduct;

	//////////////////////
	@PostConstruct
	public void init() {
		this.listaProduct = new ArrayList<Product>();
		this.c = new CategoryProduct();
		this.p = new Product();

		this.listProduct();
	}

	/////////////////////
	public String newProduct() {
		this.setP(new Product());
		return "product.xhtml";
	}
	
	public void delete(Product p) {
		try {
			pService.delete(p.getIdProduct());
			listProduct();		
		} catch (Exception e) {
			e.getMessage();

		}
	}


public void modificar() {
		try {
			pService.modificar(this.p);
			cleanProduct();
			this.listProduct();

		} catch (Exception e) {
			e.getMessage();
		}
	}
public String Modifpre(Product ia) {
		this.setP(ia);
		return "rentMod.xhtml";
	}

	public void insert() {
		try {

			p.setCatproduct(c);
			pService.insert(p);
			this.listProduct();
			cleanProduct();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void cleanProduct() {
		this.init();
	}

	public void listProduct() {
		try {
			listaProduct = pService.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	////////////////////////

	public IProductService getpService() {
		return pService;
	}

	public void setpService(IProductService pService) {
		this.pService = pService;
	}

	public CategoryProduct getC() {
		return c;
	}

	public void setC(CategoryProduct c) {
		this.c = c;
	}

	public Product getP() {
		return p;
	}

	public void setP(Product p) {
		this.p = p;
	}

	public List<Product> getListaProduct() {
		return listaProduct;
	}

	public void setListaProduct(List<Product> listaProduct) {
		this.listaProduct = listaProduct;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	//////////////////////////

	
}
