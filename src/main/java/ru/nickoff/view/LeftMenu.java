package ru.nickoff.view;

import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;

public class LeftMenu extends StackPane {
    private TreeView<String>mTreeView;

    public LeftMenu() {
        TreeItem<String> rootItem = new TreeItem<>("Модули");

        rootItem.setExpanded(true);

        TreeItem<String> clientsItem = new TreeItem<>("Клиенты");
        TreeItem<String> translatorsItem = new TreeItem<>("Переводчики");
        TreeItem<String> projectsItem = new TreeItem<>("Проекты");

        rootItem.getChildren().addAll(clientsItem, translatorsItem, projectsItem);

        mTreeView = new TreeView<>(rootItem);
        this.getChildren().add(mTreeView);
    }

    public TreeView<String> getmTreeView() {
        return mTreeView;
    }
}
