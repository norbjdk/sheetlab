package com.norbdev.desktop.component;

import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.layout.GridPane;
import org.kordamp.ikonli.fontawesome5.FontAwesomeSolid;
import org.kordamp.ikonli.javafx.FontIcon;

import java.util.Objects;

public class NavigationBar extends GridPane {
    private final Button createBtn = new Button("Create Project");
    private final Button openBtn = new Button("Open Project");
    private final Button collectionBtn = new Button("Collection");
    private final Button learnBtn = new Button("Learn");

    private final String[] buttonIds = {"create-project", "collection", "plugins", "tutorial"};
    private final Button[] buttons = {createBtn, openBtn, collectionBtn, learnBtn};

    public NavigationBar(){
        getStylesheets().add(Objects.requireNonNull(getClass().getResource("/com/norbdev/desktop/style/home.css")).toExternalForm());
        getStyleClass().add("navigation-bar");


        addElements();
        addIcons();
    }

    private void addElements() {
        add(createBtn, 0, 0);
        add(openBtn, 1, 0);
        add(collectionBtn, 2, 0);
        add(learnBtn, 3, 0);
    }

    private void addIcons() {
        FontIcon [] iconPack = {
                new FontIcon(FontAwesomeSolid.PLUS_CIRCLE),
                new FontIcon(FontAwesomeSolid.FOLDER_OPEN),
                new FontIcon(FontAwesomeSolid.ADDRESS_BOOK),
                new FontIcon(FontAwesomeSolid.GRADUATION_CAP)
        };

        for (int i = 0; i < buttons.length; i++) {
            iconPack[i].setIconSize(16);
            buttons[i].setGraphic(iconPack[i]);
            buttons[i].setContentDisplay(ContentDisplay.LEFT);
            buttons[i].setGraphicTextGap(10);
            buttons[i].getStyleClass().add("nav-button");
        }

    }
}
