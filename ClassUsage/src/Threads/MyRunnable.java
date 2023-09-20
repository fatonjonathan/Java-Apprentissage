package Threads;

//Runnable est une interface native a java
class MyRunnable implements Runnable {
	private String name;
	
	public MyRunnable(String name)
	{
		this.name = name;
	}
	
	
	@Override
	public void run() {
		for(int i = 1; i<=5; i++) {
			System.out.println(name + ": Etape " + i);
			
			try {
				Thread.sleep(1000);
			}catch(){
				System.out.println(name + " à été interrompu ");
			}
		}
		
	}
	
	
	
	
	
}
