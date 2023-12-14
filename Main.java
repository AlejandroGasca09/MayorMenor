public class Main {
    public static void main(String[] args) {
        int a = 12;
        int b = 9;
        if ( a >= b ){
            if ( a == b ){
                System.out.println("Son iguales");
            }else {
                System.out.println("El numero mayor es " + a);
                System.out.println(" El numero menor es : " + b);
            }
        }else {
            System.out.println("El numero mayor es " + b );
            System.out.println(" El numero menor es " + a);
        }
    }
}