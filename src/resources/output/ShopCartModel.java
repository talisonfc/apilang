package br.com.fotonica;

@Table(name = "tableName", schema = "schemaName")
@AttributeOverride()
public class ShopCart extends GenericEntity {

  	private List<Product> orders;



  	public List<Product> getOrders(){
		return this.orders;
	}

	public void setOrders(List<Product> orders){
		this.orders = orders;
	}

}
