package ficha52;

import java.util.Random;

public class ex529 {
	public static void main(String[] args) {
		Random rand = new Random();
		int face = 0;
		int crown = 0;
		for (int i = 0; i < 20; i++) {
			int flip = rand.nextInt(2);
			if (flip == 1) {
				face += 1;
			} else {
				crown += 1;
			}
		}
		System.out.printf("Face rolls: %d \nCrown rolls: %d\n", face, crown);
	}
}
