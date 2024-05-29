module com.example.fibonacciseries {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.fibonacciseries to javafx.fxml;
    exports com.example.fibonacciseries;
}