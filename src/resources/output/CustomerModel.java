package br.com.fotonica;

@Table(name = "tableName", schema = "schemaName")
@AttributeOverride()
public class Customer extends GenericEntity {

  	private String name;

	@unique
	private Integer cpf;

	@required
	@unique
	private Integer age;



  	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}

	public Integer getCpf(){
		return this.cpf;
	}

	public void setCpf(Integer cpf){
		this.cpf = cpf;
	}

	public Integer getAge(){
		return this.age;
	}

	public void setAge(Integer age){
		this.age = age;
	}

}
