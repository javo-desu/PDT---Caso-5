package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Bodega;
import modelo.FamiliaProducto;
import modelo.Orden;
import modelo.Proveedor;
import modelo.Servicio;
import modelo.TipoProducto;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-01T20:24:47")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, String> descripcion;
    public static volatile SingularAttribute<Producto, FamiliaProducto> idFamilia;
    public static volatile SingularAttribute<Producto, Long> codigo;
    public static volatile CollectionAttribute<Producto, Servicio> servicioCollection;
    public static volatile SingularAttribute<Producto, Date> fechaVencimiento;
    public static volatile SingularAttribute<Producto, String> nombre;
    public static volatile SingularAttribute<Producto, Bodega> bodega;
    public static volatile SingularAttribute<Producto, Long> precioCompra;
    public static volatile SingularAttribute<Producto, Proveedor> idProveedor;
    public static volatile SingularAttribute<Producto, TipoProducto> idTipo;
    public static volatile SingularAttribute<Producto, Short> idProducto;
    public static volatile SingularAttribute<Producto, Long> precioVenta;
    public static volatile SingularAttribute<Producto, String> sku;
    public static volatile CollectionAttribute<Producto, Orden> ordenCollection;

}