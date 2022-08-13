package Practica1_Jorge;

// Jorge Muñoz García

/* La función Main es donde se empieza a ejecutar el programa, de ella parten
los objetos y clases*/

public class Main {

    public static void main(String[] args) {
        
        int i1=4;
        int i2=5;
        
        double d1=7.1;
        double d2=2.3;
        
        char c1='p';
        char c2='X';
        
        boolean b1=true;
        boolean b2=false;
        
        int r1;
        double r2;
        
        r1=i1+=i2;
        //(double)r2=d1-=d2;
        
        r1=i1*=d2;
        
        r2=r1/=d2;
        
        b1=c1==c2;
        
        b2=c1>c2;
        
        b1=(i1<5)||(d2<5);
        
        b2=(i2>=5)&&(d1>=5);
        
        r1++; //La variable no tiene valor
        
        r2--; //La variable no tiene valor
        
        r2=r2*=r2; //La variable no tiene valor
        
        r1=r1-=r1; //La variable no tiene contenido
        
    System.out.println((int)r2);
    }
    
}
