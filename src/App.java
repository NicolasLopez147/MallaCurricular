public class App {
    public static void main(String[] args) throws Exception {
        ListaAreglo <Materia> listaA = new  ListaAreglo <Materia> ();
        ListaEnlazada <Materia> listaE = new ListaEnlazada <Materia>();
        insertarDatos(listaA, listaE);


    }

    public static void insertarDatos(ListaAreglo<Materia> listaA , ListaEnlazada<Materia> listaE){
        for (int i = 10000 ; i <= 100000000 ; i= i*5){
            Materia[] materias = crearArreglo(i);
            long inicio  = System.currentTimeMillis();
            for (int j = 0 ; j < i ; j ++){
                listaA.insertar(materias[j]);
            }
            long fin  = System.currentTimeMillis();
            double tiempo = (double) (fin-inicio)/1000;
            System.out.println("Para "+i+" datos la lista implementada con arreglos gasta: "+tiempo);
            
            
            inicio  = System.currentTimeMillis();
            for (int j = 0 ; j < i ; j ++){
                listaE.insertar(materias[j]);
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
            materias[i] = new Materia(5, "Materia"+String.valueOf(i+1),131313213 , 'a');
        }
        
        return materias;
    }
}
