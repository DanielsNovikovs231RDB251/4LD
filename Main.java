// 231RDB251 Daniels Novikovs 3

import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("231RDB251 Daniels Novikovs 3. grupa");
		
	    System.out.println("input file name:");
		String fileName = sc.nextLine();
		sc.close();
		FileReader fr = new FileReader(fileName);
        sc = new Scanner(fr);
        String s;
        System.out.println("result:");
        while (sc.hasNextLine()){
            int n = 0;
            int summ = 0;
            int par =0;
            s = sc.nextLine();
            String [] lines = s.split(" ");
            for (int i = 2; i<lines.length;i++){
                n++;
                summ += Integer.parseInt(lines[i]);
                if (Integer.parseInt(lines[i])<4){
                    par+=1;
                }
            }
            double vid = summ/n;
            if (vid<=5){
                System.out.printf("%s %s %s%n", lines[0],lines[1], par );
            }
        }

		// nolasīt failu
		
		// ievadīto no tastatūras faila nosaukumu fileName nemodificēt, 
		// nepievienot mapes vārdu, nepievienot tipu txt
		
	
		
		// izvadīt rezultātus	
        sc.close();
	}
    
}