package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.CategoryProduct;
import pe.edu.upc.serviceinterface.IcategoryproductService;

@Named
@RequestScoped
public class CategoryProductController implements Serializable {

	private static final long serialVersionUID = 1L;
	@Inject
	private IcategoryproductService cService;
	
	private String mensaje;
	
	private CategoryProduct c;
	
	List<CategoryProduct> listaCategory;
	

	// constructor
	@PostConstruct
	public void init() {
		
		this.listaCategory = new ArrayList<CategoryProduct>();
		
		this.c = new CategoryProduct();
		
		this.list();
		
	}

	// Metodos
	public String newCategory() {
		this.setC(new CategoryProduct());
		return "category.xhtml";
	
	}

	
	public void insert() {
		try {
			
			cService.insert(c);
			cleanProductCategory();
			this.list();
		} catch (Exception e) {
			mensaje = "Tamo triste";
			e.getMessage();
		}
	}

	public void list() {
		
		try {
			listaCategory = cService.list();
		} catch (Exception e) {
			
			e.getMessage();
		}
	}
	
	
	public void cleanProductCategory() {
		this.init();
	}

	public void delete(CategoryProduct ca) {
		try {
			cService.delete(ca.getIdCategory());
			list();
			mensaje = "se eliminó correctamente";
		} catch (Exception e) {
			e.getMessage();
			mensaje = "No se eliminó";

		}
	}
	
public void setListaCategory(List<CategoryProduct> listaCategory) {
		this.listaCategory = listaCategory;
	}

public String getMensaje() {
	return mensaje;
}

public void setMensaje(String mensaje) {
	this.mensaje = mensaje;
}

public CategoryProduct getC() {
	return c;
}

public void setC(CategoryProduct c) {
	this.c = c;
}

public List<CategoryProduct> getListaCategory() {
	return listaCategory;
}

}
	//////////////////////////////
	
