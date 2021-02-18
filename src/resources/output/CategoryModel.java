package br.com.fotonica.apilangtest.model;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Table;

import java.util.List;


import br.com.fotonica.core.GenericEntity;

@Table(name = "category", schema = "public")
@AttributeOverride(name = "id", column = @Column(name = "id_category"))
public class CategoryModel extends GenericEntity {

  	private List<CategoryModel> subcategory;

	private Boolean isCategory;

	private String icon;



  	public List<CategoryModel> getSubcategory(){
		return this.subcategory;
	}

	public void setSubcategory(List<CategoryModel> subcategory){
		this.subcategory = subcategory;
	}

	public Boolean getIsCategory(){
		return this.isCategory;
	}

	public void setIsCategory(Boolean isCategory){
		this.isCategory = isCategory;
	}

	public String getIcon(){
		return this.icon;
	}

	public void setIcon(String icon){
		this.icon = icon;
	}

}
