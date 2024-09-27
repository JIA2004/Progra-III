package clase5.Actividad1;

public class Main {
    public static void main(String[] args) {

        grafo IDseguido = new grafo();

        // seguir elementos al IDseguido
        IDseguido.seguir(1, 100);
        IDseguido.seguir(1, 101);
        IDseguido.seguir(2, 200);
        IDseguido.seguir(3, 300);
        IDseguido.seguir(3, 301);

        // Mostrar los elementos agregados
        System.out.println("usuarios después de seguir elementos:");
        imprimirusuarios(IDseguido.getusuarios());

        // Obtener valores
        System.out.println("seguidos del usuario 1: " + java.util.Arrays.toString(IDseguido.getValor(1)));
        System.out.println("seguidos del usuario 2" + java.util.Arrays.toString(IDseguido.getValor(2)));
        

        // Eliminar un usuario
        IDseguido.dejarDeSeguir(2);
        System.out.println("elimina usuario 2:");
        imprimirusuarios(IDseguido.getusuarios());
        
    }

    private static void imprimirusuarios(int[] usuarios) {
        for (int usuario : usuarios) {
            System.out.println("usuario: " + usuario);
        }
    }
}