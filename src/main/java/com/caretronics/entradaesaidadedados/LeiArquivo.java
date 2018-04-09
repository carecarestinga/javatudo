package com.caretronics.entradaesaidadedados;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class LeiArquivo {

	public static void main(String[] args) throws Exception{
		File source = new File("C:/testes/teste1.txt");
		File destination = new File("C:/testes/teste2.txt");
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
		System.out.println("Arquivo Copiado com Sucesso");
	}
	
}
