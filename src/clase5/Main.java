package clase5;

public class Main {
    public static void main(String[] args) {
        // Crear un grafo con una capacidad para 10 usuarios
        grafo redSocial = new grafo(10);
        usuario juani = new usuario("juani");
        usuario pedro = new usuario("pedro");
        usuario fausti = new usuario("fausti");
        usuario bauti = new usuario("bauti");
        usuario ramiro = new usuario("ramiro");


        // Agregar usuarios a la red social
        redSocial.agregarUsuario("Juani");
        redSocial.agregarUsuario("Pedro");
        redSocial.agregarUsuario("Laura");
        redSocial.agregarUsuario("Ana");

        // Definir relaciones de seguidores
        juani.seguir(pedro);
        pedro.seguir(fausti);
        pedro.seguir(ramiro);
        fausti.seguir(juani);

        juani.getSiguiendo();
        pedro.getSiguiendo();
        fausti.getSiguiendo();
        ramiro.getSiguiendo();

    }
}
