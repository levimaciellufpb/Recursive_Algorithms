public class Main {
    public static void main(String[] args) {
        int[] A = { 8, 10, 6, 2, 9, 5 };
        int elemento = 8;
        BuscaBinariaRecursiva buscaBinaria = new BuscaBinariaRecursiva();
        int index = BuscaBinariaRecursiva.buscaBinariaRecursiva(A, elemento);

        if (index != -1) {
            System.out.println("Elemento " + elemento + " encontrado no índice " + index);
        } else {
            System.out.println("Elemento não encontrado no array");
        }
    }
}
