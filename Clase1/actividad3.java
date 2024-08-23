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
    //recurrencia
    //T(n)= T(n-1)+O(1) 
    //T(n)= (T(n-2)+O(1))+O(1)
    //T(n)= T(n-2)+2*O(1) 
    //T(n)= (T(n-3)+O(1))+2*O(1)
    //T(n)= T(n-3)+3*O(1)
    
    //T(n)= T(0)+n*O(1)

