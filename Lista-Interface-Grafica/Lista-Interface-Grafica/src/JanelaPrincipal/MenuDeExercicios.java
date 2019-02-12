/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JanelaPrincipal;

import Exercicio01.Exercicio01;
import Exercicio01.InterfaceLista09;
import Exercicio02.Exercicio02;
import Exercicio03.Exercicio03;
import Exercicio04.Exercicio04;
import Exercicio05.Exercicio05;
import Exercicio06.Exercicio06;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Alunos
 */
public class MenuDeExercicios implements InterfaceLista09{
    
    private JFrame jFrame;
    private JButton jButton01, 
            jButton02, 
            jButton03, 
            jButton04, 
            jButton05, 
            jButton06, 
            jButton07, 
            jButton08, 
            jButton09;
    
    public MenuDeExercicios(){
        gerarTela();
        instanciarComponentes();
        adicionarComponentes();
        gerarDimensoes();
        gerarLocalizacoes();
        acaoJButton01();
        acaoJButton02();
        acaoJButton03();
        acaoJButton04();
        acaoJButton05();
        acaoJButton06();
        acaoJButton07();
        acaoJButton08();
        acaoJButton09();
        jFrame.setVisible(true);
        
    }

    @Override
    public void gerarTela() {
        jFrame = new JFrame();
        jFrame.setSize(390, 410);
        jFrame.setLayout(null);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void instanciarComponentes() {
        jButton01 = new JButton("Exercicio 01");
        jButton02 = new JButton("Exercicio 02");
        jButton03 = new JButton("Exercicio 03");
        jButton04 = new JButton("Exercicio 04");
        jButton05 = new JButton("Exercicio 05");
        jButton06 = new JButton("Exercicio 06");
        jButton07 = new JButton("Exercicio 07");
        jButton08 = new JButton("Exercicio 08");
        jButton09 = new JButton("Exercicio 09");
        
    }

    @Override
    public void adicionarComponentes() {
        jFrame.add(jButton01);
        jFrame.add(jButton02);
        jFrame.add(jButton03);
        jFrame.add(jButton04);
        jFrame.add(jButton05);
        jFrame.add(jButton06);
        jFrame.add(jButton07);
        jFrame.add(jButton08);
        jFrame.add(jButton09);
    }

    @Override
    public void gerarDimensoes() {
        jButton01.setSize(110, 110);
        jButton02.setSize(110, 110);
        jButton03.setSize(110, 110);
        jButton04.setSize(110, 110);
        jButton05.setSize(110, 110);
        jButton06.setSize(110, 110);
        jButton07.setSize(110, 110);
        jButton08.setSize(110, 110);
        jButton09.setSize(110, 110);
    }

    @Override
    public void gerarLocalizacoes() {
        jButton01.setLocation(10, 10);
        jButton02.setLocation(10, 128);
        jButton03.setLocation(10, 250);
        jButton04.setLocation(130, 10);
        jButton05.setLocation(130, 128);
        jButton06.setLocation(130, 250);
        jButton07.setLocation(250, 10);
        jButton08.setLocation(250, 128);
        jButton09.setLocation(250, 250);
    }

    private void acaoJButton01() {
        jButton01.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio01();
            }
        });
    }

    private void acaoJButton02() {
        jButton02.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio02();
            }
        });
    }

    private void acaoJButton03() {
        jButton03.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio03();
            }
        });
    }

    private void acaoJButton04() {
        jButton04.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio04();
            }
        });
    }

    private void acaoJButton05() {
        jButton05.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio05();
            }
        });
    }

    private void acaoJButton06() {
        jButton06.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                new Exercicio06();
            }
        });
    }

    private void acaoJButton07() {
    }
    
    private void acaoJButton08() {
    }

    private void acaoJButton09() {
    }

    
}
