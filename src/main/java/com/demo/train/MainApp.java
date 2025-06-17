package com.demo.train;

import javax.swing.*;

public class MainApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Train Dispatch Planner");
        JLabel label = new JLabel("Welcome to the Planner", SwingConstants.CENTER);
        frame.add(label);
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}