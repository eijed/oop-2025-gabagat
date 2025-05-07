package com.cmi;

/*
 * A scene graph is a tree data structure that arranges (and groups) graphical objects for easier logical representation.
 * It also allows the graphics engine to render the objects in the most efficient way by fully or partially skipping objects 
 * which will not be seen in the final image.
 * 
 * A stage is a JavaFX representation of a native OS window. At any given time a stage can have a single Scene attached to it. 
 * 
 * https://fxdocs.github.io/docs/html5/#_overview
 */

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class App extends Application {
    public static void main(String[] args) {
        launch();
    }

    private Parent initializeComponents() {
        GridPane gp = new GridPane();

        CheckBox cb = new CheckBox("I agree");
        Button submit = new Button("Submit");
        submit.setDisable(true);

        gp.add(cb, 0, 0);
        gp.add(submit, 0, 1);

        cb.setOnAction(e -> submit.setDisable(!cb.isSelected()));

        return gp;
    }

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(initializeComponents(), 400, 200);
        stage.setScene(scene);
        stage.setTitle("Introduction to JavaFX: CheckBox");
        stage.show();
    }
}