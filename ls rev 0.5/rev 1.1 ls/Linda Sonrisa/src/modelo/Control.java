/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author JAVO-KUN
 */
@Entity
@Table(name = "CONTROL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Control.findAll", query = "SELECT c FROM Control c")
    , @NamedQuery(name = "Control.findByIdControl", query = "SELECT c FROM Control c WHERE c.idControl = :idControl")
    , @NamedQuery(name = "Control.findByNombre", query = "SELECT c FROM Control c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Control.findByDescripcion", query = "SELECT c FROM Control c WHERE c.descripcion = :descripcion")
    , @NamedQuery(name = "Control.findByNivel", query = "SELECT c FROM Control c WHERE c.nivel = :nivel")
    , @NamedQuery(name = "Control.findByIntentos", query = "SELECT c FROM Control c WHERE c.intentos = :intentos")})
public class Control implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_CONTROL")
    private Short idControl;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "NIVEL")
    private short nivel;
    @Basic(optional = false)
    @Column(name = "INTENTOS")
    private short intentos;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idControl")
    private Collection<Usuario> usuarioCollection;

    public Control() {
    }

    public Control(Short idControl) {
        this.idControl = idControl;
    }

    public Control(Short idControl, String nombre, String descripcion, short nivel, short intentos) {
        this.idControl = idControl;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.nivel = nivel;
        this.intentos = intentos;
    }

    public Short getIdControl() {
        return idControl;
    }

    public void setIdControl(Short idControl) {
        this.idControl = idControl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public short getNivel() {
        return nivel;
    }

    public void setNivel(short nivel) {
        this.nivel = nivel;
    }

    public short getIntentos() {
        return intentos;
    }

    public void setIntentos(short intentos) {
        this.intentos = intentos;
    }

    @XmlTransient
    public Collection<Usuario> getUsuarioCollection() {
        return usuarioCollection;
    }

    public void setUsuarioCollection(Collection<Usuario> usuarioCollection) {
        this.usuarioCollection = usuarioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idControl != null ? idControl.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Control)) {
            return false;
        }
        Control other = (Control) object;
        if ((this.idControl == null && other.idControl != null) || (this.idControl != null && !this.idControl.equals(other.idControl))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "linda.sonrisa.Control[ idControl=" + idControl + " ]";
    }
    
}
