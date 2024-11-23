class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe(10); // Precio del vaso
        cafe.agregarIngrediente(new Ingrediente("Leche", 5));
        cafe.agregarIngrediente(new Ingrediente("Chocolate", 8));

        cafe.imprimirResumen();
    }
}
