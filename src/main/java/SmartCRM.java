import javafx.application.Application;
import javafx.stage.Stage;
import ru.nickoff.control.Controller;

public class SmartCRM extends Application {
    public static void main(String[] args) {
        launch(args);

        // TODO with on SQL base for translators
        // TODO add translators
        // TODO search base
        // TODO for list of mistakes and their values

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Controller controller = new Controller();
        controller.start(primaryStage);

    }
}
