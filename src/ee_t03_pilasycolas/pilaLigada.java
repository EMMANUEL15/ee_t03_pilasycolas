package ee_t03_pilasycolas;

public class pilaLigada<T>{
    public Nodo<T> inicio;
public pilaLigada(){
    inicio=null;
}
public Nodo<T> getInicio(){
    return inicio;
}
public void setInicio(Nodo<T> inicio){
    this.inicio=inicio;
}
public void push(T dato){				//incertar elemento en el inicio
    Nodo<T> N=new Nodo<T>(dato);
    N.setSiguiente(inicio);
    inicio=N;
    }
public void pop(){						//eliminar elemento inicial
    Nodo<T> var=inicio;
    if(inicio==null){System.out.println("Ya no existe elemento para elminar");}else{
     inicio= var.getSiguiente();System.out.println(var.ToString());
    }
}
public void peek(){//Mostrar el ultimo elemeto de la lista
     Nodo<T> var=inicio;
     Nodo<T> z=null;
    if(inicio==null){System.out.println("No hay elemento para ver");}else{
        System.out.println(var.ToString());
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