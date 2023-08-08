package com.example.demo.repository.modelo;

import java.math.BigDecimal;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalle_factura")
public class DetalleFactura {

	@Id
	@SequenceGenerator(name = "seq_detalleFactura",sequenceName = "seq_detalleFactura",allocationSize = 1)
	@GeneratedValue(generator = "seq_detalleFactura",strategy = GenerationType.SEQUENCE)
	@Column(name = "deta_id")
	private Integer id;
	
	@Column(name = "deta_cantidad")
	private Integer cantidad;
	
	@Column(name = "deta_precioU")
	private BigDecimal precioU;
	
	@Column(name = "deta_subtotal")
	private BigDecimal subtotal;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "venta_id_dfactura")
	private Factura factura;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "producto_id_dfactura")
	private Producto producto;

	@Override
	public String toString() {
		return "DetalleFactura [id=" + id + ", cantidad=" + cantidad + ", precioU=" + precioU + ", subtotal=" + subtotal
				+ "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecioU() {
		return precioU;
	}

	public void setPrecioU(BigDecimal precioU) {
		this.precioU = precioU;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	
	
}
