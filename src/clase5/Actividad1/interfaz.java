package clase5.Actividad1;


public interface interfaz {

    void seguir(int usuario, int valor);

    void dejarDeSeguir(int usuario);

    int[] getusuarios();

    int[] getValor(int usuario);

    boolean isEmpty();
}