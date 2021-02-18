package br.com.fotonica.apilangtest.model;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Table;

import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;


import br.com.fotonica.core.GenericEntity;

@Table(name = "nutritional_info", schema = "public")
@AttributeOverride(name = "id", column = @Column(name = "id_nutritional_info"))
public class NutritionalInfoModel extends GenericEntity {

  	@OneToOne()
	@JoinColumn()
	private ValueWithUnitModel portion;

	@OneToOne()
	@JoinColumn()
	private ValueWithUnitModel energeticValue;

	@OneToOne()
	@JoinColumn()
	private ValueWithUnitModel carbohydrate;

	@OneToOne()
	@JoinColumn()
	private ValueWithUnitModel protein;

	@OneToOne()
	@JoinColumn()
	private ValueWithUnitModel totalFat;

	@OneToOne()
	@JoinColumn()
	private ValueWithUnitModel saturatedFat;

	@OneToOne()
	@JoinColumn()
	private ValueWithUnitModel transFat;

	@OneToOne()
	@JoinColumn()
	private ValueWithUnitModel sodium;

	@OneToOne()
	@JoinColumn()
	private ValueWithUnitModel calcium;



  	public ValueWithUnitModel getPortion(){
		return this.portion;
	}

	public void setPortion(ValueWithUnitModel portion){
		this.portion = portion;
	}

	public ValueWithUnitModel getEnergeticValue(){
		return this.energeticValue;
	}

	public void setEnergeticValue(ValueWithUnitModel energeticValue){
		this.energeticValue = energeticValue;
	}

	public ValueWithUnitModel getCarbohydrate(){
		return this.carbohydrate;
	}

	public void setCarbohydrate(ValueWithUnitModel carbohydrate){
		this.carbohydrate = carbohydrate;
	}

	public ValueWithUnitModel getProtein(){
		return this.protein;
	}

	public void setProtein(ValueWithUnitModel protein){
		this.protein = protein;
	}

	public ValueWithUnitModel getTotalFat(){
		return this.totalFat;
	}

	public void setTotalFat(ValueWithUnitModel totalFat){
		this.totalFat = totalFat;
	}

	public ValueWithUnitModel getSaturatedFat(){
		return this.saturatedFat;
	}

	public void setSaturatedFat(ValueWithUnitModel saturatedFat){
		this.saturatedFat = saturatedFat;
	}

	public ValueWithUnitModel getTransFat(){
		return this.transFat;
	}

	public void setTransFat(ValueWithUnitModel transFat){
		this.transFat = transFat;
	}

	public ValueWithUnitModel getSodium(){
		return this.sodium;
	}

	public void setSodium(ValueWithUnitModel sodium){
		this.sodium = sodium;
	}

	public ValueWithUnitModel getCalcium(){
		return this.calcium;
	}

	public void setCalcium(ValueWithUnitModel calcium){
		this.calcium = calcium;
	}

}
