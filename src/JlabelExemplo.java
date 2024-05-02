import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.*;
import java.text.ParseException;

public class JlabelExemplo extends JFrame {
    // Componentes da interface
     JLabel rotulo;
     JTextArea campoTexto;

    // Construtor
    public JlabelExemplo() {
        super("Exemplo com Label");
        Container container = getContentPane();
        setLayout(null);

        // Criação do rótulo
        rotulo = new JLabel("Telefone");
        rotulo.setBounds(50, 100, 100, 100);

        // Criação do campo de texto formatado
        campoTexto = new JTextArea(20,30);
        campoTexto.setBounds(70, 200, 100, 20);

        // Adiciona os componentes à tela
        container.add(rotulo);
        container.add(campoTexto);

        setSize(400, 500);
        setVisible(true);
    }

    // Método main
    public static void main(String[] args) {
        JlabelExemplo app = new JlabelExemplo();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
