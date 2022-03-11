module com.example.lab17pr3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab17pr3 to javafx.fxml;
    exports com.example.lab17pr3;
}