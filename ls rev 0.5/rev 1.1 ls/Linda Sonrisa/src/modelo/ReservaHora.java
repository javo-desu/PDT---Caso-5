/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JAVO-KUN
 */
@Entity
@Table(name = "RESERVA_HORA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReservaHora.findAll", query = "SELECT r FROM ReservaHora r")
    , @NamedQuery(name = "ReservaHora.findByIdReserva", query = "SELECT r FROM ReservaHora r WHERE r.idReserva = :idReserva")
    , @NamedQuery(name = "ReservaHora.findByFechaHora", query = "SELECT r FROM ReservaHora r WHERE r.fechaHora = :fechaHora")})
public class ReservaHora implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID_RESERVA")
    private Short idReserva;
    @Basic(optional = false)
    @Column(name = "FECHA_HORA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHora;
    @JoinColumn(name = "ID_CLIENTE", referencedColumnName = "ID_CLIENTE")
    @ManyToOne(optional = false)
    private Cliente idCliente;
    @JoinColumn(name = "ID_SERVICIO", referencedColumnName = "ID_SERVICIO")
    @ManyToOne(optional = false)
    private Servicio idServicio;

    public ReservaHora() {
    }

    public ReservaHora(Short idReserva) {
        this.idReserva = idReserva;
    }

    public ReservaHora(Short idReserva, Date fechaHora) {
        this.idReserva = idReserva;
        this.fechaHora = fechaHora;
    }

    public Short getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Short idReserva) {
        this.idReserva = idReserva;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public Servicio getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(Servicio idServicio) {
        this.idServicio = idServicio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReserva != null ? idReserva.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReservaHora)) {
            return false;
        }
        ReservaHora other = (ReservaHora) object;
        if ((this.idReserva == null && other.idReserva != null) || (this.idReserva != null && !this.idReserva.equals(other.idReserva))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "linda.sonrisa.ReservaHora[ idReserva=" + idReserva + " ]";
    }
    
}
