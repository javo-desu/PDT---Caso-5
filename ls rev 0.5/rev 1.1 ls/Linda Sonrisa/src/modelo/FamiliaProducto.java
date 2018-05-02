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
@Table(name = "FAMILIA_PRODUCTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FamiliaProducto.findAll", query = "SELECT f FROM FamiliaProducto f")
    , @NamedQuery(name = "FamiliaProducto.findByIdFamilia", query = "SELECT f FROM FamiliaProducto f WHERE f.idFamilia = :idFamilia")
    , @NamedQuery(name = "FamiliaProducto.findByNombre", query = "SELECT f FROM FamiliaProducto f WHERE f.nombre = :nombre")})
public class FamiliaProducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_FAMILIA")
    private Short idFamilia;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idFamilia")
    private Collection<Producto> productoCollection;

    public FamiliaProducto() {
    }

    public FamiliaProducto(Short idFamilia) {
        this.idFamilia = idFamilia;
    }

    public FamiliaProducto(Short idFamilia, String nombre) {
        this.idFamilia = idFamilia;
        this.nombre = nombre;
    }

    public Short getIdFamilia() {
        return idFamilia;
    }

    public void setIdFamilia(Short idFamilia) {
        this.idFamilia = idFamilia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public Collection<Producto> getProductoCollection() {
        return productoCollection;
    }

    public void setProductoCollection(Collection<Producto> productoCollection) {
        this.productoCollection = productoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFamilia != null ? idFamilia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FamiliaProducto)) {
            return false;
        }
        FamiliaProducto other = (FamiliaProducto) object;
        if ((this.idFamilia == null && other.idFamilia != null) || (this.idFamilia != null && !this.idFamilia.equals(other.idFamilia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "linda.sonrisa.FamiliaProducto[ idFamilia=" + idFamilia + " ]";
    }
    
}
