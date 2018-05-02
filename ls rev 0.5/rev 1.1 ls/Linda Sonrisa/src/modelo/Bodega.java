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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JAVO-KUN
 */
@Entity
@Table(name = "BODEGA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bodega.findAll", query = "SELECT b FROM Bodega b")
    , @NamedQuery(name = "Bodega.findByIdBodega", query = "SELECT b FROM Bodega b WHERE b.idBodega = :idBodega")
    , @NamedQuery(name = "Bodega.findByStockCritico", query = "SELECT b FROM Bodega b WHERE b.stockCritico = :stockCritico")
    , @NamedQuery(name = "Bodega.findByStock", query = "SELECT b FROM Bodega b WHERE b.stock = :stock")})
public class Bodega implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_BODEGA")
    private Short idBodega;
    @Basic(optional = false)
    @Column(name = "STOCK_CRITICO")
    private short stockCritico;
    @Basic(optional = false)
    @Column(name = "STOCK")
    private short stock;
    @JoinColumn(name = "ID_PRODUCTO", referencedColumnName = "ID_PRODUCTO")
    @OneToOne(optional = false)
    private Producto idProducto;

    public Bodega() {
    }

    public Bodega(Short idBodega) {
        this.idBodega = idBodega;
    }

    public Bodega(Short idBodega, short stockCritico, short stock) {
        this.idBodega = idBodega;
        this.stockCritico = stockCritico;
        this.stock = stock;
    }

    public Short getIdBodega() {
        return idBodega;
    }

    public void setIdBodega(Short idBodega) {
        this.idBodega = idBodega;
    }

    public short getStockCritico() {
        return stockCritico;
    }

    public void setStockCritico(short stockCritico) {
        this.stockCritico = stockCritico;
    }

    public short getStock() {
        return stock;
    }

    public void setStock(short stock) {
        this.stock = stock;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idBodega != null ? idBodega.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bodega)) {
            return false;
        }
        Bodega other = (Bodega) object;
        if ((this.idBodega == null && other.idBodega != null) || (this.idBodega != null && !this.idBodega.equals(other.idBodega))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "linda.sonrisa.Bodega[ idBodega=" + idBodega + " ]";
    }
    
}
