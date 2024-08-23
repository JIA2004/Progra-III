import java.util.ArrayList;
import java.util.List;

public class facturacion {
    public static void main(String[] args) {
        int[][] listacomprobante={{54,36,3400},{55,12,4300},{56,25,2500}};
        Cliente numero1=new Cliente(36, "Lucas");
        Cliente numero2=new Cliente(12, "Franco");
        Cliente numero3=new Cliente(25, "María");

        List<Cliente> clientes=new ArrayList<>(); //creamos listas
        clientes.add(numero1);
        clientes.add(numero2);
        clientes.add(numero3);

        List<Resultado> resultados=calcularsumaimportes(listacomprobante,clientes);
        for(Resultado Resultado: resultados){
            System.out.println(Resultado);
        }
    }
    public static List<Resultado> calcularsumaimportes(int [][] comprobantes,List<Cliente> clientes){
        List<Resultado> resultados=new ArrayList<>();

        for(Cliente cliente:clientes){
            double sumaimportes=0.0;
            for(int[] comprobante:comprobantes){
                int idCliente=comprobante[1];
                double importe=comprobante[2];
                if (idCliente==cliente.getId()) {
                    sumaimportes+=importe;
                    
                }
            }
            resultados.add(new Resultado(cliente.getId(),cliente.getNombre() , sumaimportes));
        }
        return resultados;
    }}
    class Cliente{
        int id;
        String nombre;
        public Cliente(int id,String nombre){
            this.id=id;
            this.nombre=nombre;
        }
        public int getId() {
            return id;
        }
        public String getNombre() {
            return nombre;
        }}
    class Resultado {
        private int idCliente;
        private String nombreCliente;
        private double sumaImportes;

        public Resultado(int idCliente,String nombrecliente,double sumaimportes){
            this.idCliente=idCliente;
            this.nombreCliente=nombrecliente;
            this.sumaImportes=sumaimportes;}
        @Override
        public String toString(){
            return "resultado= idcliente= "+idCliente+", nombrecliente= "+nombreCliente+", sumaimportes= "+sumaImportes+" ";}}