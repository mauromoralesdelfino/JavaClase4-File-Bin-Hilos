
import java.io.File;
import java.io.FileInputStream;
import java.io.*;


public class ClasePrincipal {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		/* ESCRITURA Y LECTURA BINARIA
		File fi = new File("C:\\Users\\alumno\\Desktop\\PDF.txt");
		File fo = new File("copy.txt");
		
		FileInputStream fis = new FileInputStream(fi);//Leer
		BufferedInputStream bis = new BufferedInputStream(fis);//Leer
		
		FileOutputStream fos = new FileOutputStream(fo);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int size = 1024;
		
		byte[] buffer = new byte[size];
		int lent;
		while((lent = bis.read(buffer, 0, size))>-1)
		{
			//System.out.println("leo de "+fi.getName() +lent);
			bos.write(buffer,0,lent);
			
		}
		bos.flush();*/
		
		//MiHilo t = new MiHilo();
		//t.start();//cuendo MiHilo extendsthread para ejecutar hilo simepre sellama a start = por ultimo invoca al metodo run
		Thread t = new Thread(new MiHilo(),"Mi Hilo ");
		Thread t2 = new Thread(new MiHilo(),"Hilo2 ");
		t2.start();
		t.start();//hilo se va a ejecutar hasta que se reinicie computadora. Termina cuando sale del metodo run
		//System.out.println("Termino main");
		//System.out.println(Thread.currentThread().getName());// en este plano siempre es el main
		/*while(t.isAlive() || t2.isAlive())//detiene/ demora al main, no sale del main hasta que no terminan los hilos
			
		{
			//System.out.println("Termino main");
			System.out.println(Thread.currentThread().getName());
		}*/
		Thread.sleep(1000);
		System.out.println(Thread.currentThread().getName());
		
		
		
		
		
		
		

		
	}

}
