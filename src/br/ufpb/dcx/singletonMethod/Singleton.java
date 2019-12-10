package br.ufpb.dcx.singletonMethod;

public class Singleton {
	
	private static Singleton instancia = null; //Garante o acesso statico ao getInstance
	
	private Singleton() {}  //ConstrutorPrivado: impede que outras classes possam criar instancias
	
	public static Singleton getInstancia() {  //Ponto global de acesso
		if (instancia == null) {	//lógica do singleton: Se n existe, crie. Se já existe, retorne-a.
			System.out.println("Instância criada..");
			instancia = new Singleton();
		}
		return instancia;
		
		
	}

}
