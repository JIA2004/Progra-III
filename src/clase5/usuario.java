package clase5;

public class usuario {

    private String nombre;
    private usuario[] siguiendo;
    public int i = 1;

    public usuario(String nombre) {
        this.nombre = nombre;
        this.siguiendo = new usuario[10];
    }

    public String getNombre() {
        return nombre;
    }

    public usuario[] getSiguiendo() {
        return siguiendo;
    }

    public void seguir(usuario usuario) {
        for (usuario persona : siguiendo) {
            if (persona == usuario){
                System.out.println("Ya seguís a este usuario");
                return;
            }
        }
        siguiendo[i] = usuario;
        i++;
    }

}