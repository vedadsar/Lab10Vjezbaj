import java.util.Scanner;

public class xo2 {

	public static int upisxX() {// Unos koordinate x od "X"
		Scanner in = new Scanner(System.in);

		int xX;
		xX = in.nextInt();

		return xX;

	}

	public static int upisyX() { // Unos koordinate y od "X"
		Scanner in = new Scanner(System.in);

		int yX = 0;
		yX = in.nextInt();

		return yX;
	}

	public static int upisxO() { // Unos koordinate x od " O "
		Scanner in = new Scanner(System.in);
		int xO;
		xO = in.nextInt();

		return xO;

	}

	public static int upisyO() {// Unos koordinate y od "O"
		Scanner in = new Scanner(System.in);

		int yO = 0;

		yO = in.nextInt();

		return yO;
	}

	public static void main(String[] args) {

		int[][] move = new int[3][3]; // Dvodimenzionalni niz, koordinate

		int polje1 = move[0][0];
		int polje2 = move[1][0];
		int polje3 = move[2][0];
		int polje4 = move[0][1];
		int polje5 = move[1][1]; // Definisem polja i koordinate polja
		int polje6 = move[2][1];
		int polje7 = move[0][2];
		int polje8 = move[1][2];
		int polje9 = move[2][2];

		int x1;
		int x2;
		int o1;
		int o2;

		int brojac = 0;
		while (brojac < 9) {

			System.out
					.println("Prvi igrac na potezu, unestie x,y koordinate od X");

			x1 = upisxX();
			x2 = upisyX();
			move[x1][x2] = 1;
			brojac = brojac + 1;

			if ((polje1 == 1 && polje2 == 1 && polje3 == 1)
					|| (polje1 == 1 && polje5 == 1 && polje9 == 1)
					|| (polje1 == 1 && polje4 == 1 && polje7 == 1)
					|| (polje2 == 1 && polje5 == 1 && polje8 == 1)
					|| (polje3 == 1 && polje6 == 1 && polje9 == 1)
					|| (polje7 == 1 && polje5 == 1 && polje3 == 1)
					|| (polje7 == 1 && polje8 == 1 && polje9 == 1)) {

				System.out.println("Pobjednik igrac broj 1");

			}

			System.out
					.println("Drugi igrac na potezu, unestie x,y koordinate od O");

			o1 = upisxO();
			o2 = upisyO();
			move[o1][o2] = 2;
			brojac = brojac + 1;

			if ((polje1 == 2 && polje2 == 2 && polje3 == 2)
					|| (polje1 == 2 && polje5 == 2 && polje9 == 2)
					|| (polje1 == 2 && polje4 == 2 && polje7 == 2)
					|| (polje2 == 2 && polje5 == 2 && polje8 == 2)
					|| (polje3 == 2 && polje6 == 2 && polje9 == 2)
					|| (polje7 == 2 && polje5 == 2 && polje3 == 2)
					|| (polje7 == 2 && polje8 == 2 && polje9 == 2)) {

				System.out.println("Pobjednik igrac broj 2");

			}

		}

	}
}
