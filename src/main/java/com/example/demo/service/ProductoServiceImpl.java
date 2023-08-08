package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IRepositoryProducto;
import com.example.demo.repository.modelo.Producto;

@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private IRepositoryProducto repositoryProducto;
	
	@Override
	public void registrar(Producto producto) {
		this.repositoryProducto.insertar(producto);
	}

	@Override
	public void actualizar(Producto producto) {
		this.repositoryProducto.actualizar(producto);
		
	}


}
