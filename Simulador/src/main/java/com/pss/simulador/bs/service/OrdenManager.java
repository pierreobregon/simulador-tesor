package com.pss.simulador.bs.service;

import java.util.List;

import com.pss.simulador.bs.domain.DetalleOrden;
import com.pss.simulador.bs.domain.Orden;
import com.pss.simulador.bs.domain.OrdenEstado;
import com.pss.simulador.bs.domain.OrdenFondo;

/**
*
* @author Adolfo Espinoza
* @version 1.0, 28/01/2016
* @since 1.0
*/
public interface OrdenManager {

	public List<Orden> findByFilter(String idOperacion, String strEstado, String strUserName);
	public List<OrdenEstado> findEstadoByOrden(Integer idOrden);
	public List<DetalleOrden> findDetalleByOrden(Integer idOrden);
	public Orden save(Orden orden);
	public OrdenEstado saveEstado(OrdenEstado ordenEstado);
	public DetalleOrden saveDetalle(DetalleOrden detalleOrden);
	public OrdenFondo saveOrdenFondo(OrdenFondo ordenFondo);
	public List<OrdenFondo> findFondoByOrden(Integer idOrden);
	
	public Orden deshabilitaOrden(Orden orden);
}
