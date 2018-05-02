/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JAVO-KUN
 */
@Entity
@Table(name = "REGISTRO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Registro.findAll", query = "SELECT r FROM Registro r")
    , @NamedQuery(name = "Registro.findByIdRegistro", query = "SELECT r FROM Registro r WHERE r.idRegistro = :idRegistro")})
public class Registro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_REGISTRO")
    private Short idRegistro;
    @Basic(optional = false)
    @Lob
    @Column(name = "COPIA")
    private Serializable copia;
    @JoinColumn(name = "ORDEN_ID_ORDEN", referencedColumnName = "ID_ORDEN")
    @ManyToOne(optional = false)
    private Orden ordenIdOrden;

    public Registro() {
    }

    public Registro(Short idRegistro) {
        this.idRegistro = idRegistro;
    }

    public Registro(Short idRegistro, Serializable copia) {
        this.idRegistro = idRegistro;
        this.copia = copia;
    }

    public Short getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(Short idRegistro) {
        this.idRegistro = idRegistro;
    }

    public Serializable getCopia() {
        return copia;
    }

    public void setCopia(Serializable copia) {
        this.copia = copia;
    }

    public Orden getOrdenIdOrden() {
        return ordenIdOrden;
    }

    public void setOrdenIdOrden(Orden ordenIdOrden) {
        this.ordenIdOrden = ordenIdOrden;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRegistro != null ? idRegistro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Registro)) {
            return false;
        }
        Registro other = (Registro) object;
        if ((this.idRegistro == null && other.idRegistro != null) || (this.idRegistro != null && !this.idRegistro.equals(other.idRegistro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "linda.sonrisa.Registro[ idRegistro=" + idRegistro + " ]";
    }
    
}
