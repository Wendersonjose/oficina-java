import br.com.wenderson.oficina.modelos.*;

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

        // ===== VEÍCULO =====
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
        input.nextLine();

        Veiculo veiculo = new Veiculo(placa, modelo, marca, cor, ano, cliente);

        // ===== PEÇA =====
        System.out.print("Digite o nome da peça: ");
        String nomePeca = input.nextLine();

        System.out.print("Digite o valor unitário: ");
        double valor = input.nextDouble();

        System.out.print("Digite a quantidade: ");
        int quantidade = input.nextInt();
        input.nextLine();

        Peca peca = new Peca(nomePeca, valor, quantidade);

        // ===== SERVIÇO =====
        Servico s1 = new Servico("Troca de óleo", 80);
        Servico s2 = new Servico("Alinhamento", 120);
        Servico s3 = new Servico("Balanceamento", 100);
        Servico s4 = new Servico("Revisão geral", 300);

        System.out.println("\nEscolha um serviço:");
        System.out.println("1 - " + s1);
        System.out.println("2 - " + s2);
        System.out.println("3 - " + s3);
        System.out.println("4 - " + s4);

        System.out.print("Digite a opção: ");
        int opcaoServico = input.nextInt();
        input.nextLine();

        Servico servicoEscolhido;

        if (opcaoServico == 1) {
            servicoEscolhido = s1;
        } else if (opcaoServico == 2) {
            servicoEscolhido = s2;
        } else if (opcaoServico == 3) {
            servicoEscolhido = s3;
        } else {
            servicoEscolhido = s4;
        }

        // ===== ORDEM DE SERVIÇO =====
        OrdemServico ordem = new OrdemServico(cliente, veiculo, peca, servicoEscolhido);

        // ===== STATUS DA ORDEM =====
        System.out.println("\nEscolha o status da ordem:");
        System.out.println("1 - ABERTA");
        System.out.println("2 - EM ANDAMENTO");
        System.out.println("3 - FINALIZADA");
        System.out.println("4 - CANCELADA");

        System.out.print("Digite a opção: ");
        int opcaoStatus = input.nextInt();
        input.nextLine();

        if (opcaoStatus == 1) {
            // Ordem já nasce como ABERTA
        } else if (opcaoStatus == 2) {
            ordem.iniciar();
        } else if (opcaoStatus == 3) {
            ordem.iniciar();
            ordem.finalizar();
        } else if (opcaoStatus == 4) {
            ordem.cancelar();
        } else {
            System.out.println("Opção inválida. Ordem mantida como ABERTA.");
        }

        // ===== RESULTADO =====
        System.out.println("\n" + ordem);

        input.close();
    }
}