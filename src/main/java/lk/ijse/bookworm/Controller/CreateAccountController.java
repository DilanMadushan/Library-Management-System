package lk.ijse.bookworm.Controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import lk.ijse.bookworm.Dao.AdminDao;
import lk.ijse.bookworm.Dto.AdminDto;

public class CreateAccountController {

    @FXML
    private JFXTextField txtName;

    @FXML
    private JFXTextField txtPassword;

    private AdminDao adminDao = new AdminDao();

    @FXML
    void loginOnAction(ActionEvent event) {
        String name = txtName.getText();
        String password = txtPassword.getText();

        System.out.println(name);

        adminDao.save(new AdminDto(name,password));

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
