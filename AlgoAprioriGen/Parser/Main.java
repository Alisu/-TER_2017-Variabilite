import java.io.IOException;


public class Main {

	public static void main(String[] args) throws IOException {
		Parser p = new Parser();
		//entrer le chemin vers un fichier .rcft
		String s = "Nom du fichier";
		p.parseRCFTtoContext(s);
		System.out.println(p.toString());
	}

}
