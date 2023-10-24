//Testar o uso dos métodos getters, setters e workers 
//Usar os construtores das classes Clientes, Pedidos e Produtos

import java.util.Scanner;

public class TesteCliPedProd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Curiosidade: a classe Scanner está recebendo como parâmetro o método in (entrada do teclado) da classe System 
        Clientes cliente = new Clientes(); //Construtor sem parâmetros

        int idCliente = 0, idProduto = 0;

        double precoProduto = 25.99;

        String nome, telefone, endereco, descricao, data;

        System.out.println("SISTEMA DE CLIENTES, PEDIDOS E PRODUTOS");
        System.out.println("\nQual é o seu nome?");
        nome = sc.next();

        cliente.setNomeCli(nome);

        System.out.println("\nQual é o seu telefone?");
        telefone = sc.next();

         sc.nextLine(); //Ler quebra de linha pendente

        cliente.setTelefoneCli(telefone); //setters

        System.out.println("\nQual é o seu endereço?");
        endereco = sc.nextLine();

        cliente.setEnderecoCli(endereco);

        ++idCliente;

        cliente.setCodCli(idCliente);

        ++idProduto;

        data = "2023-10-24";

        Pedidos pedido = new Pedidos(idProduto, data, precoProduto); //Construtor com parâmetros

        System.out.println("\nPreço do produto: " + pedido.getValorPed()); //getters
        
        Produtos produto = new Produtos(); //Construtor sem parâmetros

        descricao = "teste";

        produto.setDescriProd(descricao); //setters
        produto.setCodProd(idProduto);
        produto.setPrecoProd(precoProduto);

        System.out.println("\nProduto: " + produto.getDescriProd()); //getters

        Produtos produtoCopia = new Produtos(produto); //Construtor cópia


        System.out.println("\nCaro, suas informações: \n\n" + cliente.toString()); //workers

        System.out.println(produtoCopia.validaProduto() == true ? "\nAprovado!" : "\nRecusado!"); //workers

        sc.close(); //close fecha a execução do Scanner permanentemente

    }
    
}
