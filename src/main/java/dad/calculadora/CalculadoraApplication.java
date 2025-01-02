package dad.calculadora;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class CalculadoraApplication extends Application {

    private final CalculadoraController calculadoraController = new CalculadoraController();
    private final Image icon = new Image(String.valueOf(getClass().getResource("/images/calculator-32x32.png")));

    @Override
    public void start(Stage stage) throws Exception {
        Scene scene = new Scene(calculadoraController.getRoot());

        stage.getIcons().setAll(icon);
        stage.setScene(scene);
        stage.setTitle("Calculadora");
        stage.show();
    }
}
