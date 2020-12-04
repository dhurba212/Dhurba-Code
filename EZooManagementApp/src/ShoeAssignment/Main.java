package ShoeAssignment;

import java.util.Arrays;

public class Main {
	
	 

	public static void main(String[] args) {
		
		Object shoes []= new Object[2];
		
		Running run=new Running(5.5,"nike", 10.5);
		shoes[0]=run;
		
		Walking walk=new Walking(true,"sneaker", 9);
		shoes[1]=walk;
		// TODO Auto-generated method stub
		
		for(int i=0;i<shoes.length;i++)
		{
			System.out.println(shoes[i]);
		}
				
				System.out.println(walk.goreTex);

	}

}
