package Java;

public class ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object login[][]= new Object[4][2];
		login[0][0]="Admin1";
		login[0][1]=12569;
		login[1][0]="Admin2";
		login[1][1]=561584;
		login[2][0]="Admin3";
		login[2][1]=546464;
		login[3][0]="Admin4";
		login[3][1]="Test4";
		System.out.println(login[2][1]);//for single row
		// for all rows
	for(int i=0;i<login.length;i++)
	{
		//for all columns
		for(int j=0;j<login[i].length;j++)
		{
			System.out.print(login[i][j]+"\t");
		}
		System.out.println();
	}
	}
	



	}


