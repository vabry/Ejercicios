
public class Eje3Promedio {
    public static void main(String[] args) {
        int [] vectorEntrada = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13, -8};
        float promedio=0;
        float suma=0;
        for (int i = 0; i < vectorEntrada.length; i++) {
            
            suma= (suma + vectorEntrada[i]);
        }
        promedio= suma/vectorEntrada.length;
        System.out.println(promedio);
    }
    
}
