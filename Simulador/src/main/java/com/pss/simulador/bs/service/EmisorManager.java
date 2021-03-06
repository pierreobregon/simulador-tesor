/**
 * 
 */
package com.pss.simulador.bs.service;

import java.util.List;

import com.pss.simulador.bs.domain.Emisor;
import com.pss.simulador.bs.domain.LimitesEmisor;

/**
 * @author pierre.obregon
 * @version 25/1/2016
 */	
public interface EmisorManager {

	public List<Emisor> findEmisorByNameAndType(Emisor emisorBusqueda);
	public Emisor save(Emisor emisor);
	public LimitesEmisor saveLimiteEmisor(LimitesEmisor limitesEmisor);
	public LimitesEmisor findByFondoAndEmisor(LimitesEmisor limitesEmisor);
	public List<Emisor> findByFund(String strNomFondo);
	public List<Emisor> findAllActive();
}
