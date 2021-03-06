package com.pss.simulador.bs.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
*
* @author Adolfo Espinoza
* @version 1.0, 12/01/2016
* @since 1.0
*/
@Entity
@Table(name = "TSI005_GENERAL", schema="BBVATESOR")
public class General implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(name = "secGeneral", sequenceName = "BBVATESOR.SEQ_GENERAL", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "secGeneral")
	@Column(name = "CD_IDGENERAL", nullable = false)
	private Integer cdIdgeneral;
	@Column(name = "NB_DOMINIO", length = 30)
	private String nbDominio;
	@Column(name = "NB_DESC_GENERAL", length = 60)
	private String nbDescGeneral;
	@Column(name = "NB_VALOR_GENERAL", length = 40)
	private String nbValorGeneral;
	@Column(name = "ST_ESTADO")
	private String stEstado;
	@Column(name = "FH_FEC_CREACION")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fhFecCreacion;
	@Column(name = "CD_USU_CREACION", length = 10)
	private String cdUsuCreacion;
	@Column(name = "FH_FEC_MODIFICA")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fhFecModifica;
	@Column(name = "CD_USU_MODIFICA", length = 10)
	private String cdUsuModifica;
	@Column(name = "FH_FEC_ELIMINA")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fhFecElimina;
	@Column(name = "CD_USU_ELIMINA", length = 10)
	private String cdUsuElimina;
	@Column(name = "FG_EDITABLE")
	private String fgEditable;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "contraparte")
    private List<Orden> ordenContraparteList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "operacion")
    private List<Orden> ordenOperacionList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "especie")
    private List<Orden> ordenEspecieList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "intermediario")
    private List<Orden> ordenIntermediarioList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "lugar")
    private List<Orden> ordenLugarList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pais")
    private List<Orden> ordenPaisList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoMoneda")
    private List<Orden> ordenTipoMonedaList;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cdIdgeneral")
    private List<OrdenEstado> ordenEstadoList;
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "general")
	private List<LimFondoEspecie> limFondoEspecieList;
	
	public General() {
	}

	public General(Integer cdIdgeneral) {
		this.cdIdgeneral = cdIdgeneral;
	}

	public Integer getCdIdgeneral() {
		return cdIdgeneral;
	}

	public void setCdIdgeneral(Integer cdIdgeneral) {
		this.cdIdgeneral = cdIdgeneral;
	}

	public String getNbDominio() {
		return nbDominio;
	}

	public void setNbDominio(String nbDominio) {
		this.nbDominio = nbDominio;
	}

	public String getNbDescGeneral() {
		return nbDescGeneral;
	}

	public void setNbDescGeneral(String nbDescGeneral) {
		this.nbDescGeneral = nbDescGeneral;
	}

	public String getNbValorGeneral() {
		return nbValorGeneral;
	}

	public void setNbValorGeneral(String nbValorGeneral) {
		this.nbValorGeneral = nbValorGeneral;
	}

	public String getStEstado() {
		return stEstado;
	}

	public void setStEstado(String stEstado) {
		this.stEstado = stEstado;
	}

	public Date getFhFecCreacion() {
		return fhFecCreacion;
	}

	public void setFhFecCreacion(Date fhFecCreacion) {
		this.fhFecCreacion = fhFecCreacion;
	}

	public String getCdUsuCreacion() {
		return cdUsuCreacion;
	}

	public void setCdUsuCreacion(String cdUsuCreacion) {
		this.cdUsuCreacion = cdUsuCreacion;
	}

	public Date getFhFecModifica() {
		return fhFecModifica;
	}

	public void setFhFecModifica(Date fhFecModifica) {
		this.fhFecModifica = fhFecModifica;
	}

	public String getCdUsuModifica() {
		return cdUsuModifica;
	}

	public void setCdUsuModifica(String cdUsuModifica) {
		this.cdUsuModifica = cdUsuModifica;
	}

	public Date getFhFecElimina() {
		return fhFecElimina;
	}

	public void setFhFecElimina(Date fhFecElimina) {
		this.fhFecElimina = fhFecElimina;
	}

	public String getCdUsuElimina() {
		return cdUsuElimina;
	}

	public void setCdUsuElimina(String cdUsuElimina) {
		this.cdUsuElimina = cdUsuElimina;
	}

	public List<LimFondoEspecie> getLimFondoEspecieList() {
		return limFondoEspecieList;
	}

	public void setLimFondoEspecieList(List<LimFondoEspecie> limFondoEspecieList) {
		this.limFondoEspecieList = limFondoEspecieList;
	}

	public String getFgEditable() {
		return fgEditable;
	}
	
	public void setFgEditable(String fgEditable) {
		this.fgEditable = fgEditable;
	}

	public List<Orden> getOrdenContraparteList() {
		return ordenContraparteList;
	}

	public void setOrdenContraparteList(List<Orden> ordenContraparteList) {
		this.ordenContraparteList = ordenContraparteList;
	}

	public List<Orden> getOrdenOperacionList() {
		return ordenOperacionList;
	}

	public void setOrdenOperacionList(List<Orden> ordenOperacionList) {
		this.ordenOperacionList = ordenOperacionList;
	}

	public List<Orden> getOrdenIntermediarioList() {
		return ordenIntermediarioList;
	}

	public void setOrdenIntermediarioList(List<Orden> ordenIntermediarioList) {
		this.ordenIntermediarioList = ordenIntermediarioList;
	}

	public List<Orden> getOrdenLugarList() {
		return ordenLugarList;
	}

	public void setOrdenLugarList(List<Orden> ordenLugarList) {
		this.ordenLugarList = ordenLugarList;
	}

	public List<Orden> getOrdenPaisList() {
		return ordenPaisList;
	}

	public void setOrdenPaisList(List<Orden> ordenPaisList) {
		this.ordenPaisList = ordenPaisList;
	}

	public List<Orden> getOrdenTipoMonedaList() {
		return ordenTipoMonedaList;
	}

	public void setOrdenTipoMonedaList(List<Orden> ordenTipoMonedaList) {
		this.ordenTipoMonedaList = ordenTipoMonedaList;
	}

	public List<OrdenEstado> getOrdenEstadoList() {
		return ordenEstadoList;
	}

	public void setOrdenEstadoList(List<OrdenEstado> ordenEstadoList) {
		this.ordenEstadoList = ordenEstadoList;
	}

	public List<Orden> getOrdenEspecieList() {
		return ordenEspecieList;
	}

	public void setOrdenEspecieList(List<Orden> ordenEspecieList) {
		this.ordenEspecieList = ordenEspecieList;
	}

}
