module com.example.u1_ti_02_formulario {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.example.u1_ti_02_formulario to javafx.fxml;
    exports com.example.u1_ti_02_formulario;
}