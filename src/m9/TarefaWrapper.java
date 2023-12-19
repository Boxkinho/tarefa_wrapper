package m9;

public class TarefaWrapper {

	public static void main(String[] args) {
		
		//casting explicito
		long numero1 = 1000000000000000000l;
		System.out.println(numero1);
		Long numero2 = (Long) numero1;
		System.out.println(numero2);
				
		//casting implicito
		int nota1 = 1000000000;
		System.out.println(nota1);
		Integer nota2 = nota1;
		System.out.println(nota2);

	}

}
