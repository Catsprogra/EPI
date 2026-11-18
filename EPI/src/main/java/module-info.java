module com.mycompany.epi {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.epi to javafx.fxml;
    exports com.mycompany.epi;
}
