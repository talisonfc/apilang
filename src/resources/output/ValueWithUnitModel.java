package br.com.fotonica.apilangtest.model;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Table;



import br.com.fotonica.core.GenericEntity;

@Table(name = "value_with_unit", schema = "public")
@AttributeOverride(name = "id", column = @Column(name = "id_value_with_unit"))
public class ValueWithUnitModel extends GenericEntity {

  	private Double value;

	private UnitMeasurementModel unitMeasurement;



  	public Double getValue(){
		return this.value;
	}

	public void setValue(Double value){
		this.value = value;
	}

	public UnitMeasurementModel getUnitMeasurement(){
		return this.unitMeasurement;
	}

	public void setUnitMeasurement(UnitMeasurementModel unitMeasurement){
		this.unitMeasurement = unitMeasurement;
	}

}
