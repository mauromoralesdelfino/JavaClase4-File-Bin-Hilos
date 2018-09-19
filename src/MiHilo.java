
public class MiHilo implements Runnable {
	public MiHilo()
	{}
	
	public void run()
	{
		for(int i =0; i<10; i++)
		{
			//System.out.println("Termino el hilo");
			System.out.println(Thread.currentThread().getName()+i);
			
		}
	}

}
