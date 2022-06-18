package calcMain;

/**
 * 2ECOM.008 - LABORATÓRIO DE PROGRAMAÇÃO DE COMPUTADORES II - T05 (2021.1 - 5T12) - CEFET-MG.
 *
 * @author Lucas Siqueira Ribeiro. https://github.com/lucasdot
 * @author Pedro costa calazans. https://github.com/pedrocostacalazans
 * @author Pablo Vasconcelos da Cruz. https://github.com/Pablo321123
 * @version 1.0
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.image.Image;

public class JanelaPrincipal extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("InterfacePrincipal.fxml"));
        Scene scene = new Scene(loader.load());
        scene.setFill(Color.TRANSPARENT);
        primaryStage.setScene(scene);
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.setResizable(false);
        primaryStage.setTitle("Calculadora - Lucas e Pedro");
        primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/imagens/icone.png")));
        ((JanelaPrincipalController)loader.getController()).init(primaryStage);
        primaryStage.show();
    }
    
    public void run() {
        launch();
    }
}
