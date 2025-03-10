//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String nom, fec, tel;
        int op;
        double total1 = 0, total2 = 0, total3 = 0, total4 = 0, total5 = 0;
        double cant1 = 0, cant2 = 0, cant3 = 0, cant4 = 0, cant5 = 0;
        double valort = 0, iva = 0, valortt = 0;



        System.out.println("Tienda de tecnologia");
        System.out.print("Ingrese su Nombre: ");
        nom = teclado.next();
        System.out.print("Ingrese su telefono: ");
        tel = teclado.next();
        System.out.print("Ingrese la fecha : ");
        fec = teclado.next();

        do {
            System.out.println("""
                    PRODUCTOS
                    1.Mouse
                    2.Teclados
                    3.Monitor
                    4.Discos duros
                    5.Memorias RAM
                    6.Salir
                    """);

            System.out.print("Que desea comprar: ");
            op = teclado.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Que cantidad de mouse quiere: ");
                    cant1 = teclado.nextDouble();
                    total1 = 80000 * cant1;
                    break;
                case 2:
                    System.out.print("Que cantidad de teclados quiere: ");
                    cant2 = teclado.nextDouble();
                    total2 = 320000 * cant2;
                    break;
                case 3:
                    System.out.print("Que cantidad de Monitor quiere: ");
                    cant3 = teclado.nextDouble();
                    total3 = 940000 * cant3;
                    break;

                case 4:
                    System.out.print("Que cantidad de discos duros quiere: ");
                    cant4 = teclado.nextDouble();
                    total4 = 230000 * cant4;
                    break;
                case 5:
                    System.out.print("Que cantidad de memorias RAM quiere: ");
                    cant5 = teclado.nextDouble();
                    total5 = 180000 * cant5;
                    valort = total1 + total2 + total3 + total4 + total5;
                    iva = valort*0.16;
                    valortt = valort + iva;
                    break;

                case 6:
                    System.out.println("FACTURA");
                    System.out.println("Nombre cliente: "+nom+ "  Telefono cliente: "+tel+ "  Fecha: "+ fec);
                    System.out.println("Producto:Mouse  cant: " + cant1 + "  valor unidad: 80.000 valor total: "+ total1);
                    System.out.println("Producto:Teclado  cant: " + cant2+ "  valor unidad: 320.000 valor total: "+ total2);
                    System.out.println("Producto:Monitor  cant: " + cant3 +"  valor unidad: 940.000 valor total: "+ total3);
                    System.out.println("Producto:Disco duro  cant :" + cant4+ "  valor unidad: 230.000 valor total: "+ total4);
                    System.out.println("Producto:Memoria RAM  cant :" + cant5+ "  valor unidad: 180.000 valor total: "+ total5);
                    System.out.println("El valor total es: "+valort);
                    System.out.println("El iva es: "+ iva);
                    System.out.println("El valor total con iva es: "+ valortt);

                    break;

            }



        }while (op != 6) ;

        teclado.close();
    }
}