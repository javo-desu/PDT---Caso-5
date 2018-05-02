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
@Table(name = "SITUACION_ECONOMICA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SituacionEconomica.findAll", query = "SELECT s FROM SituacionEconomica s")
    , @NamedQuery(name = "SituacionEconomica.findByIdSituacionEconomica", query = "SELECT s FROM SituacionEconomica s WHERE s.idSituacionEconomica = :idSituacionEconomica")})
public class SituacionEconomica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_SITUACION_ECONOMICA")
    private Short idSituacionEconomica;
    @Basic(optional = false)
    @Lob
    @Column(name = "LIQUIDACION_DE_SUELDO")
    private Serializable liquidacionDeSueldo;
    @Basic(optional = false)
    @Lob
    @Column(name = "CERTIFICADO_AFP")
    private Serializable certificadoAfp;
    @Basic(optional = false)
    @Lob
    @Column(name = "FINIQUITO")
    private Serializable finiquito;
    @JoinColumn(name = "ID_CLIENTE", referencedColumnName = "ID_CLIENTE")
    @ManyToOne(optional = false)
    private Cliente idCliente;

    public SituacionEconomica() {
    }

    public SituacionEconomica(Short idSituacionEconomica) {
        this.idSituacionEconomica = idSituacionEconomica;
    }

    public SituacionEconomica(Short idSituacionEconomica, Serializable liquidacionDeSueldo, Serializable certificadoAfp, Serializable finiquito) {
        this.idSituacionEconomica = idSituacionEconomica;
        this.liquidacionDeSueldo = liquidacionDeSueldo;
        this.certificadoAfp = certificadoAfp;
        this.finiquito = finiquito;
    }

    public Short getIdSituacionEconomica() {
        return idSituacionEconomica;
    }

    public void setIdSituacionEconomica(Short idSituacionEconomica) {
        this.idSituacionEconomica = idSituacionEconomica;
    }

    public Serializable getLiquidacionDeSueldo() {
        return liquidacionDeSueldo;
    }

    public void setLiquidacionDeSueldo(Serializable liquidacionDeSueldo) {
        this.liquidacionDeSueldo = liquidacionDeSueldo;
    }

    public Serializable getCertificadoAfp() {
        return certificadoAfp;
    }

    public void setCertificadoAfp(Serializable certificadoAfp) {
        this.certificadoAfp = certificadoAfp;
    }

    public Serializable getFiniquito() {
        return finiquito;
    }

    public void setFiniquito(Serializable finiquito) {
        this.finiquito = finiquito;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSituacionEconomica != null ? idSituacionEconomica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SituacionEconomica)) {
            return false;
        }
        SituacionEconomica other = (SituacionEconomica) object;
        if ((this.idSituacionEconomica == null && other.idSituacionEconomica != null) || (this.idSituacionEconomica != null && !this.idSituacionEconomica.equals(other.idSituacionEconomica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "linda.sonrisa.SituacionEconomica[ idSituacionEconomica=" + idSituacionEconomica + " ]";
    }
    
}
