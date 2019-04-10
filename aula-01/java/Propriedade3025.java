
public class Propriedade3025 {

	public static boolean Exercicio1(int numero) {
		
		int resultado, primDez, segDez;
		//numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o número entre 0 e 9999:"));
		
 		if(numero >= 0 && numero <= 9999) {
 			primDez = numero / 100;
 			segDez = numero % 100;
 			
 			resultado = (primDez + segDez);
 			resultado = (int) Math.pow(resultado, 2);
 			
 			if(resultado == numero) 
 				return true;
 			return false;
 		}
 		return false;
		
	}
	
	public static boolean Exercicio2(int numero) {
		
		int resultado, centena, dezena, dezenaAux, unidade;
		
		if(numero >= 100 && numero <= 999) {
			centena = numero / 100;
			dezenaAux = numero % 100;
			dezena = dezenaAux / 10;
			unidade = numero % 10;
			
			resultado = ((int) Math.pow(centena, 3)) + ((int) Math.pow(dezena, 3)) + ((int) Math.pow(unidade, 3));
			
			if(resultado == numero) 
				return true;
			return false;
		}
		return false;
	
	}
	
	public static double Exercicio3(int dia, int mes, int ano) {
		
		if(dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano <= 1953) {
			System.out.println("Escreva dados válidos.");
			return -1;
		}
		
		if(mes == 1 && mes == 2) {
			mes = mes + 12;
			ano = ano - 1;
		}
		
		double resultado;
		resultado = dia + (2 * mes) + (3 * (mes + 1) / 5) + ano + (ano / 4) - (ano / 100) + (ano / 400);
		
		return (resultado % 7);
	
	}

}
