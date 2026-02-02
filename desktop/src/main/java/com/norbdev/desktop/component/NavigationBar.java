package com.norbdev.desktop.component;

import com.norbdev.desktop.event.EventBus;
import com.norbdev.desktop.event.OpenProjectEvent;
import com.norbdev.desktop.event.ViewChangeEvent;
import javafx.geometry.HPos;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import org.kordamp.ikonli.fontawesome5.FontAwesomeSolid;
import org.kordamp.ikonli.javafx.FontIcon;

import java.util.Objects;

public class NavigationBar extends GridPane {
    private final Button homeBtn = new Button("Home");
    private final Button createBtn = new Button("Create Project");
    private final Button openBtn = new Button("Open Project");
    private final Button collectionBtn = new Button("Collection");
    private final Button learnBtn = new Button("Learn");

    private final String[] buttonIds = {"home", "create-project", "collection", "plugins", "tutorial"};
    private final Button[] buttons = {homeBtn, createBtn, openBtn, collectionBtn, learnBtn};

    public NavigationBar(){
        getStylesheets().add(Objects.requireNonNull(getClass().getResource("/com/norbdev/desktop/style/home.css")).toExternalForm());
        getStyleClass().add("navigation-bar");

        addElements();
        addIcons();
        applyEvents();
    }

    private void applyEvents() {
        homeBtn.setOnAction(event -> {
            EventBus.getInstance().publish(new ViewChangeEvent("home"));
        });
        createBtn.setOnAction(event -> {
            EventBus.getInstance().publish(new ViewChangeEvent("new_project"));
        });
        openBtn.setOnAction(event -> {
            EventBus.getInstance().publish(new OpenProjectEvent());
        });
    }

    private void addElements() {
        ColumnConstraints[] constraints = new ColumnConstraints[6];

        for (int i = 0; i < constraints.length; i++) {
            constraints[i] = new ColumnConstraints();
            constraints[i].setHalignment(HPos.CENTER);
            constraints[i].setFillWidth(true);
        }

        constraints[0].setPercentWidth(10);
        constraints[1].setPercentWidth(10);
        constraints[2].setPercentWidth(10);
        constraints[3].setPercentWidth(50);
        constraints[4].setPercentWidth(10);
        constraints[5].setPercentWidth(10);

        HBox spacer = new HBox();

        add(homeBtn, 0, 0);
        add(createBtn, 1, 0);
        add(openBtn, 2, 0);
        add(spacer, 3, 0);
        add(collectionBtn, 4, 0);
        add(learnBtn, 5, 0);

        getColumnConstraints().addAll(constraints);
    }

    private void addIcons() {
        FontIcon [] iconPack = {
                new FontIcon(FontAwesomeSolid.HOME),
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
