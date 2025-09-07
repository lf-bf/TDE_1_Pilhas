import java.util.Scanner;

public class Merge {
    static Fila merge(Fila A, Fila B) {
        Fila C = new Fila();
        NoF a = A.ini;
        NoF b = B.ini;

        while (a != null && b != null) {
            if (a.valor <= b.valor) {
                C.insere(a.valor);
                a = a.prox;
            } else {
                C.insere(b.valor);
                b = b.prox;
            }
        }
        while (a != null) {
            C.insere(a.valor);
            a = a.prox;
        }
        while (b != null) {
            C.insere(b.valor);
            b = b.prox;
        }
        return C;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Fila A = new Fila();
        Fila B = new Fila();

        System.out.print("Qtd elementos da Fila A: ");
        int nA = sc.nextInt();
        for (int i = 0; i < nA; i++) {
            System.out.print("Digite o valor #" + (i + 1) + " de A: ");
            A.insere(sc.nextInt());
        }

        System.out.print("Qtd elementos da Fila B: ");
        int nB = sc.nextInt();
        for (int i = 0; i < nB; i++) {
            System.out.print("Digite o valor #" + (i + 1) + " de B: ");
            B.insere(sc.nextInt());
        }

        System.out.print("Fila A: "); A.imprime();
        System.out.print("Fila B: "); B.imprime();

        Fila C = merge(A, B);
        System.out.print("Fila C (merge): "); C.imprime();

        sc.close();
    }
}
