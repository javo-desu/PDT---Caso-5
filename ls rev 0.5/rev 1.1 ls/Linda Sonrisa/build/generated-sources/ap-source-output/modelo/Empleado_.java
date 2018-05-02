package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Orden;
import modelo.Servicio;
import modelo.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-01T20:24:47")
@StaticMetamodel(Empleado.class)
public class Empleado_ { 

    public static volatile CollectionAttribute<Empleado, Servicio> servicioCollection;
    public static volatile SingularAttribute<Empleado, String> paterno;
    public static volatile SingularAttribute<Empleado, Date> fechaNacimiento;
    public static volatile SingularAttribute<Empleado, Usuario> idUsuario;
    public static volatile SingularAttribute<Empleado, String> nombre;
    public static volatile SingularAttribute<Empleado, String> rut;
    public static volatile SingularAttribute<Empleado, String> materno;
    public static volatile SingularAttribute<Empleado, Short> idEmpleado;
    public static volatile SingularAttribute<Empleado, String> correo;
    public static volatile SingularAttribute<Empleado, Integer> celular;
    public static volatile SingularAttribute<Empleado, String> cargo;
    public static volatile SingularAttribute<Empleado, Character> sexo;
    public static volatile SingularAttribute<Empleado, Long> telefono;
    public static volatile CollectionAttribute<Empleado, Orden> ordenCollection;

}