package com.caretronics.entradaesaidadedados;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class LeNumArquivoGravaEmOutro {

	
	public static void main(String[] args) throws Exception{
		File source = new File("C:/teste/arq.txt");
		File destination = new File("C:/teste/arq2.txt");
		if (!destination.exists()){
			destination.createNewFile();
		}
		Writer w = new FileWriter(destination);
		BufferedWriter writer = new BufferedWriter(w);
		Scanner sc = new Scanner(source);
		while (sc.hasNext()){
			writer.write(sc.nextLine().replaceAll("\\s+", ";"));
			writer.newLine();
		}
		writer.flush();
		writer.close();
	}
	
	
	
}
