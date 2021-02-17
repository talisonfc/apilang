
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Table;

//dependencies

import br.com.fotonica.core.GenericEntity;

@Table(name = "tableName", schema = "schemaName")
@AttributeOverride(name = "id", column = @Column(name = "primaryKeyName"))
public class ModelTemplate extends GenericEntity {

  //properties

  //methods

}
