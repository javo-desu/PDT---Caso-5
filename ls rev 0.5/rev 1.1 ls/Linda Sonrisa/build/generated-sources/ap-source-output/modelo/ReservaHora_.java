package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Cliente;
import modelo.Servicio;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-01T20:24:47")
@StaticMetamodel(ReservaHora.class)
public class ReservaHora_ { 

    public static volatile SingularAttribute<ReservaHora, Cliente> idCliente;
    public static volatile SingularAttribute<ReservaHora, Date> fechaHora;
    public static volatile SingularAttribute<ReservaHora, Servicio> idServicio;
    public static volatile SingularAttribute<ReservaHora, Short> idReserva;

}