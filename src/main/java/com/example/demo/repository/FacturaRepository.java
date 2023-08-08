package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Factura;
import com.example.demo.repository.modelo.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class FacturaRepository implements IFacturaRepository{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Factura factura) {
		this.entityManager.persist(factura);
		
	}

	@Override
	public void actualizar(Factura factura) {
		this.entityManager.merge(factura);
		
	}

	@Override
	public List<Producto> listaProductos() {
		TypedQuery<Producto> myQuery = this.entityManager.createQuery("SELECT p FROM Producto p JOIN p.detalleFactura d",Producto.class);
		return myQuery.getResultList();
	}


	
 
	
}
