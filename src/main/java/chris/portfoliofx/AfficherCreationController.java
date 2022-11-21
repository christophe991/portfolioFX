package chris.portfoliofx;

import chris.portfoliofx.metier.Creation;
import chris.portfoliofx.service.ServiceCreation;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Cell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class AfficherCreationController {
    @FXML
    private TableView<Creation> creationTable;
    @FXML
    private TableColumn<Creation, String> nomColumn;
    @FXML
    private TableColumn<Creation, String> descriptionColumn;
    @FXML
    private Button retourButton;
    private Stage stage;

    @FXML
    private void initialize(){
        ServiceCreation serviceCreation = new ServiceCreation();
        creationTable.setItems(FXCollections.observableArrayList(serviceCreation.getLabelCreationFiltre()));
        nomColumn.setCellValueFactory(CellData->CellData.getValue().nomProperty());
        descriptionColumn.setCellValueFactory(CellData-> CellData.getValue().descriptionProperty());
    }

    @FXML
    private void fermerMenu(){
        stage = (Stage) retourButton.getScene().getWindow();
        stage.close();
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
}
