package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class TelaPrincipalController {

    @FXML
    private Button botao;

    @FXML
    private Label campo;

    @FXML
    void executar(ActionEvent event) {
    	System.out.println(campo.getText());
    }

}
