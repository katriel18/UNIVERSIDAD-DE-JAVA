package palabrafinal.domain;

public final class Persona {
    
    //no se puede volver a asiganar otra variable al ser final
    public final static int MI_CONSTANTE = 1; 
    
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public final void imprimir(){
        System.out.println("Metodo imprimir");
    }
}
