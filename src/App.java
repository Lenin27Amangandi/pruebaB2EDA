public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Lenin Amangandi Prueba EDA");
        System.out.println(".".repeat(20) + "Primer Ejercicio" + ".".repeat(20));

        ArbolBinario arbol = new ArbolBinario();
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(70);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(60);
        arbol.insertar(80);
        arbol.insertar(15);
        arbol.insertar(95);
        arbol.insertar(25);
        arbol.insertar(12);

        arbol.imprimirComoArbol();

    }
}
