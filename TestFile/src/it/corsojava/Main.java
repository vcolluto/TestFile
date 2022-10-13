package it.corsojava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("nuovofile.txt");
			fw.write("Ciao ");
			fw.write("mondo!\n");
			
			fw.write("Nuova linea");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		File f=new File("nuovofile.txt");
		
		System.out.println("Il file è stato creato in: "+f.getAbsolutePath());
		
		
		
		Scanner sc;
		try {
			sc = new Scanner(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
		System.out.println("Contenuto del file: ");
		while (sc.hasNextLine()) {
			String s=sc.nextLine();
			System.out.println(s);
		}
		sc.close();
		
		
		
		
		
		/*
		File d=new File("C:\\Users\\Enzo");
		
		for(String nomeFile:d.list()) {
			File f=new File("C:\\Users\\Enzo"+nomeFile);
			if (f.isDirectory())
				System.out.println("DIR: "+nomeFile);
			else
				System.out.println("FILE: "+nomeFile);
			
		}
			*/

	}

}
