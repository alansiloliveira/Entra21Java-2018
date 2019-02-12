import javax.swing.JOptionPane;

public class Exercicio06{

    public static void main(String[] args){

        int pedido = 0, quantidadeProdutos = 0, bolo = 0, sanduiche = 0, doces = 0, pizza = 0;
        double calculoPreco = 0;

        while(pedido != 16){
            pedido = Integer.parseInt(JOptionPane.showInputDialog(
                "Para realizar o pedido digite o código dos mesmos" +
                "\n\nCódigo     Tipos          Nomes                                   Valor     " +
                "\n\n1.       Bolos          Bolo Brigadeiro                         R$ 29,50" +
                "\n2.       Bolos          Bolo Floresta Negra                 R$ 2,00" +
                "\n3.       Bolos          Bolo Leite com Nutella               R$ 29,23" +
                "\n4.       Bolos          Bolo Mousse de Chocolate             R$ 7,10" +
                "\n5.       Bolos          Bolo Nega Maluca                        R$ 19,33" +
                "\n6.       Doces          Bomba de Creme                          R$ 17,71" +
                "\n7.       Doces          Bomba de Morango                        R$ 4,82" +
                "\n8.       Sanduíches     Filé-Mignon com fritas e cheddar      R$ 21,16" +
                "\n9.       Sanduíches     Hambúrguer com queijos, champignon e rúcula    R$ 12,70" +
                "\n10.      Sanduíches     Provolone com salame                R$ 19,70" +
                "\n11.      Sanduíches     Vegetariano de berinjela             R$ 28,22" +
                "\n12.      Pizzas         Calabresa                               R$ 8,98" +
                "\n13.       Pizzas        Napolitana                              R$ 0,42" +
                "\n14.       Pizzas        Peruana                                 R$ 18,36" + 
                "\n15.       Pizzas        Portuguesa                              R$ 27,50" +
                "\n16.                     Sair"
                ));

                quantidadeProdutos = quantidadeProdutos + 1;

                if(pedido == 1){
                    calculoPreco = calculoPreco + 29.50;
                    bolo = bolo + 1;
                }if(pedido == 2){
                    calculoPreco = calculoPreco + 2;
                    bolo = bolo + 1;
                }if(pedido == 3){
                    calculoPreco = calculoPreco + 29.23;
                    bolo = bolo + 1;
                }if(pedido == 4){
                    calculoPreco = calculoPreco + 7.10;
                    bolo = bolo + 1;
                }if(pedido == 5){
                    calculoPreco = calculoPreco + 19.33;
                    bolo = bolo + 1;
                }if(pedido == 6){
                    calculoPreco = calculoPreco + 17.71;
                    doces = doces + 1;
                }if(pedido == 7){
                    calculoPreco = calculoPreco + 4.82;
                    doces = doces + 1;
                }if(pedido == 8){
                    calculoPreco = calculoPreco + 21.16;
                    sanduiche = sanduiche + 1;
                }if(pedido == 9){
                    calculoPreco = calculoPreco + 12.70;
                    sanduiche = sanduiche + 1;
                }if(pedido == 10){
                    calculoPreco = calculoPreco + 19.70;
                    sanduiche = sanduiche + 1;
                }if(pedido == 11){
                    calculoPreco = calculoPreco + 28.22;
                    sanduiche = sanduiche + 1;
                }if(pedido == 12){
                    calculoPreco = calculoPreco + 8.98;
                    pizza = pizza + 1;
                }if(pedido == 13){
                    calculoPreco = calculoPreco + 0.42;
                    pizza = pizza + 1;
                }if(pedido == 14){
                    calculoPreco = calculoPreco + 18.36;
                    pizza = pizza + 1;
                }if(pedido == 15){
                    calculoPreco = calculoPreco + 27.50;
                }
        }
        JOptionPane.showMessageDialog(null, 
        "Foram escolhidos " + quantidadeProdutos + " produtos" + 
        "\nTotalizando " + calculoPreco + " R$");

        JOptionPane.showMessageDialog(null, 
        "Nesses pedidos foram escolhidos: " +
        "\nBolos: " + bolo +
        "\nDoces: " + doces +
        "\nSanduíches: " + sanduiche + 
        "\nPizzas: " + pizza +
        "\nA média dos preços deles foram: " + calculoPreco / quantidadeProdutos + " R$");

    }
}