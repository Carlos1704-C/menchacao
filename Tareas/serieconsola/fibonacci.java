package serieconsola;
class Fibbonaci{
public static void main(String[] args) {
    int a= 0, b=1, c, i=1;
    System.out.println("Serie");
    do
    {
        c= a+b;
        a=b;
        b=c;
        i= i+1;
        System.out.println(c);
    }
    while(1<10);
}
}