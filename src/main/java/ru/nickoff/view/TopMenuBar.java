package ru.nickoff.view;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class TopMenuBar extends MenuBar {
    private MenuItem exitItem;

    public TopMenuBar() {
        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");

        MenuItem newItem = new MenuItem("New");
        MenuItem openItem = new MenuItem("Open");
        exitItem = new MenuItem("Exit");

        fileMenu.getItems().addAll(newItem, openItem, exitItem);

        this.getMenus().addAll(fileMenu, editMenu);
    }

    public MenuItem getExitItem() {
        return exitItem;
    }
}
