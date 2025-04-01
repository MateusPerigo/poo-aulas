import javax.swing.JOptionPane;

public class EstruturaDoWhile {
    public static void main(String[] args) {
        double nota1, nota2;
        int contador = 1;
        do {
            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota"));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota"));
            JOptionPane.showMessageDialog(null, "A média é:" + (nota1+nota2)/2);
            contador++;
        } while (contador<=3);
    }
}
