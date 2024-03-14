package lk.ijse.bookworm.Controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import lk.ijse.bookworm.Bo.AdminBoImpl;
import lk.ijse.bookworm.Config.FactoryConfiguration;
import lk.ijse.bookworm.Dao.AdminDaoImpl;
import lk.ijse.bookworm.Dto.AdminDto;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CreateAccountController {

    public Text txtId;
    @FXML
    private JFXTextField txtName;

    @FXML
    private JFXTextField txtPassword;

    private AdminBoImpl adminBo = new AdminBoImpl();

    public void initialize(){

        genarateNextAdminId();
    }

    private void genarateNextAdminId() {
        String id = adminBo.genarateNextAdminId();
        txtId.setText(id);
    }

    @FXML
    void loginOnAction(ActionEvent event) {
        String name = txtName.getText();
        String password = txtPassword.getText();
        String id = txtId.getText();

        System.out.println(name);

        if(name.equals("") && password.equals("")){
            new Alert(Alert.AlertType.ERROR,"fields are empty").show();
        }

        boolean isSaved = adminBo.saveCustomer(new AdminDto(id,name,password));

        if (isSaved) {
            new Alert(Alert.AlertType.CONFIRMATION,"Saved successfully").show();
            initialize();
        }else{
            new Alert(Alert.AlertType.ERROR,"Saved failed").show();
        }

    }

    @FXML
    void nameOnAction(ActionEvent event) {
        txtPassword.requestFocus();

    }

    @FXML
    void passwordOnAction(ActionEvent event) {
        loginOnAction(event);
    }

    public void closeOnAction(MouseEvent mouseEvent) {
        Stage stage = (Stage) txtName.getScene().getWindow();
        stage.close();
    }
}
