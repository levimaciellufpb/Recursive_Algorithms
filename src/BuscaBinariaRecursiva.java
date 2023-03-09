import java.util.Arrays;

public class BuscaBinariaRecursiva {

    public BuscaBinariaRecursiva(){

    }

    //There is 3 cases: I got it spot on, it is on the right or it is on the left.
    public static int buscaBinariaRecursiva(int [] array, int x){
        //First, sorting the array
        Arrays.sort(array);
        int left = 0;
        int right = array.length - 1;
        return buscaBinariaRecursiva(array, x, left, right);
    }

    private static int buscaBinariaRecursiva(int [] array, int x, int left, int right){

        int middle = (left + right) / 2;

        //Quando esquerda for maior que direita, retornar - 1
        if(left > right){
            return -1;
        }

        //Quando o do meio for o certo, retornar index
        if(array[middle] == x){
            return middle;
        }

        //Quando estiver na direita, usar recursão
        else if (array[middle] < x) {
            return buscaBinariaRecursiva(array, x, middle, right);
        }

        //Quando estiver na direita, usar recursão
        else{
            return buscaBinariaRecursiva(array, x, left, middle);
        }
    }
}
