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

    public static int buscaBinariaRecursiva(int [] array, int x, int left, int right){

        int middle = 
        //Quando esquerda for maior que direita, retornar - 1

        //Quando o do meio for o certo, retornar index

        //Quando estiver na direita, usar recursão

        //Quando estiver na direita, usar recursão





    }


}
