package ee_t03_pilasycolas;

public class Nodo<T>{
	 private T Dato;
	 private Nodo<T> siguiente;
private Nodo(){						//contructor
Dato=null;
siguiente=null;
}
public Nodo(T dato){				//inicializacion
this.Dato=dato;
siguiente=null;
}
public T getDato(){ 
return Dato;
}
public void setDato(T dato){
this.Dato=dato;
}
public Nodo<T> getSiguiente(){
return siguiente;
}
public void setSiguiente(Nodo<T> siguiente){
this.siguiente=siguiente;
}
public String ToString(){				//To String
return ""+Dato;
}
}