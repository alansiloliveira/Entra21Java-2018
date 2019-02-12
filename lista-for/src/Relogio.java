
public class Relogio {

	public static void main(String[] args) {

		String relogio = "";
		for (int h = 0; h < 24; h++) {
			for (int m = 0; m < 60; m++) {
				for (int s = 0; s < 60; s++) {
					
					relogio += ("\n" + h + ":" + m + ":" + s);
				}
			}

			relogio += "\n";
		}
		System.out.println(relogio);
	}
}
