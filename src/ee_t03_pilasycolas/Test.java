package ee_t03_pilasycolas;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Test
{
    private Test(){}
    private void carga(String Archivo)throws IOException{
          FileReader Ar =new FileReader(Archivo);                         //AGREGAR EL NOMBRE DE ARCHIVO.(Dts.txt)
          String cadena=null,id=null;   int tam=0;   int n=0;                                             
          BufferedReader s =new BufferedReader(Ar);
          pilaLigada p=new pilaLigada();
          ColaLigada C=new ColaLigada();
          while ((cadena=s.readLine())!=null){ 
        String columna[]=cadena.split(" ");
        if(tam==0){         //en la primera linea de archivo indentificar su destino pila
            if(columna[0].equals("0")){id="pila"; tam=1;}   // 0 es pila
           else if(columna[0].equals("1")){ id="cola";tam=2;}// 1 es cola
           else {System.out.println("No tiene destino"); break; }   //elemento diferente de 0 y 1 no tene destino
        }else if(tam==1){               //instanciado hacia la pila
            if(columna[0].equals("0")){ 	 //incertar 
            p.push(columna[1]);
            }
         else if(columna[0].equals("1")){		//eliminar 
            p.pop();
            }
         else if(columna[0].equals("2")){		//Mostrar
             p.peek();
            }
        }
        else if(tam==2){                //instanciado hacia la cola
        if(columna[0].equals("0")){		//incertar 
            C.IncertarInicio(columna[1]);
        }
         else if(columna[0].equals("1")){	//eliminar
            C.EliminarF();
            }
        }
  }
  System.out.println(" contenido de la "+id);           //imprimir las lista pila y cola
  p.recorrer();
  C.recorrer();
}
public static  void main(String []args)throws IOException{      //menu principal
Test N=new Test();            //instanciar las clases 
pilaLigada p=new pilaLigada();
ColaLigada C=new ColaLigada();
N.carga("datos.txt");           //cargar el primer archivo
System.out.println();
for(int i=0;i<10;i++){System.out.print("__");}    //separador de archivos  
System.out.println();
N.carga("datos02.txt");         //cargara el segundo archivo
}
}