package com.norbdev.desktop.component;

import javafx.scene.layout.GridPane;

import java.util.Objects;

public class SideBar extends GridPane {
    private final ProfileBar profileBar = new ProfileBar();

    public SideBar() {
        getStylesheets().add(Objects.requireNonNull(getClass().getResource("/com/norbdev/desktop/style/home.css")).toExternalForm());
        getStyleClass().add("side-bar");
        add(profileBar, 0, 0);
    }
}
