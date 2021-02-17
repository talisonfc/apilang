package br.com.fotonica;

@Table(name = "tableName", schema = "schemaName")
@AttributeOverride()
public class Product extends GenericEntity {

  	@unique
	private String name;



  	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}

}
