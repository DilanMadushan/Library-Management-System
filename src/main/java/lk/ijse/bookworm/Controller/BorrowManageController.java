package lk.ijse.bookworm.Controller;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

public class BorrowManageController {

    @FXML
    private DatePicker borrowdDate;

    @FXML
    private JFXComboBox<?> cmbBook;

    @FXML
    private JFXComboBox<?> cmbMember;

    @FXML
    private JFXComboBox<?> cmbStstus;

    @FXML
    private TableColumn<?, ?> colBookId;

    @FXML
    private TableColumn<?, ?> colBorrowdDate;

    @FXML
    private TableColumn<?, ?> colMemberId;

    @FXML
    private TableColumn<?, ?> colReturnDate;

    @FXML
    private TableColumn<?, ?> colStatus;

    @FXML
    private DatePicker returnDate;

    @FXML
    private TableView<?> tblBook;

    @FXML
    private JFXTextField txtBookName;

    @FXML
    private JFXTextField txtName;

    private

    @FXML
    void addOnAction(ActionEvent event) {

    }

    @FXML
    void borrowOnAction(ActionEvent event) {

    }

    @FXML
    void closeOnAction(MouseEvent event) {

    }

    @FXML
    void returnOnAction(ActionEvent event) {

    }

}
