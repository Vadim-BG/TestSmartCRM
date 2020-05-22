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

        //Adding TopMenu

        mView.drawTopMenu();
        setTopMenuControl();

        //Adding left menu
        mView.drawLeftMenu();
        setLeftMenuControl();

        mView.getmPrimaryStage().setOnCloseRequest(e -> {
            e.consume();
            exitFromProgram();
        });
    }

    private void setLeftMenuControl() {
        mView.getmLeftMenu().getmTreeView().getSelectionModel().selectedIndexProperty().addListener(
                (observable, oldValue, newValue) -> {

                    System.out.println(mView.getmLeftMenu().getmTreeView().getTreeItem(newValue.intValue()).getValue());
                }
        );
    }

    private void setTopMenuControl() {
        mView.getmTopMenuBar().getExitItem().setOnAction(e -> exitFromProgram());
    }

    public void exitFromProgram(){
        System.out.println("Closing program!");
        mView.getmPrimaryStage().close();
    }
}
