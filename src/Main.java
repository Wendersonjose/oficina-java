import br.com.wenderson.oficina.modelos.Cliente;
import br.com.wenderson.oficina.modelos.Veiculo;
import br.com.wenderson.oficina.modelos.Peca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ===== CLIENTE =====
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.print("Digite seu CPF (11 números): ");
        String cpf = input.nextLine();

        System.out.print("Digite seu endereço: ");
        String endereco = input.nextLine();

        System.out.print("Digite seu telefone: ");
        String telefone = input.nextLine();

        System.out.print("Digite seu email: ");
        String email = input.nextLine();

        System.out.print("Digite seu CEP: ");
        String cep = input.nextLine();

        Cliente cliente = new Cliente(nome, cpf, endereco, telefone, email, cep);

        // ===== VEICULO =====
        System.out.print("Placa: ");
        String placa = input.nextLine();

        System.out.print("Modelo: ");
        String modelo = input.nextLine();

        System.out.print("Marca: ");
        String marca = input.nextLine();

        System.out.print("Cor: ");
        String cor = input.nextLine();

        System.out.print("Ano: ");
        int ano = input.nextInt();
        input.nextLine(); // LIMPA O ENTER

        Veiculo veiculo = new Veiculo(placa, modelo, marca, cor, ano, cliente);

        // ===== PEÇA =====
        System.out.print("Digite o nome da peça: ");
        String nomePeca = input.nextLine();

        System.out.print("Digite o valor unitário: ");
        double valor = input.nextDouble();

        System.out.print("Digite a quantidade: ");
        int quantidade = input.nextInt();
        input.nextLine(); // LIMPA O ENTER

        Peca peca = new Peca(nomePeca, valor, quantidade);

        // ===== RESULTADO =====
        System.out.println("\n===== RESUMO =====");
        System.out.println(cliente);
        System.out.println(veiculo);
        System.out.println(peca);
    }
}