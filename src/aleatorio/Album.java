package aleatorio;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Album {

	public static void main(String[] args) {

		Set<Integer> album = new HashSet<Integer>();
		Scanner in = new Scanner(System.in);

		int sizeAlbum = in.nextInt();

		// informar total de figurinhas compradas
		int bouthFigures = in.nextInt();

		while (bouthFigures != 0) {
			// informe o numero da figurinha da figurinha
			int numberFigure = in.nextInt();

			if (!album.contains(numberFigure)) {
				album.add(numberFigure);

				sizeAlbum--;
				if (sizeAlbum == 0) {
					break;
				}
			}
			bouthFigures--;
		}

		System.out.println();
		System.out.println(sizeAlbum);

		in.close();
	}

}
