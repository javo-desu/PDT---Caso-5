package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Boleta;
import modelo.Empleado;
import modelo.Producto;
import modelo.ReservaHora;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-01T20:24:47")
@StaticMetamodel(Servicio.class)
public class Servicio_ { 

    public static volatile SingularAttribute<Servicio, String> descripcion;
    public static volatile SingularAttribute<Servicio, Long> precio;
    public static volatile CollectionAttribute<Servicio, ReservaHora> reservaHoraCollection;
    public static volatile CollectionAttribute<Servicio, Empleado> empleadoCollection;
    public static volatile SingularAttribute<Servicio, Short> idServicio;
    public static volatile CollectionAttribute<Servicio, Producto> productoCollection;
    public static volatile CollectionAttribute<Servicio, Boleta> boletaCollection;
    public static volatile SingularAttribute<Servicio, String> nombre;

}