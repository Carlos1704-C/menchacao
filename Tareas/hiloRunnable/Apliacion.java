package hiloRunnable;

public class Apliacion
{
	public static void main(String[]Args)
	{
Hilo nuevo = new Hilo("Hilo 1");
Thread hilo = new Thread(nuevo);

Hilo nuevo2 = new Hilo("Hilo 2");
Thread hilo2 = new Thread(nuevo2);

Hilo nuevo3 = new Hilo("Hilo 3");
Thread hilo3 = new Thread(nuevo3);

hilo.start();
hilo2.start();
hilo3.start();

	}
	

}
