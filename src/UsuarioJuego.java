public class UsuarioJuego {


    /* Para desarrollar un juego necesitamos implementar la clase UsuarioJuego. Los usuarios
    tienen nombre y clave, estos datos se deben suministrar cuando se crea un nuevo usuario.
    Inicialmente tienen puntaje y nivel en cero. Sin embargo, pueden aumentar tanto el puntaje
    como el nivel en 1, debemos suministrar un método para poder hacerlo. El usuario también
    puede recibir un bonus, esto quiere decir que recibe un valor extra que se suma a su puntaje. */

    //Atributos
    private String nombre;
    private String clave;
    private Double puntaje;
    private int nivel;

    //Constructor
    public UsuarioJuego (String nombre, String clave){
        this.nombre = nombre;
        this.clave = clave;
        puntaje = 0.0;
        nivel = 0;
    }

    //Getter and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Double puntaje) {
        this.puntaje = puntaje;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    //Métodos
    public void aumentarPuntaje(){
        this.puntaje++;
    }

    public void subirNivel(){
        this.nivel++;
    }

    public void bonus(int valor){
        this.puntaje = puntaje + valor;
    }
}
