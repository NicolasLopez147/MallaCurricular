public class App {
    public static void main(String[] args) throws Exception {
        ListaAreglo <Materia> listaA = new  ListaAreglo <Materia> ();
        ListaEnlazada <Materia> listaE = new ListaEnlazada <Materia>();
        //insertarDatos(listaA, listaE);
        listaA.insertar(new Materia(5, "Materia"+String.valueOf(21),1 , 'a'),0);
        listaA.insertar(new Materia(5, "Materia"+String.valueOf(21),1 , 'a'),0);
        listaA.insertar(new Materia(5, "Materia"+String.valueOf(21),1 , 'a'),0);
        System.out.println("La lista esta vacia: "+listaA.vacio());
        System.out.println("El tamano de la lista es: "+listaA.tanano());
        System.out.println("La materia del indice 2 "+listaA.obtener(4));
        //listaA.insertar(new Materia(5, "Materia"+String.valueOf(21),1 , 'a'),2);


    }

    public static void insertarDatos(ListaAreglo<Materia> listaA , ListaEnlazada<Materia> listaE){
        int index = 0;
        for (int i = 10000 ; i <= 100000000 ; i= i*10){
            //Materia[] materias = crearArreglo(i);
            long inicio  = System.currentTimeMillis();
            for (int j = 0 ; j < i ; j ++){
                //listaA.insertar(materias[j],index);
                listaA.insertar(new Materia(5, "Materia"+String.valueOf(i+1),1 , 'a'),index);
            }
            long fin  = System.currentTimeMillis();
            double tiempo = (double) (fin-inicio)/1000;
            System.out.println("Para "+i+" datos la lista implementada con arreglos gasta: "+tiempo);
            
            
            inicio  = System.currentTimeMillis();
            for (int j = 0 ; j < i ; j ++){
                //listaE.insertar(materias[j],index);
                listaE.insertar(new Materia(5, "Materia"+String.valueOf(i+1),1 , 'a'),index);
            }
            fin  = System.currentTimeMillis();
            tiempo = (double) (fin-inicio)/1000;
            System.out.println("Para "+i+" datos la lista enlazada gasta: "+tiempo);
            //materias  = null;
            


        }
    }
    public static Materia [] crearArreglo(int n){
        Materia [] materias = new  Materia [n];
        //char [] componentes = {'a','b','c','d'};
        
        for (int i = 0 ; i < n ; i++){
         //   int creditos = (int) (Math.random()*5+1);
          //  int index = (int) (Math.random()*4);
         //   long codigo = (long) (Math.random()*10000000);
            materias[i] = new Materia(5, "Materia"+String.valueOf(i+1),1 , 'a');
        }
        
        return materias;
    }
}
