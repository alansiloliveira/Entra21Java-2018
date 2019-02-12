import javax.swing.JOptionPane;

public class JOptionPaneShowConfirmDialog{

    public static void main(String[] args){

        int opcao = JOptionPane.showConfirmDialog(null, "Deseja cadastrar: ");

        if(opcao == JOptionPane.OK_OPTION) {
            JOptionPane.showMessageDialog(null, "Registrado salvo com sucesso!");}

            else if(opcao == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(null, "Negado com sucesso");
            
            }else if(opcao == JOptionPane.CANCEL_OPTION){
                JOptionPane.showMessageDialog(null, "Cancelado com sucesso");
            
            }else {
                JOptionPane.showMessageDialog(null, "Fechado com sucesso");
            }




        
    }
}