package com.norbdev.desktop.view;

import com.norbdev.desktop.model.ViewModel;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import org.kordamp.ikonli.fontawesome5.FontAwesomeSolid;
import org.kordamp.ikonli.javafx.FontIcon;

import java.util.Objects;

public class NewProjectView extends FlowPane implements ViewModel {

    private final GridPane dataForm = new GridPane();
    private final GridPane propertiesForm = new GridPane();
    private final GridPane instrumentsForm = new GridPane();

    public NewProjectView() {
        getStylesheets().add(Objects.requireNonNull(getClass().getResource("/com/norbdev/desktop/style/home.css")).toExternalForm());
        getStyleClass().add("new-project-view");

        addDataForm();
        addPropertiesForm();
        addInstrumentsForm();

        Button createProjectBtn = new Button("Create");
        createProjectBtn.setId("create-btn");
        FontIcon createBtnIcon = new FontIcon(FontAwesomeSolid.CHECK_CIRCLE);
        createBtnIcon.setIconSize(16);
        createProjectBtn.setGraphic(createBtnIcon);
        createProjectBtn.setContentDisplay(ContentDisplay.LEFT);
        createProjectBtn.setGraphicTextGap(5);
        getChildren().add(createProjectBtn);
    }

    private void addInstrumentsForm() {
        instrumentsForm.getStyleClass().add("instruments-form");

        Node[] boxes = {
             new VBox(10, new Label("Pick instruments: "), new FlowPane()),
             new Accordion(
                     new TitledPane("Strings", new FlowPane())
                ),
                new Accordion(
                        new TitledPane("Brass", new FlowPane())
                ),
                new Accordion(
                        new TitledPane("Percussion", new FlowPane())
                ),
                new Accordion(
                        new TitledPane("Keys", new FlowPane())
                )
        };

        for (int i = 0; i < boxes.length; i++) {
            instrumentsForm.add(boxes[i], 0, i);
        }

        getChildren().add(instrumentsForm);
    }

    private void addPropertiesForm() {
        propertiesForm.getStyleClass().add(("props-form"));

        HBox[] boxes = {
            new HBox(10, new Label("Key: "), new ComboBox<String>()),
            new HBox(10, new Label("Metre: "), new ComboBox<String>()),
            new HBox(10, new Label("Tempo: "), new ComboBox<String>()),
        };

        for (HBox hBox: boxes) {
            hBox.getChildren().getFirst().getStyleClass().add("data-label");
        }

        for (int i = 0; i < boxes.length; i++) {
            propertiesForm.add(boxes[i], 0, i);
        }

        getChildren().add(propertiesForm);
    }

    private void addDataForm() {
        dataForm.getStyleClass().add("data-form");

        VBox [] boxes = {
            new VBox(10, new Label("Title: "), new TextField()),
            new VBox(10, new Label("Subtitle: "), new TextField()),
            new VBox(10, new Label("Composer: "), new TextField()),
            new VBox(10, new Label("Words Author: "), new TextField())
        };

        for (VBox vBox : boxes) {
            vBox.getChildren().getFirst().getStyleClass().add("data-label");
            vBox.getChildren().getLast().getStyleClass().add("data-input");
        }

        for (int i = 0; i < boxes.length; i++) {
            dataForm.add(boxes[i], 0, i);
        }
        getChildren().add(dataForm);
    }
}
