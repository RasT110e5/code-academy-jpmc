package array;


import com.Log;

public class ArrayExample {
    public static void main (String args[]){
        Integer[] miArray = new Integer[11];
        Log.log(miArray.length);
        Log.log("-------------");
        for (Integer elemento : miArray){
            Log.log(elemento);
        }
        miArray[0] = 55;
        miArray[10] = 66;

        Log.log("-------------");

        for (int im=0; im < miArray.length; im=im+1){
            Log.log(miArray[im]);
        }
        Log.log("-------------");

        int[] miArray2 = {12 ,23 ,23};
    }

}
