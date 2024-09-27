package clase5;

public class usuario {

    public String nombreUsuario;
    protected String contraseña;
    public String mail;
    public usuario seguidor;

    public usuario(String nombreUsuario, String contraseña, String mail, usuario seguidor) {

        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
        this.mail = mail;
        this.seguidor = seguidor;

    }

}
