
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alunos
 */
public class PricipalMacaco {

    public static void main(String[] args) {

        Macaco macaco1 = new Macaco();
        macaco1.nome = "Macaco Prego";
        macaco1.idade = 2;
        macaco1.nomeCientifico = "Sapajus";
        macaco1.corPelo = "Marrom";
        macaco1.apelido = "micos-de-topete";
        macaco1.reino = "Animalia";
        macaco1.filo = "macacos de cheiro";
        macaco1.classe = "Mammalia";
        macaco1.ordem = "Primates";
        macaco1.familia = "Cebinae";
        macaco1.genero = "Chordata";
        macaco1.especie = "Simia apella";
        macaco1.altura = 1.30f;
        macaco1.peso = 40;

        Macaco macaco2 = new Macaco();
        macaco2.nome = "Sagui";
        macaco2.idade = 3;
        macaco2.nomeCientifico = "Callitrichidae";
        macaco2.corPelo = "cinza";
        macaco2.apelido = "soim";
        macaco2.reino = "Aimalia";
        macaco2.filo = "Chordata";
        macaco2.classe = "Mammalia";
        macaco2.ordem = "Primates";
        macaco2.familia = "Callitrichidae";
        macaco2.genero = "Cebuella";
        macaco2.especie = "Hapalidae";
        macaco2.altura = 1.30f;
        macaco2.peso = 66f;

        Macaco macaco3 = new Macaco();
        macaco3.nome = "Mico leão dourado";
        macaco3.idade = 5;
        macaco3.nomeCientifico = "Leontopithecus";
        macaco3.corPelo = "dourado";
        macaco3.apelido = "Mico";
        macaco3.reino = "Animalia";
        macaco3.filo = "Chordata";
        macaco3.classe = "Mammalia";
        macaco3.ordem = "Primates";
        macaco3.familia = "Callitrichidae";
        macaco3.genero = "Leotopithecus";
        macaco3.especie = "L. rosalia";
        macaco3.altura = 1.4f;
        macaco3.peso = 40;

        Macaco macaco4 = new Macaco();
        macaco4.nome = JOptionPane.showInputDialog("Digite o nome do animal: ");
        macaco4.idade = Byte.parseByte(JOptionPane.showInputDialog("Digite a idade do animal: "));
        macaco4.nomeCientifico = JOptionPane.showInputDialog("Digite o nome cientifico: ");
        macaco4.corPelo = JOptionPane.showInputDialog("Digite a coloração do pelo: ");
        macaco4.apelido = JOptionPane.showInputDialog("Digite o apelido: ");
        macaco4.reino = JOptionPane.showInputDialog("Digite o reino: ");
        macaco4.filo = JOptionPane.showInputDialog("Digite o filo: ");
        macaco4.classe = JOptionPane.showInputDialog("Digite a classe: ");
        macaco4.ordem = JOptionPane.showInputDialog("Digite a ordem: ");
        macaco4.familia = JOptionPane.showInputDialog("Digite a familia: ");
        macaco4.genero = JOptionPane.showInputDialog("Diite o genero: ");
        macaco4.especie = JOptionPane.showInputDialog("Digite a especie: ");
        macaco4.altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura media: "));
        macaco4.peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso médio: "));

        Macaco macaco5 = new Macaco();
        macaco5.nome = JOptionPane.showInputDialog("Digite o nome do animal: ");
        macaco5.idade = Byte.parseByte(JOptionPane.showInputDialog("Digite a idade do animal: "));
        macaco5.nomeCientifico = JOptionPane.showInputDialog("Digite o nome cientifico: ");
        macaco5.corPelo = JOptionPane.showInputDialog("Digite a coloração do pelo: ");
        macaco5.apelido = JOptionPane.showInputDialog("Digite o apelido: ");
        macaco5.reino = JOptionPane.showInputDialog("Digite o reino: ");
        macaco5.filo = JOptionPane.showInputDialog("Digite o filo: ");
        macaco5.classe = JOptionPane.showInputDialog("Digite a classe: ");
        macaco5.ordem = JOptionPane.showInputDialog("Digite a ordem: ");
        macaco5.familia = JOptionPane.showInputDialog("Digite a familia: ");
        macaco5.genero = JOptionPane.showInputDialog("Diite o genero: ");
        macaco5.especie = JOptionPane.showInputDialog("Digite a especie: ");
        macaco5.altura = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura media: "));
        macaco5.peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o peso médio: "));

        JOptionPane.showMessageDialog(null, macaco1);                
        
        JOptionPane.showMessageDialog(null,macaco2);
        
        JOptionPane.showMessageDialog(null,macaco3);
        
        JOptionPane.showMessageDialog(null,macaco4);
        
        JOptionPane.showMessageDialog(null,macaco5);

    }
}
