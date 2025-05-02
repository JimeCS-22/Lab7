module ucr.lab7 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ucr.lab7 to javafx.fxml;
    exports ucr.lab7;
}