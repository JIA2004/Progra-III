package clase5;

import java.util.Arrays;

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

    public void getSiguiendo() {
        for (usuario persona : siguiendo) {
            if (persona != null){
                System.out.println(persona.nombre);
            }
            else {
                System.out.println(persona,"no existe");
            }
        }
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
        if (i == siguiendo.length - 1) {
            int nuevoTamaño = siguiendo.length + 10;
            usuario[] nuevaLista = Arrays.copyOf(siguiendo, nuevoTamaño);
            siguiendo = nuevaLista;
            return;
        }
        else {
            return;
        }
    }

}