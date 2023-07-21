package com.ejemplo.model;
import java.time.LocalDate;

public class Factura {
    private Long id;
    private LocalDate fecha;
    private double monto;

    // Constructor vacío requerido por JPA
    public Factura() {
    }

    // Constructor con todos los atributos
    public Factura(Long id, LocalDate fecha, double monto) {
        this.id = id;
        this.fecha = fecha;
        this.monto = monto;
    }
    // Getters y setters para todos los atributos
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
}
