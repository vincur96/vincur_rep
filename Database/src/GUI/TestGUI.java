package GUI;

import DB.DBCom;

import javax.swing.*;

public class TestGUI {
    public static void main(String[] args) {
        DBCom dbCom = new DBCom();
        FrameDb fd = new FrameDb(dbCom);

        fd.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fd.setVisible(true);
    }
}
