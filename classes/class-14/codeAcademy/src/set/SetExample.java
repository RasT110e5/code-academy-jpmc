package set;

import com.Log;
import map.Persona;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        Set<String> miSet = new HashSet<>();
        miSet.add("Gato");
        miSet.add("Gato");

        for (String mensaje : miSet){
            Log.log(mensaje);
        }

        Log.log(miSet.size());

        Persona p1 = new Persona("Jacinto", "26");
        Persona p2 = new Persona("Jacinto", "26");

        Set<Persona> miSet2 = new HashSet<>();
        miSet2.add(p1);
        miSet2.add(p2);

        Log.log(miSet2.size());


    }
}
