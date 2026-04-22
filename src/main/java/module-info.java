module org.example.maismoney {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.maismoney to javafx.fxml;
    exports org.example.maismoney;
}