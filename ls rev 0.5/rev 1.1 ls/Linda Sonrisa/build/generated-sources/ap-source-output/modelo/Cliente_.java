package modelo;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Boleta;
import modelo.ReservaHora;
import modelo.SituacionEconomica;
import modelo.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-01T20:24:47")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile CollectionAttribute<Cliente, ReservaHora> reservaHoraCollection;
    public static volatile SingularAttribute<Cliente, String> paterno;
    public static volatile SingularAttribute<Cliente, Date> fechaNacimiento;
    public static volatile SingularAttribute<Cliente, Usuario> idUsuario;
    public static volatile SingularAttribute<Cliente, String> direccion;
    public static volatile SingularAttribute<Cliente, String> nombre;
    public static volatile SingularAttribute<Cliente, String> rut;
    public static volatile CollectionAttribute<Cliente, SituacionEconomica> situacionEconomicaCollection;
    public static volatile SingularAttribute<Cliente, String> materno;
    public static volatile SingularAttribute<Cliente, Short> idCliente;
    public static volatile SingularAttribute<Cliente, String> correo;
    public static volatile SingularAttribute<Cliente, Integer> celular;
    public static volatile CollectionAttribute<Cliente, Boleta> boletaCollection;
    public static volatile SingularAttribute<Cliente, Character> sexo;
    public static volatile SingularAttribute<Cliente, Long> telefono;

}