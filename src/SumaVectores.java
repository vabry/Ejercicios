public class SumaVectores {
    
    public static void main(String[] args) {
     int [] vectorUno = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};
     int [] vectorDos = {0, -2, 1, 9, 4, 78, 12, 11, 90, 13};
     int [] s = new int [vectorUno.length];   
     for(int i=0; i < vectorUno.length; i++ ){
        s[i]= vectorUno[i]+vectorDos[i];
        System.out.println(s[i]);
        }   
    }
    
}
