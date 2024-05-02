import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;

public class JlabelExemplo extends JFrame {
    // Componentes da interface
    JLabel rotulo;
    JTextArea texto;
    JScrollPane painelrolagem;
    JPanel painel;

    // Construtor
    public JlabelExemplo() {
        super("Exemplo com JTextField");
        Container tela = getContentPane();
        tela.setLayout(null);
        rotulo = new JLabel ("Digite seu texto");
        rotulo.setBounds(50,20,100,20);
        texto = new JTextArea(10,20);
        painelrolagem = new JScrollPane(texto);
        painelrolagem.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        painelrolagem.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        painel = new JPanel();
        painel.add(painelrolagem);
        painel.setBounds(40,40,250,250);
        tela.add(rotulo);
        tela.add(painel);
        setSize(300, 280);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    // Método main
    public static void main(String[] args) {
        JlabelExemplo app = new JlabelExemplo();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
