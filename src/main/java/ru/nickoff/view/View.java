package ru.nickoff.view;

import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class View {
    private Stage mPrimaryStage;
    private ScrollPane mScrollPane;
    private BorderPane mMainPane;
    private Scene mMainScene;

    public void drawPrimaryStage(Stage primaryStage) {
        mPrimaryStage = primaryStage;
        mPrimaryStage.setTitle("SmartCRM");

        mScrollPane = new ScrollPane();
        mMainPane = new BorderPane();

        mScrollPane.setContent(mMainPane);

        mMainScene = new Scene(mScrollPane, 600, 600);

        mPrimaryStage.setScene(mMainScene);

        mPrimaryStage.show();
    }
}
