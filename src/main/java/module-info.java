module com.example.makaotest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.makaotest to javafx.fxml;
    exports com.example.makaotest;
}