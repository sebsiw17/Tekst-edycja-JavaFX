module com.example.testowanie {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.testowanie to javafx.fxml;
    exports com.example.testowanie;
}