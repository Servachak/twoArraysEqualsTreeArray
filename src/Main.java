/**
 * Created by adavi on 29.07.2017.
 */
public class Main {

    public static void main(String[] args) {

        BuildArray array = new BuildArray();


        int [] array1 =  array.arrayBuild(10);
        int [] array2 =  array.arrayBuild(10);

        array.multiplicationArrays(array1,array2);

    }
}
