package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Producto;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-01T20:24:47")
@StaticMetamodel(FamiliaProducto.class)
public class FamiliaProducto_ { 

    public static volatile SingularAttribute<FamiliaProducto, Short> idFamilia;
    public static volatile CollectionAttribute<FamiliaProducto, Producto> productoCollection;
    public static volatile SingularAttribute<FamiliaProducto, String> nombre;

}