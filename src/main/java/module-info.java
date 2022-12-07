module com.nainisimran.test {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.nainisimran.test to javafx.fxml;
    exports com.nainisimran.test;
}