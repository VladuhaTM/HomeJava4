module org.example.home4new {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.home4new to javafx.fxml;
    exports org.example.home4new;
}