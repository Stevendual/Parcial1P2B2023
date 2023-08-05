module com.example.parcial1p2b2023 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.parcial1p2b2023 to javafx.fxml;
    exports com.example.parcial1p2b2023;
}