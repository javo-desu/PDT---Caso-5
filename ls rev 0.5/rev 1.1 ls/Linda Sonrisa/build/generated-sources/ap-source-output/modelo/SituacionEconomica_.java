package modelo;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Cliente;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-01T20:24:47")
@StaticMetamodel(SituacionEconomica.class)
public class SituacionEconomica_ { 

    public static volatile SingularAttribute<SituacionEconomica, Serializable> liquidacionDeSueldo;
    public static volatile SingularAttribute<SituacionEconomica, Cliente> idCliente;
    public static volatile SingularAttribute<SituacionEconomica, Short> idSituacionEconomica;
    public static volatile SingularAttribute<SituacionEconomica, Serializable> finiquito;
    public static volatile SingularAttribute<SituacionEconomica, Serializable> certificadoAfp;

}