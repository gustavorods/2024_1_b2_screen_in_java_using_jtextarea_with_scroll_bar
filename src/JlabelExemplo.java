import javax.swing.*;
import java.awt.*;

public class JlabelExemplo extends JFrame{
    // Criando os textos
    JLabel rotulo1, rotulo2;

    // Criando a tela e seus respectivos campos
    public JlabelExemplo() {
        super("Exemplo com Label");
        Container tela = getContentPane();
        setLayout(null);
            // Adicionando a mensagem
            rotulo1 = new JLabel("Nome");

            // Definindo as posições do texto
            rotulo1.setBounds(50,20,80,20);

            // Definindo cor do texto
            rotulo1.setForeground(Color.blue);

            //Definindo Fonte
            rotulo1.setFont(new Font("Arial",Font.BOLD,14));

            // Adicionando na tela a msg
            tela.add(rotulo1);

            setSize(400,500);
            setVisible(true);
            setLocationRelativeTo(null);
    }

    // Main
    public static void main(String args[]) {
        JlabelExemplo app = new JlabelExemplo();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}