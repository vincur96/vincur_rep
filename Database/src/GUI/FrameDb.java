package GUI;

import DB.DBCom;
import javax.swing.*;
import java.awt.*;

public class FrameDb extends JFrame {
    DBCom dbCom;
    JButton buttonEsegui = new JButton("Esegui query");
    JTextArea areaQuery = new JTextArea();
    JScrollPane scrollQuery = new JScrollPane(areaQuery);
    JTextField textInserisci = new JTextField("Inserisci qui la query:");

    public FrameDb (DBCom dbCom) {
        this.dbCom = dbCom;
        setTitle("GUI Db");
        setResizable(false);
        setSize(500, 500);
        setLocationRelativeTo(null);

        areaQuery.setSize(200,200);
        areaQuery.setEditable(false);
        textInserisci.setEditable(false);

        JPanel panel1 = new JPanel(new GridLayout(1,1));
        panel1.add(scrollQuery);

        JPanel panel2 = new JPanel(new GridLayout(2, 1, 10,10));
        panel2.add(textInserisci);
        panel2.add(buttonEsegui);

        Container cont = getContentPane();
        cont.add(panel1, BorderLayout.CENTER);
        cont.add(panel2, BorderLayout.SOUTH);

        buttonEsegui.addActionListener(e -> {
            areaQuery.append(dbCom.start());
        });
    }
}
