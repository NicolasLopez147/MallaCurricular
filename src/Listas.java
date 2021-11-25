public interface Listas <T> {
    boolean vacio();
    int tanano();
    T obtener(int index);
    int buscarIndice(T elemento);
    T quitar(int index);
    void insertar( T elemento, int index );
    String toString();
}
