package application.controller;

import application.model.Contato;
import application.service.ContatoService;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class FormularioController {

    @FXML private TextField nomeField;
    @FXML private TextField sobrenomeField;
    @FXML private TextField emailField;
    @FXML private TextField telefoneField;
    @FXML private ComboBox<String> assuntoCombo;
    @FXML private TextArea mensagemArea;

    @FXML
    private void enviarFormulario() {
        Contato contato = new Contato(
                nomeField.getText(),
                sobrenomeField.getText(),
                emailField.getText(),
                telefoneField.getText(),
                assuntoCombo.getValue(),
                mensagemArea.getText()
        );

        if (ContatoService.validarContato(contato)) {
            ContatoService.salvarContato(contato);
            mostrarAlerta(Alert.AlertType.INFORMATION, "Sucesso", "Formulário enviado com sucesso!");
            limparCampos();
        } else {
            mostrarAlerta(Alert.AlertType.ERROR, "Erro", "Por favor, preencha todos os campos corretamente.");
        }
    }

    private void mostrarAlerta(Alert.AlertType tipo, String titulo, String mensagem) {
        Alert alert = new Alert(tipo);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensagem);
        alert.showAndWait();
    }

    private void limparCampos() {
        nomeField.clear();
        sobrenomeField.clear();
        emailField.clear();
        telefoneField.clear();
        assuntoCombo.getSelectionModel().clearSelection();
        mensagemArea.clear();
    }
}
