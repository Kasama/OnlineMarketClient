package br.usp.icmc.onlinemarketclient;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;


public class LoginController {
    @FXML
    private TextField username;
    @FXML
    private TextField password;
    @FXML
    private TextField port;
    @FXML
    private TextField ip;
    @FXML
    private Button logIn;
    @FXML
    private Button signUp;

    PrintWriter out;

    public void createConnetction() {
        Socket s = null;
        try {
            s = new Socket(ip.getText(), Integer.parseInt(port.getText()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            out = new PrintWriter(s.getOutputStream());
        }catch (IOException e) {
            e.printStackTrace();
        }

        logIn();
    }

    public void logIn() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append("login");
        sb.append("|");
        sb.append(username.getText());
        sb.append("|");
        sb.append(password.getText());
        sb.append(">");

        PrintWriter p = new PrintWriter(out, true);
        p.write(sb.toString());
    }

    public void signUp() {

        //abre tela pra SignUp

        //-==============-
        //StringBuilder sb = new StringBuilder();
        //sb.append("<");
        //sb.append("newuser");
        //sb.append("|");
        //sb.append("");
    }
}
