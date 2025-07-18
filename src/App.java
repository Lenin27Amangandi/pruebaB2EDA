public class App {

// 1. Calcular el diámetro del árbol: la longitud del camino más largo entre dos nodos.

// 2. Intercambia los valores de los nodos en niveles alternos del árbol (ej: nivel 1 con nivel 3, etc.).

// 3. Dado un árbol binario, construye su árbol espejo (los subárboles izquierdo y derecho se intercambian recursivamente).Aplicar POO.
    public static void main(String[] args) throws Exception {
        System.out.println("Lenin Amangandi Prueba EDA");
        
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
        arbol.insertar(225);
        arbol.insertar(12);
        arbol.insertar(6);
        // arbol.insertar(18);
        
        arbol.imprimirComoArbol();

        System.out.println(".".repeat(20) + "Primer Ejercicio" + ".".repeat(20));
        System.out.println("Longitud entre camino mas largo de los nodos: " + arbol.calcularSaltosExtremos());
        System.out.println(".".repeat(20) + "Segundo Ejercicio" + ".".repeat(20));
        
        System.out.println(".".repeat(20) + "Segundo Tercer Ejercicio" + ".".repeat(20));

    }
}
