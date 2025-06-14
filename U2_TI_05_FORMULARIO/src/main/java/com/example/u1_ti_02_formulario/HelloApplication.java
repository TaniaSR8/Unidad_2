package com.example.u1_ti_02_formulario;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Label lblNombre = new Label("Nombre:");
        TextField tfNombre = new TextField();
        Label lblApellido = new Label("Apellido:");
        TextField tfApellido = new TextField();
        Label lblEdad = new Label("Edad:");
        TextField tfEdad = new TextField();
        Label lblRol = new Label("Rol:");
        ObservableList<String> rol = FXCollections.observableArrayList("Alumno", "Maestro", "Admin");
        ComboBox<String> cbRol = new ComboBox<>(rol);
        Button btnEnviar = new Button("Crear");
        Button btnReset = new Button("Reset");
        Label lblResultado = new Label("");
        GridPane root = new GridPane();
        
        btnEnviar.setOnAction(e -> {
            String nombre = tfNombre.getText();
            String apellido = tfApellido.getText();
            String edad = tfEdad.getText();
            String rolSeleccionado = cbRol.getSelectionModel().getSelectedItem();
            if (nombre.isEmpty() || apellido.isEmpty() || edad.isEmpty() || rolSeleccionado == null || rolSeleccionado.isEmpty()) {
                lblResultado.setText("Debes de rellenar todos los campos");
            } else {
                root.setStyle("-fx-background-color: green;");
                lblResultado.setStyle("-fx-background-color: lightblue; -fx-padding: 10px;");
                lblResultado.setText("Nombre: " + nombre + " Apellido: " + apellido + " Edad: " + edad + " Rol: " + rolSeleccionado);
            }
        });
        btnReset.setOnAction(e -> {
            tfNombre.clear();
            tfApellido.clear();
            tfEdad.clear();
            cbRol.setValue(null);
            root.setStyle("");
            lblResultado.setText("");
            lblResultado.setStyle("");
        });
        root.setAlignment(Pos.CENTER);
        root.setHgap(10);
        root.setVgap(10);

        root.add(lblNombre, 0, 0);
        root.add(tfNombre, 1, 0);
        root.add(lblApellido, 0, 1);
        root.add(tfApellido, 1, 1);
        root.add(lblEdad, 0, 2);
        root.add(tfEdad, 1, 2);
        root.add(lblRol, 0, 3);
        root.add(cbRol, 1, 3);
        root.add(btnEnviar, 0, 4);
        root.add(btnReset, 1, 4);
        root.add(lblResultado, 0, 5, 2, 1);
        Scene scene = new Scene(root, 600, 540);
        stage.setTitle("Formulario");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}