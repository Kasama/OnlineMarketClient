package br.usp.icmc.onlinemarketclient;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

import javax.swing.text.TableView;
import java.net.Socket;
import java.util.Observable;


public class OnlineMarketController {

    @FXML
    private TextField search;
    @FXML
    private Button addProductButton;
    @FXML
    private Button refreshButton;
    @FXML
    private Button subscribeButton;
    @FXML
    private Button buyButton;
    @FXML
    private TableColumn<ObservableProduct, String> tableProductId;
    @FXML
    private TableColumn<ObservableProduct, String> tableProductName;
    @FXML
    private TableColumn<ObservableProduct, String> tableProductPrice;
    @FXML
    private TableColumn<ObservableProduct, String> tableProductBestBefore;
    @FXML
    private TableColumn<ObservableProduct, String> tableProductAmount;
    @FXML
    private TableView table; //ele reclamou de TableView<ObservableProduct>....????

    private Socket socket;

    public void setSocket(Socket s) {
        this.socket = s;
    }

    @FXML
    public void addProductButtonOnAction(ActionEvent event) {
        //TODO
    }

    @FXML
    public void refreshButtonOnAction(ActionEvent event){
        //TODO
    }

    @FXML
    public void subButtonOnAction(ActionEvent event) {
        //TODO
    }

    @FXML
    public void buyButtonOnAction(ActionEvent event) {
        //TODO
    }
}
