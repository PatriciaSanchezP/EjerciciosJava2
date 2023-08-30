package entrevista2;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagSequence {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner kb = new Scanner(System.in);
        int test_cases = kb.nextInt();
        for (int cs = 1; cs <= test_cases; cs++) {
            int n = kb.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = kb.nextInt();
            }
            findZigZagSequence(a, n);
        }
    }

    public static void findZigZagSequence(int[] a, int n) {
        Arrays.sort(a); // Ordenamos el arreglo en orden ascendente
        int mid = (n - 1) / 2; // Encontramos el índice medio del arreglo
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;

        int st = mid + 1; // Inicializamos el puntero "st" para recorrer desde el medio + 1
        int ed = n - 2; // Inicializamos el puntero "ed" para recorrer desde el último elemento - 1
        while (st <= ed) {
            temp = a[st]; // Almacenamos el valor de a[st] temporalmente
            a[st] = a[ed]; // Movemos el valor de a[ed] a a[st]
            a[ed] = temp; // Movemos el valor almacenado en temp a a[ed]
            st = st + 1; // Incrementamos el puntero st
            ed = ed - 1; // Decrementamos el puntero ed
        }
        for (int i = 0; i < n; i++) {
            if (i > 0)
                System.out.print(" ");
            System.out.print(a[i]); // Imprimimos los elementos del arreglo ordenado y zigzagueado
        }
        System.out.println();
    }
}


