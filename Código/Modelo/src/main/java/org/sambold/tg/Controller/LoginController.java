package org.sambold.tg.Controller;

import org.sambold.tg.modeloDAO.AuthDAO;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {

    @FXML private TextField txtEmail;
    @FXML private PasswordField txtSenha;
    @FXML private Label lblErro;

    private final AuthDAO authDAO = new AuthDAO();

    @FXML
    private void onEntrar() {
        String email = txtEmail.getText() == null ? "" : txtEmail.getText().trim();
        String senha = txtSenha.getText() == null ? "" : txtSenha.getText();

        if (email.isEmpty() || senha.isEmpty()) {
            lblErro.setText("Informe email e senha.");
            return;
        }

        AuthDAO.AuthResult res = authDAO.autenticar(email, senha);
        if (!res.isOk()) {
            lblErro.setText("Usuário ou senha inválidos.");
            return;
        }

        try {
            Stage stage = (Stage) txtEmail.getScene().getWindow();
            Scene scene;
            switch (res.getRole()) {
                case ALUNO -> {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/sambold/tg/telacad/home-aluno.fxml"));
                    scene = new Scene(loader.load());
                }
                case PROFESSOR -> {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/sambold/tg/telacad/home-professor.fxml"));
                    scene = new Scene(loader.load());
                }
                default -> throw new IllegalStateException("Perfil inesperado.");
            }
            stage.setScene(scene);
            stage.centerOnScreen();
        } catch (Exception e) {
            e.printStackTrace();
            lblErro.setText("Erro ao carregar a próxima tela.");
        }
    }
}
