package UltraEmojiCombat;

public class UltraEmojiCombat {

	public static void main(String[] args) {
		
		Luta UEC01 = new Luta();
		Lutador player[] = new Lutador [6]; 
		
		player[0] = new Lutador("Pretty Boy", "Fran�a", 31, 1.75, 68.9, 11, 2, 1);
		player[1] = new Lutador("Pustscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
		player[2] = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
		player[3] = new Lutador("Dead Code", "Austr�lia", 28, 1.93, 81.6, 13, 0, 2);
		player[4] = new Lutador("UFOCobol", "Brasil", 37, 1.70, 119.3, 5, 4, 3);
		player[5] = new Lutador("Nerdaart", "EUA", 30, 1.81, 105.7, 12, 2, 4);
		
		UEC01.marcarLuta(player[0], player[1]);
		UEC01.lutar();
		
	}

}
