package br.com.fotonica.apilangtest.model;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Table;



import br.com.fotonica.core.GenericEntity;

@Table(name = "product", schema = "public")
@AttributeOverride(name = "id", column = @Column(name = "id_product"))
public class ProductModel extends GenericEntity {

  	@Column(unique = true)
	private String name;

	private String description;

	private String barCode;

	private ValueWithUnitModel weight;

	private String storageTips;

	private CategoryModel category;

	private PackingModel packing;

	private NutritionalInfoModel nutritionalInfo;



  	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getDescription(){
		return this.description;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getBarCode(){
		return this.barCode;
	}

	public void setBarCode(String barCode){
		this.barCode = barCode;
	}

	public ValueWithUnitModel getWeight(){
		return this.weight;
	}

	public void setWeight(ValueWithUnitModel weight){
		this.weight = weight;
	}

	public String getStorageTips(){
		return this.storageTips;
	}

	public void setStorageTips(String storageTips){
		this.storageTips = storageTips;
	}

	public CategoryModel getCategory(){
		return this.category;
	}

	public void setCategory(CategoryModel category){
		this.category = category;
	}

	public PackingModel getPacking(){
		return this.packing;
	}

	public void setPacking(PackingModel packing){
		this.packing = packing;
	}

	public NutritionalInfoModel getNutritionalInfo(){
		return this.nutritionalInfo;
	}

	public void setNutritionalInfo(NutritionalInfoModel nutritionalInfo){
		this.nutritionalInfo = nutritionalInfo;
	}

}
