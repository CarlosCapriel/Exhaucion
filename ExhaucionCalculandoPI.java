
public class ExhaucionCalculandoPI {
	
	public static void main(String[] args) {
		int numeroLados = 6;
		double ladoInicial = 1;
		double x = 0;
		double a = 0;
		double b = 0;
		double nuevoLado = 0;
		double p = 0;
		double pi = 0;
		
		
		for (int i = numeroLados; i <= 12288; i *= 2) {
			x = ladoInicial/2;
			a = Math.sqrt(1-(Math.pow(x, 2)));
			b = 1 - a;
			nuevoLado = Math.sqrt(Math.pow(x, 2) + Math.pow(b, 2));
			p = i * ladoInicial;
			pi = p / 2;
			
			System.out.println(" #Lados:" + i + " \tLado I: " + ladoInicial + " \t x: " + x 
					+ " \t a: " + a +" \t b: "+ b + "\tNuevo Lado: " + nuevoLado +" \t p: " + p + " \t pi: \t"+ pi);
			
			ladoInicial = nuevoLado;
		}
	}
	
}
