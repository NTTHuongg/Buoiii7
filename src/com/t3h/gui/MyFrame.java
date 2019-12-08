package com.t3h.gui;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyFrame extends JFrame implements WindowListener {
    public static final int W_FRAME = 800;
    public static final int H_FRAME = 600;
    private MyPanel panel = new MyPanel();

    public MyFrame() {
        setTitle("Buoi 7");
        setSize(W_FRAME, H_FRAME);
//        setLocation(100,100); // vi tri xuat hien
        setLocationRelativeTo(null); // xuat hien giua man hinh
        setResizable(false); // ko the thay doi kich thuoc
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(this);

        add(panel);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("windowOpened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("windowClosing");
        int resual = JOptionPane.showConfirmDialog(null,
                "Do you want to exit",
                "Close",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (resual == JOptionPane.OK_OPTION) {
            System.exit(0);
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("windowActivated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("windowDeactivated");
    }
}
