module com.example.viewmedia {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.viewmedia to javafx.fxml;
    exports com.example.viewmedia;
}