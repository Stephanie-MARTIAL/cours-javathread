package org.eclipse.main;

import org.eclipse.classes.MyThread;
import org.eclipse.classes.MyThreadRunnable;
import org.eclipse.classes.TestThread;
import org.eclipse.classes.Compteur;
import org.eclipse.classes.MyCount;

public class Main {

	// un thread est un moyen d'éxécuter un ensemble d'instructions indépendamment
	// du thread principal
	// tout programme tourne dans un thread; il s'agit de programmes monothreaded
	// lorsqu'on ajoute un ou plusieurs threads, il s'agit alors de programme
	// multithreaded
	// Quand faut-il utiliser les threads?
	// Lorsque vous devez exécuter quelque chose demandant beaucoup de temps (un
	// calcul complexe,
	// attente d'un évènement, ...) tout en évitant de bloquer l'exécution du
	// programme

	public static void main(String[] args) throws InterruptedException {

		// Deux solutions possibles pour creer un thread, soit

		// En creant un objet d'une sous-classe de Thread
		// qui implemente la méthode run()

//		
//		MyThread A = new MyThread("A");
//		MyThread B = new MyThread("B");
//		MyThread C = new MyThread("C");
//		
//		
////		Thread A = new Thread(new MyThreadRunnable("A"));
////		Thread B = new Thread(new MyThreadRunnable("B"));
////		Thread C = new Thread(new MyThreadRunnable("C"));
////		
//		// start() pour démarrer le thread
//		
//		A.start();
//		
//		System.out.println(A.isAlive()+ " " + A.getState());
//
//		B.start();
//		C.start();
//		
//		//demander à un thread d'interrompre son exécution
//		B.interrupt();
//		
//		// bloque le thread courant jusqu'à la mort du thread appelant - main est appelé en dernier
//		A.join();
//		B.join();
//		C.join();
//		
//		System.out.println(A.isAlive()+ " " + A.getState());
//		
//		System.out.println(Thread.currentThread().getName() + ": j'ai fini");

		// Ecrire une classe Compteur qui herite de Thread avec un attribut nom

		// Un compteur a une methode run qui compte de 1 a 7 A chaque iteration,
		// le thread affiche son nom + l’indice de son iteration
		// puis appelle la methode sleep pour une duree aleatoire (de 0 a 3 000
		// millisecondes).

		// Quand il finit de compter, il affiche un message contenant son
		// nom et un message du type a fini de compter en position x et il affiche sa
		// position
		// Creer un main avec 5 threads et verifier l’execution

//
//		Compteur[] compteurs = { new Compteur("a"), new Compteur("b"), new Compteur("c"), new Compteur("d"),
//				new Compteur("e") };
//		for (Compteur c : compteurs) {
//			c.start();
//		}

//		MyCount TC = new MyCount();
//		Thread t1 = new Thread(new TestThread(TC," t1 "));
//		Thread t2 = new Thread(new TestThread(TC," t2 "));
//		Thread t3 = new Thread(new TestThread(TC," t3"));
//		t1.start();
//		t2.start();
//		t3.start();
	}
}
