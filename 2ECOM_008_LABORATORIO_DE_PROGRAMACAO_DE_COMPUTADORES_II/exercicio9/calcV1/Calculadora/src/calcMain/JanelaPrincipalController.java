package calcMain;

/**
 * 2ECOM.008 - LABORATÓRIO DE PROGRAMAÇÃO DE COMPUTADORES II - T05 (2021.1 - 5T12) - CEFET-MG.
 *
 * @author Lucas Siqueira Ribeiro. https://github.com/lucasdot
 * @author Pedro costa calazans. https://github.com/pedrocostacalazans
 * @author Pablo Vasconcelos da Cruz. https://github.com/Pablo321123
 * @version 1.0
 * Matriculas: 20203018919, 20203018697, 20203018801.
 */

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class JanelaPrincipalController {

    @FXML
    private Pane tituloPane;

    @FXML
    private ImageView botaoMinimizar;

    @FXML
    private ImageView botaoFechar;

    @FXML
    private Label visorResultado;

    private double x, y;
    private double num1 = 0;
    private String operator = "+";

    public void init(Stage primaryStage) {
        tituloPane.setOnMousePressed(mouseEvent -> {
            x = mouseEvent.getSceneX();
            y = mouseEvent.getSceneY();
        });
        tituloPane.setOnMouseDragged(mouseEvent -> {
            primaryStage.setX(mouseEvent.getScreenX()-x);
            primaryStage.setY(mouseEvent.getScreenY()-y);
        });

        botaoFechar.setOnMouseClicked(mouseEvent -> primaryStage.close());
        botaoMinimizar.setOnMouseClicked(mouseEvent -> primaryStage.setIconified(true));
        
    }

    @FXML
    void onNumberClicked(MouseEvent event) {
        String value = ((Pane)event.getSource()).getId().replace("btn","");
        if (value.equals("Ponto")) {
            visorResultado.setText(String.valueOf(Integer.parseInt(visorResultado.getText())+"."));
        } else {
            visorResultado.setText(Double.parseDouble(visorResultado.getText())==0?String.valueOf(Integer.parseInt(value)):String.valueOf((visorResultado.getText())+(value)));
        }

    }


    @FXML
    void onSymbolClicked(MouseEvent event) {
        String symbol = ((Pane)event.getSource()).getId().replace("btn","");
        if(symbol.equals("Igual")) {
            double num2 = Double.parseDouble(visorResultado.getText());
            switch (operator) {
                case "+" -> visorResultado.setText((num1+num2) + "");
                case "-" -> visorResultado.setText((num1-num2) + "");
                case "*" -> visorResultado.setText((num1*num2) + "");
                case "/" -> visorResultado.setText((num1/num2) + "");
            }
            operator = ".";
        }
        else if(symbol.equals("LimparTudo")) {
            visorResultado.setText(String.valueOf(0.0));
            operator = ".";
        } else if (symbol.equals("Limpar") && visorResultado.getText().length() != 1) {
                visorResultado.setText(visorResultado.getText().substring(0, visorResultado.getText().length() - 1));
                operator = ".";
        } else if (symbol.equals("Quadrado")) {
            visorResultado.setText(String.valueOf(Double.parseDouble(visorResultado.getText()) * Double.parseDouble(visorResultado.getText())));
        } else if (symbol.equals("Cubo")) {
            visorResultado.setText(String.valueOf(Double.parseDouble(visorResultado.getText()) * Double.parseDouble(visorResultado.getText()) * Double.parseDouble(visorResultado.getText())));
        }
        else {
            switch (symbol) {
                case "Soma" -> operator = "+";
                case "Subtracao" -> operator = "-";
                case "Multiplicacao" -> operator = "*";
                case "Divisao" -> operator = "/";
            }
            num1 = Double.parseDouble(visorResultado.getText());
            visorResultado.setText(String.valueOf(0.0));
        }
    }

}