
import javax.swing.JOptionPane;

public class SomaDoisNumeros {
    public static void main (String[] args) {
        double primeiroValor;
        double segundoValor;
        double resultado;
        String textoUsuario = JOptionPane.showInputDialog("Digite o Primeiro Valor");
        primeiroValor = Double.parseDouble(textoUsuario);
        segundoValor = Double.parseDouble(JOptionPane.showInputDialog("Digite o Segundo Valor"));
        resultado = primeiroValor + segundoValor;
        String operacao = primeiroValor + " + " + segundoValor + " = " + resultado;
        JOptionPane.showMessageDialog(null, "O resultado é: " + resultado + "\n" + operacao);

    }
}