module ucr.lab7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ucr.lab7 to javafx.fxml;
    exports ucr.lab7;
}