package br.com.fotonica.apilangtest.model;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Table;



import br.com.fotonica.core.GenericEntity;

@Table(name = "unit_measurement", schema = "public")
@AttributeOverride(name = "id", column = @Column(name = "id_unit_measurement"))
public class UnitMeasurementModel extends GenericEntity {

  	private String initials;

	private String name;



  	public String getInitials(){
		return this.initials;
	}

	public void setInitials(String initials){
		this.initials = initials;
	}

	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}

}
