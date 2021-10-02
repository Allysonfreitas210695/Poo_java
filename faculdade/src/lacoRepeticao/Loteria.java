package lacoRepeticao;


public class Loteria {
	public static void imprimirNumerosMegaSena() {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("                  CARTAO MEGA SENA                 ");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		for(int i = 0; i < 60; i++) {
			if(i <= 9) {
				if((i+1) < 10) {
					System.out.printf("|0%d| ",(i + 1));
				}else {
					System.out.printf("|%d| ",(i + 1));
					System.out.println();
				}
			}else{
				if((i + 1) == 20 || (i + 1) == 30 || (i + 1) == 40 || (i + 1) == 50 || (i + 1) == 60) {
					System.out.printf("|%d| ",(i + 1));
					System.out.println();
				}else {
					System.out.printf("|%d| ",(i + 1));
				}
			}
		}
		System.out.println();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}
	
	public static void imprimirNumerosLotoMania() {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("            CARTAO LOTO MANIA              ");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		for(int i = 0; i < 100; i++) {
			if(i <= 9) {
				if((i+1) < 10) {
					System.out.printf("|0%d| ",(i + 1));
				}else {
					System.out.printf("|%d| ",(i + 1));
					System.out.println();
				}
			}else{
				if((i + 1) == 20 || (i + 1) == 30 || (i + 1) == 40 || (i + 1) == 50 || (i + 1) == 60 || (i + 1) == 70 || (i + 1) == 80 || (i + 1) == 90) {
					System.out.printf("|%d| ",(i + 1));
					System.out.println();
				}else {
					if((i + 1) == 100)
					   System.out.printf("|00| ");
					else
						System.out.printf("|%d| ",(i + 1));
				}
			}
		}
		System.out.println();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}
}
