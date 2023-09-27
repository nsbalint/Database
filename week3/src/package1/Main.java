package package1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import package2.Main2;

public class Main {

	public static void main(String[] args) {
		
		Main prog = new Main();
		prog.szuro("C:\Users\au086680\eclipse-workspace\week3\src\package1\input.txt" , "C:\Users\au086680\eclipse-workspace\week3\src\package1\output.txt")
	}
	
	public void szuro(String fnev, String fnevout) throws IOException {
		try {
			FileReader bef1 = new FileReader(fnev, StandardCharsets.UTF_8);
			BufferedReader bef = new BufferedReader(bef1);
			String sor;
			int fiz = 0;
			int osszeg = 0;
			int db = 0;
			while((sor = bef.readLine())!=null) {
				String[] mezok = sor.split(",");
				fiz = Integer.valueOf(mezok[2]);
				System.out.println(sor + ":" + fiz);
				osszeg += fiz;
				db += 1;
			}
			int atlag = osszeg/db;
			System.out.println("atlag:" + atlag);
			bef.close();
			bef1 = new FileReader(fnev, StandardCharsets.UTF_8);
			bef = new BufferedReader(bef1);
			FileWriter kif1 = new FileWriter(fnevout);
			BufferedWriter kif = new BufferedWriter(kif1);
			while((sor = bef.readLine()) !=null) {
				String[] mezok = sor.split(",");
				fiz = Integer.valueOf(mezok[2]);
				if(fiz > atlag) {
					kif.write(mezok[0]);
					kif.newLine();
				}
			}
			bef.close();
			kif.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
