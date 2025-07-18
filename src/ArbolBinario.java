import java.util.LinkedList;
import java.util.Queue;

public class ArbolBinario {
    Nodo raiz;

    public ArbolBinario() {
        this.raiz = null;
    }
    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }
    private Nodo insertarRecursivo(Nodo nodo, int valor) {
        if (nodo == null) {
            return new Nodo(valor);
        }
        if (valor < nodo.valor) {
            nodo.izquierdo = insertarRecursivo(nodo.izquierdo, valor);
        } else if (valor > nodo.valor) {
            nodo.derecho = insertarRecursivo(nodo.derecho, valor);
        }
        return nodo;
    }
    public void imprimirComoArbol() {
        if (raiz == null)
            return;
        Queue<Nodo> cola = new LinkedList<>();
        cola.add(raiz);
        int nivel = 0;
        int nodosEnNivel = 1;
        while (!cola.isEmpty()) {
            int siguienteNivel = 0;
            for (int i = 0; i < Math.pow(2, 4 - nivel); i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < nodosEnNivel; i++) {
                Nodo actual = cola.poll();
                if (actual != null) {
                    System.out.print(actual.valor);
                    cola.add(actual.izquierdo);
                    cola.add(actual.derecho);
                } else {
                    System.out.print(" ");
                    cola.add(null);
                    cola.add(null);
                }
                for (int j = 0; j < Math.pow(2, 5 - nivel) - 1; j++) {
                    System.out.print(" ");
                }
                siguienteNivel += 2;
            }
            System.out.println();
            nivel++;
            if (nivel > 5)
                break;
            nodosEnNivel = siguienteNivel;
        }
    }

    public int calcularSaltosExtremos() {
        Nodo actualIzq = raiz;
        int pasosIzq = 0;
        while (actualIzq != null && actualIzq.izquierdo != null) {
            actualIzq = actualIzq.izquierdo;
            pasosIzq++;
        }
        Nodo actualDer = raiz;
        int pasosDer = 0;
        while (actualDer != null && actualDer.derecho != null) {
            actualDer = actualDer.derecho;
            pasosDer++;
        }
        return pasosIzq + pasosDer;
    }
}
