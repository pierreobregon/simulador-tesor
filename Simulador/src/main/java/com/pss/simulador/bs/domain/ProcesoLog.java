package com.pss.simulador.bs.domain;
// default package
// Generated 31/01/2016 07:26:53 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Tsi017Procesolog generated by hbm2java
 */
@Entity
@Table(name = "TSI017_PROCESOLOG", schema="BBVATESOR")
public class ProcesoLog implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer cdIdlog;
	private ProcesoCarga procesoCarga;
	private Date fhFecreg;
	private String tpTipomensaje;
	private String msMensaje;

	public ProcesoLog() {
	}

	public ProcesoLog(Integer cdIdlog) {
		this.cdIdlog = cdIdlog;
	}

	public ProcesoLog(Integer cdIdlog,
			ProcesoCarga procesoCarga, Date fhFecreg,
			String tpTipomensaje, String msMensaje) {
		this.cdIdlog = cdIdlog;
		this.procesoCarga = procesoCarga;
		this.fhFecreg = fhFecreg;
		this.tpTipomensaje = tpTipomensaje;
		this.msMensaje = msMensaje;
	}

	@Id
	@SequenceGenerator(name = "secProcesoLog", sequenceName = "BBVATESOR.SEQ_PROCESOLOG", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "secProcesoLog")
	@Column(name = "CD_IDLOG", unique = true, nullable = false, precision = 22, scale = 0)
	public Integer getCdIdlog() {
		return this.cdIdlog;
	}

	public void setCdIdlog(Integer cdIdlog) {
		this.cdIdlog = cdIdlog;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CD_IDPROCESO")
	public ProcesoCarga getProcesoCarga() {
		return procesoCarga;
	}

	public void setProcesoCarga(ProcesoCarga procesoCarga) {
		this.procesoCarga = procesoCarga;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FH_FECREG", length = 7)
	public Date getFhFecreg() {
		return this.fhFecreg;
	}

	
	public void setFhFecreg(Date fhFecreg) {
		this.fhFecreg = fhFecreg;
	}

	@Column(name = "TP_TIPOMENSAJE", length = 10)
	public String getTpTipomensaje() {
		return this.tpTipomensaje;
	}

	public void setTpTipomensaje(String tpTipomensaje) {
		this.tpTipomensaje = tpTipomensaje;
	}

	@Column(name = "MS_MENSAJE", length = 200)
	public String getMsMensaje() {
		return this.msMensaje;
	}

	public void setMsMensaje(String msMensaje) {
		this.msMensaje = msMensaje;
	}

}
