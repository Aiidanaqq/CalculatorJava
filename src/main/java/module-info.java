module org.example.javafxcalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.javafxcalculator to javafx.fxml;
    exports org.example.javafxcalculator;
}