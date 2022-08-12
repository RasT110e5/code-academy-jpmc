package map;

import com.Log;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {

    public static void main (String args[]){

        Persona p1 = new Persona("Jacinto", "25");
        Persona p2 = new Persona("ClonJacineto", "26");

        List<Persona> listaPersona = new ArrayList<>();
        listaPersona.add(p1);
        listaPersona.add(p2);

        for (Persona p : listaPersona){
            if (p.getDni().equals("26")){
                Log.log(p.getNombre());
            }
        }

        Log.log("-----------------------");

        Map<String, Persona> miMapa = new HashMap<>();
        miMapa.put(p1.getDni(), p1);
        miMapa.put(p2.getDni(), p2);
        Log.log(miMapa.get("26").getNombre());

        Log.log("-----------------------");

        for (Map.Entry<String, Persona> entrada : miMapa.entrySet()){
            Log.log(entrada.getKey());
            Log.log(entrada.getValue());
        }


    }
}
