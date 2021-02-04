import javafx.application.Application;
import javafx.stage.Stage;

import model.Parser;
import view.MangcaluaView;
import controller.MangcaluaController;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        Parser parser = new Parser();
        MangcaluaView view = new MangcaluaView(stage);
        MangcaluaController controller = new MangcaluaController(parser, view);
        view.setController(controller);
    }

    public static void main (String[] args) {
        launch();
    }
}