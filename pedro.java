public class pedro {
	public static void main(String[] args) {
		String cadena = "pedro";
		// cadena resultante
		String invertida = "";
		// Recorrer cadena
		for (int indice = cadena.length() - 1; indice >= 0; indice--) {
			// Concatenar letra por letra
			invertida += cadena.charAt(indice);
		}
		System.out.println("Cadena original: " + cadena);
		System.out.println("Cadena invertida: " + invertida);

	}}