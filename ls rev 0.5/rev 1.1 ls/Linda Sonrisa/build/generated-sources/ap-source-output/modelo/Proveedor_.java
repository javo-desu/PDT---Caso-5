package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Orden;
import modelo.Producto;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-01T20:24:47")
@StaticMetamodel(Proveedor.class)
public class Proveedor_ { 

    public static volatile SingularAttribute<Proveedor, String> rubro;
    public static volatile SingularAttribute<Proveedor, Short> idProveedor;
    public static volatile SingularAttribute<Proveedor, String> correo;
    public static volatile SingularAttribute<Proveedor, String> direccion;
    public static volatile SingularAttribute<Proveedor, Integer> celular;
    public static volatile CollectionAttribute<Proveedor, Producto> productoCollection;
    public static volatile SingularAttribute<Proveedor, Long> telefono;
    public static volatile SingularAttribute<Proveedor, String> nombre;
    public static volatile CollectionAttribute<Proveedor, Orden> ordenCollection;

}