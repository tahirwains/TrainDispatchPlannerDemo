package com.demo.train;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Train Dispatch Planner");

        String message;

        try {
            // H2 TCP connection (to Docker container)
            String jdbcUrl = "jdbc:h2:tcp://localhost:1521/test";
            String user = "sa";
            String password = "";

            Connection conn = DriverManager.getConnection(jdbcUrl, user, password);
            message = "✅ Connected to H2 DB via Docker!";
            conn.close();

        } catch (SQLException e) {
            message = "❌ DB Connection Failed: " + e.getMessage();
        }

        JLabel label = new JLabel(message, SwingConstants.CENTER);
        frame.add(label);
        frame.setSize(450, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
