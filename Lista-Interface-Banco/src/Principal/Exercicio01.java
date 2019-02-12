/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import View.AlunoLista;
import java.awt.EventQueue;

/**
 *
 * @author Alunos
 */
public class Exercicio01 {

    public static void main(String[] args) {
            EventQueue.invokeLater(new Runnable() {
                
                @Override
                public void run() {
                    new AlunoLista();
                }
            });
    }
    
}
