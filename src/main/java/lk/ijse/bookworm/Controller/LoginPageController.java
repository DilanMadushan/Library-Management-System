package lk.ijse.bookworm.Controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import lk.ijse.bookworm.Dao.AdminDao;
import lk.ijse.bookworm.Dto.AdminDto;
import lk.ijse.bookworm.Entity.Admin;

import java.io.IOException;

public class LoginPageController {

    public AnchorPane AnchorPane;
    @FXML
    private JFXTextField txtName;

    @FXML
    private JFXTextField txtPassword;

    AdminDao adminDao = new AdminDao();

    @FXML
    void createOnAction(ActionEvent event) throws IOException {
        Parent rootNode = FXMLLoader.load(getClass().getResource("/view/createAccount.fxml"));
        Scene scene = new Scene(rootNode);
        Stage stage = new Stage();
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    void loginOnAction(ActionEvent event) throws IOException {

        String name = txtName.getText();
        String password = txtPassword.getText();

        Admin admin = adminDao.get(new AdminDto(name,password));

        Parent rootNode = FXMLLoader.load(getClass().getResource("/view/Dashboard.fxml"));
        Scene scene = new Scene(rootNode);
        Stage stage = (Stage) AnchorPane.getScene().getWindow();
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    void nameOnAction(ActionEvent event) {
        txtPassword.requestFocus();
    }

    @FXML
    void passwordOnAction(ActionEvent event) {

    }

    public void closeOnAction(MouseEvent mouseEvent) {
        Stage stage = (Stage) txtName.getScene().getWindow();
        stage.close();
    }
}
