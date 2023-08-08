package com.example.demo.repository.modelo.dto;

import java.util.List;

import com.example.demo.repository.modelo.Producto;

public class FacturaDTO {

	private String codigoBarras;
	private Integer cantidad;
	private String cedulaCliente;
	private List<Producto> listaProducto;
	
	public FacturaDTO() {
		
	}
	
	public FacturaDTO(String codigoBarras, Integer cantidad, String cedulaCliente) {
		super();
		this.codigoBarras = codigoBarras;
		this.cantidad = cantidad;
		this.cedulaCliente = cedulaCliente;
	}

	 public FacturaDTO(List<Producto> listaProductos, String cedulaCliente) {
	        this.listaProducto = listaProductos;
	        this.cedulaCliente = cedulaCliente;
	 }
	
	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public String getCedulaCliente() {
		return cedulaCliente;
	}

	public void setCedulaCliente(String cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}
	
	
	
}
