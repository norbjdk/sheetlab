package com.norbdev.desktop.view;

import com.norbdev.desktop.model.ViewModel;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

public class HomeView extends ScrollPane implements ViewModel {
    private final VBox contentContainer = new VBox();
    private final Label header = new Label("Welcome to *Music Notation Software*");

    public HomeView() {
        setContent(contentContainer);
        setFitToWidth(true);
        setFitToHeight(true);
        setPannable(true);

        addElements();
    }

    private void addElements() {
        contentContainer.getChildren().add(header);
    }
}
