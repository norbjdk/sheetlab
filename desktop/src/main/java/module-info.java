module com.norbdev.desktop {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.norbdev.desktop to javafx.fxml;
    exports com.norbdev.desktop;
    opens com.norbdev.desktop.controller to javafx.fxml;
    exports com.norbdev.desktop.controller;
}