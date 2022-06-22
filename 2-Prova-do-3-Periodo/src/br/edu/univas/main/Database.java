package br.edu.univas.main;
import br.edu.univas.vo.*;
import java.util.ArrayList;
import java.util.Scanner;

import br.edu.univas.vo.Doador;

public class Database{

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        ArrayList<Doador> DoadorList = new ArrayList<>();

	        int option = 0;
	        do {
	            printMenu();
	            option = readInteger(scanner);

	            if (option == 1) {
	                cadastrarDoador(scanner, DoadorList);
	            } else if (option != 9) {
	                System.out.println("Opção invalida!");
	            }
	        } while(option != 9);

	        scanner.close();
	    }

	    private static void cadastrarDoador(
	            Scanner scanner, ArrayList<Doador> DoadorList) {
	        Doador doador;

	        System.out.println("Cadastro de Doador");
	        System.out.println("Escolha uma opção:");
	        System.out.println("1 - Cadastrar Doador");
	        System.out.println("2 - Ver Situação banco");

	        int option = readInteger(scanner);
	        if (option == 1) {
	            doador = new Doador();
	        } 
	        
	        System.out.println("Digite o cpf:");
	        doador.getCpf(readInteger(scanner));

	        if (DoadorList.contains(doador)) {
	            System.out.println("Erro ao cadastrar Doador." +
	                    "CPF já¡ existe!");
	        } else {
	            DoadorList.add(doador);
	            System.out.println("Doador cadastrado com sucesso!");
	        }
	    }

	    private static void printMenu() {
	        System.out.println("Escolha uma opção:");
	        System.out.println("1 - Cadastrar Doador");
	        System.out.println("2 - Listar Banco de Sangue");
	        System.out.println("9 - Sair");
	    }

	    private static int readInteger(Scanner scanner) {
	        int result = scanner.nextInt();
	        scanner.nextLine();
	        return result;
	    }
	        
	}
