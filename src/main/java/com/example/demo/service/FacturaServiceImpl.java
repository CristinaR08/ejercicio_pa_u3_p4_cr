package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IFacturaRepository;
import com.example.demo.repository.modelo.Factura;
import com.example.demo.repository.modelo.Producto;

@Service
public class FacturaServiceImpl implements IFacturaService{

	@Autowired
	private IFacturaRepository facturaRepository;
	
	@Override
	public void agregar(Factura factura) {
		this.facturaRepository.insertar(factura);
	}

	@Override
	public void actualizar(Factura factura) {
		this.facturaRepository.actualizar(factura);
		
	}

	@Override
	public List<Producto> reporteProductos() {
		return this.facturaRepository.listaProductos();
	}

}
