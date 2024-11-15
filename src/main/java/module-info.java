module com.example.fridaygui {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.fridaygui to javafx.fxml;
    exports com.example.fridaygui;
}