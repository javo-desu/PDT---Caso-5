package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Empleado;
import modelo.Producto;
import modelo.Proveedor;
import modelo.Registro;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-01T20:24:47")
@StaticMetamodel(Orden.class)
public class Orden_ { 

    public static volatile SingularAttribute<Orden, Date> fecha;
    public static volatile SingularAttribute<Orden, String> estado;
    public static volatile SingularAttribute<Orden, Empleado> idEmpleado;
    public static volatile CollectionAttribute<Orden, Registro> registroCollection;
    public static volatile SingularAttribute<Orden, Proveedor> idProveedor;
    public static volatile SingularAttribute<Orden, Producto> idProducto;
    public static volatile SingularAttribute<Orden, Short> idOrden;

}