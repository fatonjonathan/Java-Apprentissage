package InitJAVA;

public class TableauMultiDimentionnel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] tableau = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		for (int i = 0; i < tableau.length; i++)
		{
			for (int j = 0; j < tableau[i].length; j++)
			{
				System.out.println(tableau[i][j]);
			}
		}
		
		// Mon exemple pour faire le foreach en Java
		String[][] table = {
				{"mangue", "banane", "fraise"},
				{"papaye", "orange", "kiwi"},
				{"prune", "cerise", "coco"}			
		};
		
		for (int tab = 0; tab < table.length; tab++) { //je parcours le tableau ligne par ligne
			for(int tabElement = 0; tabElement < table[tab].length; tabElement++)//je parcours colonne par colonne le tableau de la ligne en cours
			{
				if(table[tab][tabElement] == "orange") {
					System.out.print(table[tab][tabElement]);
				}
				//System.out.print(table[tab][tabElement]+ " ");
			}
			System.out.println();// renvoie a la ligne après chaque itération de la première boucle
		}
		//fin de l'exemple
		
		
	}

}
