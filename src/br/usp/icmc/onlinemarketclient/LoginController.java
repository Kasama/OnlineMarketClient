package br.usp.icmc.onlinemarketclient;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


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

    private PrintWriter out;

    @FXML
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

        logIn(s);
    }

    public void logIn(Socket s) {
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
        switchToOnlineMarket(s);
    }

    private void switchToOnlineMarket(Socket s) {
        FXMLLoader loader = new FXMLLoader((getClass().getResource("SignUp.fxml")));

        Parent rt = null;
        try {
            rt = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        OnlineMarketController controller = loader.getController();
        controller.setSocket(s);

        Scene signUpScene = new Scene(rt);
        Stage st = (Stage) signUp.getScene().getWindow();
        st.setScene(signUpScene);
        st.show();
    }


    @FXML
    public void signUp(ActionEvent event) {



        //abre dialog pra SignUp

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append("newuser");
        sb.append("|");
        //sb.append("");
        //...
    }
}
