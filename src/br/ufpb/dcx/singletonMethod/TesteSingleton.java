package br.ufpb.dcx.singletonMethod;

public class TesteSingleton {

	public static void main(String[] args) {
		Singleton singleton = null;
		
		for(int i =0; i< 5; i ++) {
			singleton = Singleton.getInstancia();  //Na primeira vez criará a instância, nas seguintes, utilizara a instância já criada
			
			System.out.println(i);
		}

	}

}
