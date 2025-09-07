import java.util.Scanner;

public class MergeVetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qtd elementos fila A: ");
        int nA = sc.nextInt();
        int[] A = new int[nA];
        System.out.println("digiata elementos de A (ordenados):");
        for (int i = 0; i < nA; i++) A[i] = sc.nextInt();

        System.out.print("Qtd elementos fila B: ");
        int nB = sc.nextInt();
        int[] B = new int[nB];
        System.out.println("digiata elementos de B (ordenados):");
        for (int i = 0; i < nB; i++) B[i] = sc.nextInt();

        int[] C = new int[nA + nB];
        int i = 0, j = 0, k = 0;
        while (i < nA && j < nB) {
            if (A[i] <= B[j]) C[k++] = A[i++];
            else C[k++] = B[j++];
        }
        while (i < nA) C[k++] = A[i++];
        while (j < nB) C[k++] = B[j++];

        System.out.print("Fila C (merge): ");
        for (int x = 0; x < C.length; x++) {
            System.out.print(C[x] + " ");
        }

        sc.close();
    }
}
