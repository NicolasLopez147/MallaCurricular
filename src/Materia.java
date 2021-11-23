public class Materia {
    private int creditos;
    private String nombre;
    private long codigo;
    private char componente;
    Materia(int creditos , String nombre , long codigo , char componente){
        this.setCreditos(creditos);
        this.setNombre(nombre);
        this.setCodigo(codigo);
        this.setComponente(componente);
    }
    
    public char getComponente() {
        return componente;
    }
    public void setComponente(char componente) {
        this.componente = componente;
    }
    public long getCodigo() {
        return codigo;
    }
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCreditos() {
        return creditos;
    }
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    
}
