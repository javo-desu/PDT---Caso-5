package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Cliente;
import modelo.Servicio;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-01T20:24:47")
@StaticMetamodel(Boleta.class)
public class Boleta_ { 

    public static volatile SingularAttribute<Boleta, Date> fecha;
    public static volatile SingularAttribute<Boleta, Long> total;
    public static volatile SingularAttribute<Boleta, Cliente> idCliente;
    public static volatile SingularAttribute<Boleta, Short> idBoleta;
    public static volatile SingularAttribute<Boleta, Servicio> idServicio;

}