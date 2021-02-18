package br.com.fotonica.apilangtest.model;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Table;



import br.com.fotonica.core.GenericEntity;

@Table(name = "packing", schema = "public")
@AttributeOverride(name = "id", column = @Column(name = "id_packing"))
public class PackingModel extends GenericEntity {

  	private String name;

	private String description;



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

}
