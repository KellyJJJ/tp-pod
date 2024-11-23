import java.util.ArrayList;
import java.util.List;

public class Cafe {
    private static final int PRECIO_BASE = 15;
    private int precioVaso;
    private List<Ingrediente> ingredientes;

    public Cafe(int precioVaso) {
        if (precioVaso < 0) {
            throw new IllegalArgumentException("El precio del vaso no puede ser negativo.");
        }
        this.precioVaso = precioVaso;
        this.ingredientes = new ArrayList<>();
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        if (ingrediente == null) {
            throw new IllegalArgumentException("El ingrediente no puede ser null.");
        }
        ingredientes.add(ingrediente);
    }

    public int calcularPrecioTotal() {
        int precioTotal = PRECIO_BASE + precioVaso;
        for (Ingrediente ingrediente : ingredientes) {
            precioTotal += ingrediente.getPrecio();
        }
        return precioTotal;
    }

    public void imprimirResumen() {
        System.out.println("Resumen de pedido:");
        System.out.println("Café base: $" + PRECIO_BASE);
        System.out.println("Precio del vaso: $" + precioVaso);
        System.out.println("Ingredientes:");
        for (Ingrediente ingrediente : ingredientes) {
            System.out.println(" - " + ingrediente.getNombre() + ": $" + ingrediente.getPrecio());
        }
        System.out.println("Precio total: $" + calcularPrecioTotal());
    }
}
