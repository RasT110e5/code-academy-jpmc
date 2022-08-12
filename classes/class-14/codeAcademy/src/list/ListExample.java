package list;

import com.Log;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

    public static void main (String args[]){
        List<String> miLista = new ArrayList<>();

        miLista.add("Gato");
        miLista.add("Gato");

        Log.log("------------" + miLista.size());
        for (String elemento : miLista){
            Log.log(elemento);
        }
        Log.log("------------");

        for (int i= 0 ; i< miLista.size(); i++){
            Log.log(miLista.get(i));
        }

        miLista = new LinkedList<>();//sirve para acceder de forma sencuancial y agregar varios elementos


    }
}
