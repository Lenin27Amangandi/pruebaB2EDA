
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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

    // public void imprimirEnOrden() {
    //     imprimirEnOrdenRecursivo(raiz);
    // }

    // private void imprimirEnOrdenRecursivo(Nodo nodo) {
    //     if (nodo != null) {
    //         imprimirEnOrdenRecursivo(nodo.izquierdo);
    //         System.out.print(nodo.valor + " ");
    //         imprimirEnOrdenRecursivo(nodo.derecho);
    //     }
    // }

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

    // public void imprimirComoArbol2() {
    //     if (raiz == null)
    //         return;

    //     int maxNivel = altura(raiz);
    //     List<Nodo> nivelActual = new ArrayList<>();
    //     nivelActual.add(raiz);

    //     int nivel = 1;

    //     while (nivel <= maxNivel) {
    //         int espaciosInicio = (int) Math.pow(2, maxNivel - nivel + 1) - 1;
    //         int espaciosEntre = (int) Math.pow(2, maxNivel - nivel + 2) - 1;

    //         for (int i = 0; i < espaciosInicio; i++)
    //             System.out.print(" ");
    //         List<Nodo> siguienteNivel = new ArrayList<>();

    //         for (Nodo nodo : nivelActual) {
    //             if (nodo != null) {
    //                 System.out.printf("%2d", nodo.valor);
    //                 siguienteNivel.add(nodo.izquierdo);
    //                 siguienteNivel.add(nodo.derecho);
    //             } else {
    //                 System.out.print("  ");
    //                 siguienteNivel.add(null);
    //                 siguienteNivel.add(null);
    //             }

    //             for (int i = 0; i < espaciosEntre; i++)
    //                 System.out.print(" ");
    //         }
    //         System.out.println();

    //         if (nivel != maxNivel) {
    //             for (int linea = 1; linea <= 2; linea++) {
    //                 for (int i = 0; i < espaciosInicio - linea; i++)
    //                     System.out.print(" ");
    //                 for (Nodo nodo : nivelActual) {
    //                     if (nodo == null) {
    //                         for (int i = 0; i < 2 * linea + espaciosEntre - 1; i++)
    //                             System.out.print(" ");
    //                         continue;
    //                     }

    //                     if (nodo.izquierdo != null)
    //                         System.out.print("/");
    //                     else
    //                         System.out.print(" ");

    //                     for (int i = 0; i < 2 * linea - 1; i++)
    //                         System.out.print(" ");

    //                     if (nodo.derecho != null)
    //                         System.out.print("\\");
    //                     else
    //                         System.out.print(" ");

    //                     for (int i = 0; i < espaciosEntre - (2 * linea); i++)
    //                         System.out.print(" ");
    //                 }
    //                 System.out.println();
    //             }
    //         }

    //         nivelActual = siguienteNivel;
    //         nivel++;
    //     }
    // }

    // private int altura(Nodo nodo) {
    //     if (nodo == null)
    //         return 0;
    //     return 1 + Math.max(altura(nodo.izquierdo), altura(nodo.derecho));
    // }

    // public void imprimirHojas() {
    //     System.out.print("Hojas: ");
    //     imprimirHojasRecursivo(raiz);
    //     System.out.println();
    // }

    // private void imprimirHojasRecursivo(Nodo nodo) {
    //     if (nodo == null)
    //         return;

    //     if (nodo.izquierdo == null && nodo.derecho == null) {
    //         System.out.print(nodo.valor + " ");
    //     }

    //     imprimirHojasRecursivo(nodo.izquierdo);
    //     imprimirHojasRecursivo(nodo.derecho);
    // }

    // public void imprimirPadres() {
    //     System.out.print("Padres: ");
    //     imprimirPadresRecursivo(raiz);
    //     System.out.println();
    // }

    // private void imprimirPadresRecursivo(Nodo nodo) {
    //     if (nodo == null)
    //         return;

    //     if (nodo.izquierdo != null || nodo.derecho != null) {
    //         System.out.print(nodo.valor + " ");
    //     }

    //     imprimirPadresRecursivo(nodo.izquierdo);
    //     imprimirPadresRecursivo(nodo.derecho);
    // }

}
