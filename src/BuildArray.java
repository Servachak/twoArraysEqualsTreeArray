/**
 * Created by adavi on 29.07.2017.
 */
public class BuildArray {

    public int[] arrayBuild(int n){
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * (9) + 1 );
            System.out.printf("%2d",arr[i]);

        }
        System.out.println();

        return arr;
    }
    public void multiplicationArrays(int array1[], int array2[]){
        int [] multiplicationArray = new int[array1.length];
        for(int i = 0; i < multiplicationArray.length; i++){
            multiplicationArray[i] = array1[i] * array2[i];

            System.out.printf("%3d", multiplicationArray[i]);
        }

    }




}
