package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Producto;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-01T20:24:47")
@StaticMetamodel(Bodega.class)
public class Bodega_ { 

    public static volatile SingularAttribute<Bodega, Short> idBodega;
    public static volatile SingularAttribute<Bodega, Short> stockCritico;
    public static volatile SingularAttribute<Bodega, Producto> idProducto;
    public static volatile SingularAttribute<Bodega, Short> stock;

}