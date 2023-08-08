package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.DetalleFactura;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class DetalleFacturaRepoImpl implements IDetalleFacturaRepo{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(DetalleFactura detalleFactura) {
		this.entityManager.merge(detalleFactura);
		
	}
	
	
	
}
