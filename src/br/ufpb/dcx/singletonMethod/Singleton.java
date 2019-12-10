package br.ufpb.dcx.singletonMethod;

public class Singleton {
	
	private static Singleton instancia = null; //Garante o acesso statico ao getInstance
	
	private Singleton() {}  //ConstrutorPrivado: impede que outras classes possam criar instancias
	
	public static Singleton getInstancia() {  //Ponto global de acesso
		if (instancia == null) {	//l�gica do singleton: Se n existe, crie. Se j� existe, retorne-a.
			System.out.println("Inst�ncia criada..");
			instancia = new Singleton();
		}
		return instancia;
		
		
	}

}
