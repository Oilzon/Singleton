package br.ufpb.dcx.singletonMethod;

public class TesteSingleton {

	public static void main(String[] args) {
		Singleton singleton = null;
		
		for(int i =0; i< 5; i ++) {
			singleton = Singleton.getInstancia();  //Na primeira vez criar� a inst�ncia, nas seguintes, utilizara a inst�ncia j� criada
			
			System.out.println(i);
		}

	}

}
