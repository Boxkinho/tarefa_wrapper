package m9;

public class TarefaWrapper {

	public static void main(String[] args) {
		
		//casting explicito
		long numero1 = 1000000000000000000l;
		System.out.println(numero1);
		int numero2 = (int) numero1;
		System.out.println(numero1);
				
		//casting implicito
		int nota1 = 1000000000;
		System.out.println(nota1);
		long nota2 = nota1;
		System.out.println(nota1);

	}

}
