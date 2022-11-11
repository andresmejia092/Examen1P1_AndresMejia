//Andres Mejia
package examen1p1_andresmejia;
import java.util.Scanner;
import java.security.SecureRandom;
        
public class Examen1P1_AndresMejia {
    static Scanner read=new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcion;
        
        do{
            System.out.println("Opcion 1: Divisores primos");
            System.out.println("Opcion 2: Contorno de piramide");
            System.out.println("Opcion 3: Vecinos");
            System.out.println("Ingrese una opcion: ");
            opcion=read.nextInt();
            
            switch(opcion){
                case 1:{
                    int numero;
                    System.out.println("Ingrese un numero entero: ");
                    numero=read.nextInt();
                    while(numero<1){
                        System.out.println("Numero tiene que ser mayor o igual a 1");
                        System.out.println("Ingrese un numero entero: ");
                        numero=read.nextInt();
                    }
                    
                        System.out.println("Los divisores son: "+divisor(numero));
                    
                    
                    break;
                }
                case 2:{
                    int columna,r;
                    System.out.println("Ingrese el numero de columnas: ");
                    columna=read.nextInt();
                    r=columna%2;
                    while(r==0){
                        System.out.println("Ingrese un numero primo: ");
                        columna=read.nextInt();
                        r=columna%2;
                    }
                    
                    
                    contorno(columna);
                    
                    
                    break;
                }
                case 3:{
                    String cadena;
                    System.out.println("Ingrese una cadena: ");
                    cadena=read.next();
                    System.out.println(vecinos(cadena));
                    
                    
                    break;
                }
                
            }
           
        } while(opcion!=4);
        
        
        
    } //Fin main
    
    public static String divisor(int n){
        String acum="";
        int c1, r2;
        r2=0;
        c1=0;
        
        for(int i=1; i<=n; i++){
            int r=n%i;
            if(r==0){
                if(primo(i)==true || i==n){
                    acum=acum+i+",";
                }
                else{
                    acum=acum;
                }
                
                  
            }
        }
        System.out.println(acum);
        return acum;
    } //Fin primos
    
    public static boolean primo(int i){
        boolean preg=false;
        if(i==1 ){
            return true;
        }
        for(int j=2; j<i/2; j++){
            if(i%j==0){
                return false;
            }
            
        }    
        return true;
    } //Fin primo
    
    
    
    public static void contorno(int columna){
        for(int i=0; i<(columna+1)/2; i++){
            for(int j=0; j<columna; j++){
                if(i==((columna+1)/2)-1){
                    System.out.print("*");
                }
                
                else if((j==(columna/2)+i) || (j==(columna/2)-i)){
                    System.out.print("+");       
                }
                else if((i!=((columna+1)/2)-2)&& (j<=(columna/2)+i-1) && (j>=(columna/2)-i+1)){
                    System.out.print(" ");
                }
                else if((i==((columna+1)/2)-2)&& (j<=(columna/2)+i-1) && (j>=(columna/2)-i+1)){
                    System.out.print("+");
                }
                
                else{
                System.out.print("*");
            }
                
            }
            System.out.println("");
        }
        System.out.println("");
        
        
    } //Fin de contorno
    
    public static String vecinos(String cadena){
        String acum="";
        int asci;
        SecureRandom random=new SecureRandom();
        int num= random.nextInt(2);
        if(num==0){
            for(int i=0; i<cadena.length(); i++){
                char letra=cadena.charAt(i);
                asci=(int)letra-1;
                acum=acum+((char)asci);
                
            }
        }
        if(num==1){
            for(int j=0; j<cadena.length(); j++){
                char letra2=cadena.charAt(j);
                asci=(int)letra2+1;
                acum=acum+((char)asci);
            }
        }
        System.out.println("Numero generado: "+num);
        return acum;
    } //Fin vecino
}
