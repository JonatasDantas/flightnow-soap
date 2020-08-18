package com.flightnow.ws;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.flightnow.modelo.Usuario;
import com.flightnow.modelo.Voo;
import com.flightnow.modelo.VooPassageiro;

@WebService
public class FlightWS {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("usuarios");
	EntityManager manager = factory.createEntityManager();

	public List<Usuario> getUsuarios() {
		String jpql = "select m from Usuario m";
		Query query = manager.createQuery(jpql);
		
		List<Usuario> resultList = query.getResultList();
		
		return resultList;
	}
	
	public List<Usuario> getUsuarioById(@WebParam(name= "userId") Integer id) {
		String jpql = "SELECT m FROM Usuario m WHERE m.id = :pId";
		Query query = manager.createQuery(jpql);
		query.setParameter("pId", id);
		
		List<Usuario> resultList = query.getResultList();

		return resultList;
	}
	
	public List<Voo> getFlightsByUserId(@WebParam(name= "userId") Integer id) {
		String jpql = "SELECT m FROM Voo m WHERE m.usuarioId = :pId";
		Query query = manager.createQuery(jpql);
		query.setParameter("pId", id);
		
		List<Voo> resultList = query.getResultList();

		return resultList;
	}
}
