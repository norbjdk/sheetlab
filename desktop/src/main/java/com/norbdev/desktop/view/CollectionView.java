package com.norbdev.desktop.view;

import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

import java.util.Objects;

public class CollectionView extends ScrollPane {
    private final VBox contentPane = new VBox();

    public CollectionView() {
        getStylesheets().add(Objects.requireNonNull(getClass().getResource("/com/norbdev/desktop/style/home.css")).toExternalForm());
        this.setContent(contentPane);
        this.composeElements();
    }

    private void composeElements() {
        Label header = new Label("Your compositions");
        header.getStyleClass().add("collection-header");
        contentPane.getChildren().add(header);
    }
}
