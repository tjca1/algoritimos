package br.com.testes;


/*
public class Main {
	public static void main(String[] args) {
		int [][] vetorXy = {{1,1},{1,100}};
		int x = 0;
		int y = 0;
		int soma = 0;
		while(x < vetorXy.length) {
			int[] vetorY = vetorXy[x];
			while(y <  vetorY.length) {
				soma += vetorY[y];
				y++;
			}
			y = 0;
			x++;
		}
		System.out.println(soma);
	}
}
	
*/
public class Main {
	public static void main(String[] args) {
		int [][][] vetorXyz = {{{1,1},{1,1,1,1,1,1}},{{1,1},{1,1}},{{1,1},{1,1,1,1,1,1}},{{1,1},{1,1}},{{1,1},{1,1,1,1,1,1}},{{1,1},{1,1}}};
		int x = 0;
		int y = 0;
		int z = 0;
		int soma = 0;
		while(x < vetorXyz.length) {
			int[][] vetorYz = vetorXyz[x];
			while(y <  vetorYz.length) {
				int[] vetorZ = vetorYz[y];
				while(z < vetorZ.length) {
					soma += vetorZ[z];
					z++;
				}
				z=0;
				y++;
			}
			y = 0;
			x++;
		}
		System.out.println(soma);

	}

	

}
