package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Cliente;
import modelo.Control;
import modelo.Empleado;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-01T20:24:47")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> clave;
    public static volatile SingularAttribute<Usuario, Control> idControl;
    public static volatile CollectionAttribute<Usuario, Empleado> empleadoCollection;
    public static volatile SingularAttribute<Usuario, Short> idUsuario;
    public static volatile SingularAttribute<Usuario, String> username;
    public static volatile CollectionAttribute<Usuario, Cliente> clienteCollection;

}