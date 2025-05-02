package controller;


import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;


public class weatherController {

    //Lugar
    @javafx.fxml.FXML
    private TextField PlaceTextfield;

    //Clima
    @javafx.fxml.FXML
    private ComboBox weatherBox;

    //Columnas
    //1 para queue
    @javafx.fxml.FXML
    private TableColumn placeColum1;
    @javafx.fxml.FXML
    private TableColumn weatherColum1;
    //2 para stack
    @javafx.fxml.FXML
    private TableColumn placeColum2;
    @javafx.fxml.FXML
    private TableColumn weatherColum2;

    //Botones
    @javafx.fxml.FXML
    private Button btAuto;
    @javafx.fxml.FXML
    private Button enQueue;
    @javafx.fxml.FXML
    private Button clean;

    //Tables
    @javafx.fxml.FXML
    private TableView queueTable;
    @javafx.fxml.FXML
    private TableView stackTable;

    //No codificar
    @javafx.fxml.FXML
    private Pane buttonPane;
    @javafx.fxml.FXML
    private AnchorPane AP;
    @javafx.fxml.FXML
    private Text txtMessage;
    @javafx.fxml.FXML
    private Pane mainPain;


    @javafx.fxml.FXML
    public void initialize() {

        weatherBox.setItems(FXCollections.observableArrayList("rainy", "thunderstorm", "sunny", "cloudy", "foggy"));
    }

    @javafx.fxml.FXML
    public void enQueueOnAction(ActionEvent actionEvent) {

        placeColum1.setText(PlaceTextfield.getText());
        weatherColum1.setText(weatherBox.getAccessibleText());

    }

    @javafx.fxml.FXML
    public void toOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void autoOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void cleanOnAction(ActionEvent actionEvent) {

        PlaceTextfield.clear();
        weatherBox.setValue(null);

    }
}