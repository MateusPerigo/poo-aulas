import javax.swing.JOptionPane;

public class ExercicioForSimples {
    public static void main(String[] args) {
        String saida = "";
        for (int contador=1; contador<= 100; contador++){
            System.out.println(contador);
            saida = saida + contador + ",";  
    }
    JOptionPane.showMessageDialog(null, saida);
}
}