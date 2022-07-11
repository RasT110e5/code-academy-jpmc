import com.code_academy.entity.Gato;
import com.code_academy.entity.generic.Mamifero;
import com.code_academy.util.Impresor;
import com.code_academy.util.ImpresorConsola;
import com.code_academy.util.ImpresorTxt;

public class Principal {

    public static void main (String args[]){
        Mamifero gato = new Gato("Porfirio", 2);
        Impresor impresora = new ImpresorConsola();
        gato.imprimirNombre(impresora);
        impresora = new ImpresorTxt();
        gato.imprimirNombre(impresora);
    }
}
