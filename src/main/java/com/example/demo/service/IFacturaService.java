package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Factura;
import com.example.demo.repository.modelo.Producto;

public interface IFacturaService {

	public void agregar(Factura factura);
	public void actualizar(Factura factura);
	public List<Producto> reporteProductos();
	
}
