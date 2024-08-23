public class actividad3 {
    public static void main(String[] args) {
        
        int cantidad=4;
        System.out.println("el resultado de los numeros anteriores a "+cantidad+" es: "+sumanumeros(cantidad));
    }

        public static int sumanumeros(int cantidad){
            if (cantidad==1) {
                return 1;
                
            }else{
                return cantidad+sumanumeros(cantidad-1);
            }
        }
    
}

