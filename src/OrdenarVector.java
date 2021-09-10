
import java.util.Arrays;
import java.util.Collections;


public class OrdenarVector {
    public static void main(String[] args) {
        int [] vectorEntrada = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};
        int b = vectorEntrada.length/2;
        int c = vectorEntrada.length-b;
        int [] vectorUno= new int[b];
        int [] vectorDos= new int[c];
        int[] vectorOrdenado= new int[vectorUno.length+vectorDos.length];
        //copio la primera parte de vector entrada en vector1
        System.arraycopy(vectorEntrada, 0, vectorUno, 0, vectorEntrada.length/2);
        //ordeno vector 1 ascendentemente
        Arrays.sort(vectorUno);
        
        //copio la segunda mitad en vector 2
        for (int i = vectorEntrada.length/2; i < vectorEntrada.length; i++) {
            int x;
            x=i-b;
            vectorDos[x]=vectorEntrada[i];
            }
        
        //Convierto vector 2 a integer y lo copio a vector 3        
        Integer[] vectorTres = new Integer[vectorDos.length];
        int y = 0;
        for (int value : vectorDos) {
            vectorTres[y++] = value;
            }
        
        //Aplico reverse order a vector tres, por esta razon se convierte       
                
        Arrays.sort(vectorTres, Collections.reverseOrder());
                
        //regreso vector tres de integer a int en vector 4
        int[] vectorCuatro = new int[vectorTres.length];
            for(int ctr = 0; ctr < vectorTres.length; ctr++) {
                vectorCuatro[ctr] = vectorTres[ctr].intValue(); // returns int value
            }
        
        // copio la primera parte en vector ordenado
        System.arraycopy(vectorUno, 0, vectorOrdenado, 0, vectorUno.length);
        // copio la segunda parte en vector ordenado
        System.arraycopy(vectorCuatro, 0, vectorOrdenado, vectorUno.length, vectorCuatro.length);
        
        System.out.println(Arrays.toString(vectorOrdenado));
        
    }    
}
