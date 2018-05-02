package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Usuario;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-01T20:24:47")
@StaticMetamodel(Control.class)
public class Control_ { 

    public static volatile SingularAttribute<Control, String> descripcion;
    public static volatile SingularAttribute<Control, Short> idControl;
    public static volatile CollectionAttribute<Control, Usuario> usuarioCollection;
    public static volatile SingularAttribute<Control, String> nombre;
    public static volatile SingularAttribute<Control, Short> nivel;
    public static volatile SingularAttribute<Control, Short> intentos;

}