package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import com.example.demo.repository.modelo.Producto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class RepositoryProductoImpl implements IRepositoryProducto{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Producto producto) {
		this.entityManager.persist(producto);
		
	}

	@Override
	public void actualizar(Producto producto) {
		this.entityManager.merge(producto);		
	}
	
}
