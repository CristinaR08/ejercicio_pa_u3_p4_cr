package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.DetalleFactura;
import com.example.demo.repository.modelo.Factura;
import com.example.demo.repository.modelo.Producto;
import com.example.demo.service.IDetalleFacturaService;
import com.example.demo.service.IFacturaService;
import com.example.demo.service.IProductoService;

@SpringBootApplication
public class EjercicioPaU3P4CrApplication implements CommandLineRunner{

	
	
	public static void main(String[] args){
		SpringApplication.run(EjercicioPaU3P4CrApplication.class, args);
	}

	@Autowired 
	private IProductoService productoService;
	
	@Autowired 
	private IFacturaService facturaService;
	
	@Autowired 
	private IDetalleFacturaService detalleFacturaService;
	
	@Override
	public void run(String... args) throws Exception {
		
		Producto p1 = new Producto();
		p1.setCodigoBarras("1579863200");
		p1.setNombre("Gatorade");
		p1.setCategoria("Bebida");
		p1.setStock(6);
		p1.setPrecio(new BigDecimal(1.00));
		this.productoService.registrar(p1);
		
		Producto p2 = new Producto();
		p2.setCodigoBarras("1479680023");
		p2.setNombre("VitaminaC");
		p2.setCategoria("Vitaminas");
		p2.setStock(15);
		p2.setPrecio(new BigDecimal(3.80));
		this.productoService.registrar(p2);
		
		Factura f1 = new Factura();
		f1.setCedulaCliente("1726600537");
		f1.setFecha(LocalDateTime.now());
		f1.setTotalFactura(p1.getPrecio().add(p2.getPrecio()));
		this.facturaService.agregar(f1);
		
		DetalleFactura df1 = new DetalleFactura();
		df1.setFactura(f1);
		df1.setCantidad(2);
		df1.setProducto(p1);
		df1.setPrecioU(p1.getPrecio());
		df1.setProducto(p2);
		df1.setSubtotal(p1.getPrecio().add(p2.getPrecio()));
		this.detalleFacturaService.agregar(df1);
		
		
		System.out.println(this.facturaService.reporteProductos());
	
	}
	

}
