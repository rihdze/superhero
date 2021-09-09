module com.example.superhero {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.superhero to javafx.fxml;
    exports com.example.superhero;
}