import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lista {
    private List<Integer> datos;
    public Lista(){
        datos = new ArrayList<>();
    }
    public void agregar(Integer valor){
        if(!datos.contains(valor))
            datos.add(valor);
        Collections.sort(datos);
    }
    public void agregarInicio(Integer valor){
        datos.add(0, valor);
    }
    public Integer eliminarPorIndice(int indice){
         return datos.remove(indice);
    }

    @Override
    public String toString() {
        String resultado = "";
        int i=1;
        for (Integer x: datos){
            resultado+=x+"\t";
            if(i%10==0)
                resultado+="\n";
            i++;

        }
        return resultado;
    }
    public int tamanio(){
        return datos.size();
    }
    private int buscarBinario(Integer valor){
        int inf,sup, centro, cont;
        inf = 0;
        sup = datos.size()-1;
        cont=0;
        while (sup>=inf){
            centro=(sup+inf)/2;
            if(valor==datos.get(centro)){
                return cont;
            }
            if(valor<datos.get(centro)){
                sup=centro-1;
            }else{
                inf=centro+2;
            }
            cont++;
        }
        return cont;
    }
    public int buscar(Integer valor){
        if(valor<datos.get(0) || valor>datos.get(datos.size()-1))
            return -1;
        return buscarBinario(valor);
    }
    private Integer sumarRecursiva(int indice){
        if(indice>= datos.size()){
            return 0;
        }
        return datos.get(indice)+sumarRecursiva(indice+1);

    }
     public int buscarNormal(int valor){
        int cont =0;
        for(int i=0; i<datos.size()-1;i++){
            if(datos.get(i)==valor)
                return cont;
            cont++;}
        return cont;
    }
    public Integer sumar(){
        return  sumarRecursiva(0);
    }
}
