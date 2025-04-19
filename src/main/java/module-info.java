module java{
    requires javafx.controls;
    requires javafx.fxml;


    opens task1and2 to javafx.fxml;
    exports task1and2;
    opens task3 to javafx.fxml;
    exports task3;
    opens task4 to javafx.fxml;
    exports task4;
}