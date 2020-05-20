package ru.nickoff.control;

import javafx.stage.Stage;
import ru.nickoff.model.Model;
import ru.nickoff.view.View;

public class Controller {
    private Model mModel;
    private View mView;

    public Controller() {
        this(new Model(), new View());
    }

    public Controller(Model model, View view) {
        mModel = model;
        mView = view;
    }

    public void start(Stage primaryStage) {
        mView.drawPrimaryStage(primaryStage);
    }
}
