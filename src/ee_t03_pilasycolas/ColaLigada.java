package ee_t03_pilasycolas;

public class ColaLigada<T>{
    public Nodo<T> inicio;
public ColaLigada(){
    inicio=null;
}
public Nodo<T> getInicio(){
    return inicio;
}
public void setInicio(Nodo<T> inicio){
    this.inicio=inicio;
}
public void IncertarInicio(T dato){				//incertar elemento en el inicio
    Nodo<T> N=new Nodo<T>(dato);
    N.setSiguiente(inicio);
    inicio=N;
    }
public void EliminarF(){				//  eliminar el ultomo elemto de la lista
     Nodo<T> var=inicio; Nodo<T> z=null;Nodo<T> tem=inicio;
    if(inicio!=null){					//System.out.println("No hay elemento para elminar");
         tem=var;
    	while((var.getSiguiente())!=null){
             z=var;
           var=var.getSiguiente();
        }
        //System.out.print(var.ToString()+"-->\n");
       if(var==inicio){
         inicio= var.getSiguiente();
         System.out.print(var.ToString()+"\n");
         }else { z.setSiguiente(null);
         System.out.print(var.ToString()+"\n");
         }
    }
    }
public void recorrer(){//recorrer lista 
    Nodo<T> N =inicio;
    while(N!=null){
        System.out.print(N.ToString()+"-->");
        N=N.getSiguiente();
    }
}
}