package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Producto;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-01T20:24:47")
@StaticMetamodel(TipoProducto.class)
public class TipoProducto_ { 

    public static volatile SingularAttribute<TipoProducto, Short> idTipo;
    public static volatile CollectionAttribute<TipoProducto, Producto> productoCollection;
    public static volatile SingularAttribute<TipoProducto, String> nombre;

}