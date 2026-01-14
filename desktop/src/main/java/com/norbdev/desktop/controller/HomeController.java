package com.norbdev.desktop.controller;

import com.norbdev.desktop.component.NavigationBar;
import com.norbdev.desktop.component.SideBar;
import com.norbdev.desktop.view.IntroView;
import com.norbdev.desktop.view.NewProjectView;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;

import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {
    private final BorderPane layoutContainer = new BorderPane();
    private final SideBar sideBar = new SideBar();
    private final NavigationBar navigationBar = new NavigationBar();

    /**
     * Views
     */

    private final IntroView introView = new IntroView();
    private final NewProjectView newProjectView = new NewProjectView();

    @FXML private BorderPane root;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        layoutView();
    }

    private void layoutView() {
        root.setRight(sideBar);
        root.setCenter(layoutContainer);

        layoutContainer.setTop(navigationBar);
        layoutContainer.setCenter(newProjectView);
    }
}
