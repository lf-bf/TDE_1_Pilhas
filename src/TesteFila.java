import java.util.Scanner;

class NoF {
    int valor;
    NoF prox;
}

class Fila {
    NoF ini = null, fim = null;

    void insere(int x) {
        NoF novo = new NoF();
        novo.valor = x;
        if (fim != null) {
            fim.prox = novo;
        }
        fim = novo;
        if (ini == null) {
            ini = novo;
        }
    }

    int remove() {
        if (ini == null) {
            System.out.println("Fila vazia!");
            return -1;
        }
        int v = ini.valor;
        ini = ini.prox;
        if (ini == null) fim = null;
        return v;
    }

    void imprime() {
        NoF aux = ini;
        System.out.print("Fila: ");
        while (aux != null) {
            System.out.print(aux.valor + " ");
            aux = aux.prox;
        }
        System.out.println();
    }
}

public class TesteFila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fila f = new Fila();

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
                f.insere(v);
            } else if (op == 2) {
                int r = f.remove();
                if (r != -1) System.out.println("foi removido:" + r);
            } else if (op == 3) {
                f.imprime();
            } else if (op == 0) {
                break;
            } else {
                System.out.println("opcao errada");
            }
        }

        sc.close();
    }
}
