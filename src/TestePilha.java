import java.util.Scanner;

class NoP {
    int valor;
    NoP prox;
}

class Pilha {
    NoP topo = null;

    void insere(int x) {
        NoP novo = new NoP();
        novo.valor = x;
        novo.prox = topo;
        topo = novo;
    }

    int remove() {
        if (topo == null) {
            System.out.println("Pilha vazia!");
            return -1;
        }
        int v = topo.valor;
        topo = topo.prox;
        return v;
    }

    void imprime() {
        NoP aux = topo;
        System.out.print("Pilha: ");
        while (aux != null) {
            System.out.print(aux.valor + " ");
            aux = aux.prox;
        }
        System.out.println();
    }
}

public class TestePilha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha p = new Pilha();

        while (true) {
            System.out.println("1 insere");
            System.out.println("2 remove");
            System.out.println("3 listar");
            System.out.println("0 sair");
            System.out.print("escolha: ");
            int op = sc.nextInt();

            if (op == 1) {
                System.out.print("digite um valor: ");
                int v = sc.nextInt();
                p.insere(v);
            } else if (op == 2) {
                int r = p.remove();
                if (r != -1) System.out.println("foi removido: " + r);
            } else if (op == 3) {
                p.imprime();
            } else if (op == 0) {
                break;
            } else {
                System.out.println("opcao errada");
            }
        }

        sc.close();
    }
}
