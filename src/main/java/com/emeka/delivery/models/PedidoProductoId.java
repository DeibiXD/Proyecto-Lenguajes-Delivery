package com.emeka.delivery.models;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class PedidoProductoId {
    private int idPedido;
    private int idProducto;

  
    @Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PedidoProductoId that = (PedidoProductoId) o;
    return idPedido == that.idPedido && idProducto == that.idProducto;
}

@Override
public int hashCode() {
    return 31 * idPedido + idProducto;
}

}
