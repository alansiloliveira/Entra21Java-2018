
package JanelaPrincipal;

import java.awt.EventQueue;

/**
 *
 * @author Alunos
 */
public class MenuPrincipal {
    
    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuDeExercicios();
            }
        });
    }
}
