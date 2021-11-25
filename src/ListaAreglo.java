public class ListaAreglo<T> implements Listas <T> {
    private T [] datos;
    private int size;

    ListaAreglo(int n){
        if (n > 1)
            datos = (T [])new Object [n];
        else
            datos = (T [])new Object [10];
        this.size = 0;
    }
    ListaAreglo(){
        this(10);
    }

    @Override
    public String toString() {
        return "ListaAreglo []";
    }
    @Override
    public boolean vacio() {
        // TODO Auto-generated method stub
        if (size == 0)
        return true;
        else 
        return false;
    }
    @Override
    public int tanano() {
        // TODO Auto-generated method stub
        return size;
    }
    @Override
    public T obtener(int index) {
        // TODO Auto-generated method stub
        if (index < size || index >=0)
        return datos[index];
        else{
            throw new IndexOutOfBoundsException("El indice "+index+" no valido, el tanano de la lista es "+size);
        }
    }
    @Override
    public int buscarIndice(T elemento) {
        // TODO Auto-generated method stub
        for (int i = 0 ; i < size ; i ++){
            if (obtener(i).equals(elemento)){
                return i;
            }
        }
        return -1;
    }
    @Override
    public T quitar(int index) {

        // TODO Auto-generated method stub

        return null;
    }
    @Override
    public void insertar(T dato, int index) {
        // TODO Auto-generated method stub
        if (size == datos.length){
            T [] aux = datos;
            datos = (T[]) new Object[2*size];
            System.arraycopy(aux, 0, datos, 0, size);
        }

        for (int i = size-1 ; i >=index ; i-- )
            datos[i+1] = obtener(i);
        
        datos[index] = dato;
        size++;
        
    } 
}
