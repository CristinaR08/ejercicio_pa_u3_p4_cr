package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Factura;
import com.example.demo.repository.modelo.Producto;

public interface IFacturaRepository {

	public void insertar(Factura factura);
	public void actualizar(Factura factura);
	public List<Producto> listaProductos();
	
}
