
package metodoslistas;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dazz
 */
public class Metodo {
 



    public void shell(List<Integer> Numeros) {
       int division = Numeros.size()/2, aux,salto, i;
    for(salto=division; salto!=0; salto/=2){
        boolean cambio=true;
        while(cambio){
            cambio=false;
            for(i=salto; i<Numeros.size(); i++){
                if (Numeros.get(i-salto)>Numeros.get(i)){
                    aux=Numeros.get(i);
                    Numeros.set(i,Numeros.get(i-salto));
                    Numeros.set(i-salto,aux);
                    cambio=true;
                }
            }
        }
    }
    }

    public  List<Integer> Radix(List<Integer> Numeros) {
        int i, j, x;
        for (x = Integer.SIZE - 1; x >= 0; x--) {
            List<Integer> aux= new ArrayList<Integer>();
            for (int k = 0; k < Numeros.size(); k++) {
                aux.add(0);
            }
            j=0;
             for (i = 0; i < Numeros.size(); i++) {
                boolean mov = Numeros.get(i) << x >= 0;
                
                if (x == 0 ? !mov : mov) {
                    aux.set(j,Numeros.get(i));
                    j++;
                } else {
                    Numeros.set(i-j,Numeros.get(i));
                }
            }
            for (i = j; i < aux.size(); i++) {
                aux.set(i,Numeros.get(i-j));
            }
            Numeros = aux;
        }
        return Numeros;
    }

}
    
