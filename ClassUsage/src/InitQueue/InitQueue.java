package InitQueue;

import java.util.LinkedList;
import java.util.Queue;

public class InitQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> queue = new LinkedList<>();
		
		//ListedLink et queue vont toujours ensemble
		//Enfiler des éléments dans la file d'attente
		queue.offer("client 1");
		queue.offer("client 2");
		queue.offer("client 3");
		
		//Afficher la file d'attente
		System.out.println("File d'attente innitiale " + queue );
		
		//Défilez des éléments ( retirez de la tête de la file )
		String clientServi = queue.poll();
		System.out.println(clientServi + " est servi.");
		
		//Affichez la file d'attente
		System.out.println("File d'attente après service : " + queue);
		
		//Accédez à l'element en tête de la file d'attente sans le retirer
		String prochainClient = queue.peek();
		System.out.println("Prochain client en attente : "  + prochainClient );
		
		
		
	}

}
