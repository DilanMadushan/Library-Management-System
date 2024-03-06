package lk.ijse.bookworm.Controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class branchManageController {

    @FXML
    private JFXComboBox<?> cmbAdmin;

    @FXML
    private TableColumn<?, ?> colAddress;

    @FXML
    private TableColumn<?, ?> colAdmin;

    @FXML
    private TableColumn<?, ?> colLocation;

    @FXML
    private TableColumn<?, ?> colName;

    @FXML
    private TableView<?> tblBook;

    @FXML
    private JFXTextField txtAddress;

    @FXML
    private JFXTextField txtLocation;

    @FXML
    private JFXTextField txtName;

    @FXML
    void addOnAction(ActionEvent event) {

    }

    @FXML
    void deleteOnAction(ActionEvent event) {

    }

    @FXML
    void updateOnAction(ActionEvent event) {

    }

    public void closeOnAction(MouseEvent mouseEvent) throws IOException {
        Parent rootNode = FXMLLoader.load(getClass().getResource("/view/Dashboard.fxml"));
        Scene scene = new Scene(rootNode);
        Stage stage = (Stage) txtLocation.getScene().getWindow();
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }
}
