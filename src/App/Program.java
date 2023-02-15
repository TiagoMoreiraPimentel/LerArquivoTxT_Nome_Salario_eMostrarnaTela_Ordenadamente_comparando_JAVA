package App;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		// instancia a lista que recebera e armazenara os nomes.
		List<Employee> list = new ArrayList<>();
		// define o caminho do arquivo que sera lido.
		String path = "C:\\Users\\nitro\\Desktop\\in.txt";

		// metodo de leitura com buff.
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			// variavel que armazena os valores na linha do txt.
			String employeeCsv = br.readLine();

			// laço for para percorrer a linha até o final.
			while (employeeCsv != null) {
				// separa os dados pelo delimitador virgula.
				String[] fields = employeeCsv.split(",");
				// pega o valor da linha e armazena na variavel 'nome'.
				list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
				// reinicia o processo até acabar os dados da linha.
				employeeCsv = br.readLine();
			}

			// apresenta os dados no console de forma ordenada por ordem alfabetica.
			Collections.sort(list);

			// faz a leitura da lista printando os dados do funcionario.
			for (Employee emp : list) {
				System.out.println(emp.getName() + ", " + emp.getSalary());
			}

			// trata as possiveis exceções.
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
