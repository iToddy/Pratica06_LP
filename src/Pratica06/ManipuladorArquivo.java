package Pratica06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;


public class ManipuladorArquivo {
	
	public static void leitor(String project) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(project));
		String linha = "";
		while (true) {
			if (linha != null) {
				System.out.println(linha);

			} else
				break;
			linha = buffRead.readLine();
		}
		buffRead.close();
	}

	public static void escritor(String project) throws IOException {
		BufferedWriter escrever = new BufferedWriter(new FileWriter(project));
		String name, objective, adress, date, status;
		ArrayList<String> projectList = new ArrayList();
		Scanner in = new Scanner(System.in);
		System.out.println("Escreva os atributos do projeto: Título, Objetivo, Endereço completo,  data de início e status");
		name = in.next();
		objective = in.next();
		adress = in.next();
		date = in.next();
		status = in.next();
		 
		projectList.add("Nome: " + name + "; Objetivo: " + objective + "; Endereço completo: " + adress + "; Data de início " + date + " Status: " + status);
		
		
		escrever.append(projectList + "\n");
		escrever.close();
		System.out.println("Criado com sucesso");
		
	}

	public static void main(String[] args) throws IOException {
		
		Scanner in = new Scanner(System.in);
		
		String project = "";
		 int menu; 
		 
		 do {
			
			 System.out.println("MENU\n1- Definir caminho e nome de Arquivo TXT para gravação\n2-Cadastrar Projeto\n3-Abrir Arquivo do Projeto\n4-Sair");
        	 menu = in.nextInt();
        	 
        	 switch (menu) 
        	 {
        	 case 1:
        		
        		 System.out.println("Digite o nome do arquivo");
        		 project = in.next();
        		 
        		 break;
        	 case 2:
        		 
        		 ManipuladorArquivo.escritor(project);
        		 
        		 break;
        	 case 3:
        		 
        		 ManipuladorArquivo.leitor(project);
        		      
        		 break;
        	 case 4:
        		 
        		 System.out.println("Menu fechado !");
        		 
        		 break;
        	default:	 
        		 
        	 }
			 
		 } while(menu != 4);
		
	}

}
