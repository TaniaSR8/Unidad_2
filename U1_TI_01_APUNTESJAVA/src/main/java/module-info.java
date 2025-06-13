module mx.edu.utez.u1_ti_01_apuntesjava {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens mx.edu.utez.u1_ti_01_apuntesjava to javafx.fxml;
    exports mx.edu.utez.u1_ti_01_apuntesjava;
}