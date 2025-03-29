package com.emeka.delivery.models;

import java.time.LocalDateTime;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpedido")
    private int idPedido;
    private LocalDateTime fechaPedido;
    private LocalDateTime fechaFinal;
    private double costoEnvioTotal;
    private double montoTotalDeProductos;

    @OneToOne
    @JoinColumn(name = "idcomprador", referencedColumnName = "idusuario")
    private Usuario comprador;
    @OneToOne
    @JoinColumn(name = "idrepartidor", referencedColumnName = "idusuario")
    private Usuario repartidor;
    @OneToOne
    @JoinColumn(name = "idestado", referencedColumnName = "idestado")
    private Estado estado;
    @OneToOne
    @JoinColumn(name = "idpago", referencedColumnName = "idpago")   
    private Pago pago;
    @OneToOne
    @JoinColumn(name = "idempresa", referencedColumnName = "idempresa")
    private Empresa empresa;
    

       @ManyToMany
    @JoinTable(
        name = "pedidoproductos", // Nombre de la tabla intermedia
        joinColumns = @JoinColumn(name = "idpedido"), // Clave foránea a la tabla de pedidos
        inverseJoinColumns = @JoinColumn(name = "idproducto") // Clave foránea a la tabla de productos
    )
    private Set<Producto> productos; // Usamos un Set para evitar duplicados
}
