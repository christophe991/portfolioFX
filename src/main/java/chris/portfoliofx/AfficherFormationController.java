package chris.portfoliofx;

import chris.portfoliofx.metier.Formation;
import chris.portfoliofx.service.ServiceFormation;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class AfficherFormationController {
    @FXML
    private TableView<Formation> formationTable;
    @FXML
    private TableColumn<Formation, String> intituleColumn;
    @FXML
    private TableColumn<Formation, String> anneeColumn;
    @FXML
    private TableColumn<Formation, String> centreColumn;
    @FXML
    private Button retourButton;
    private Stage stage;

    @FXML
    public void initialize(){
        ServiceFormation serviceFormation = new ServiceFormation();
        formationTable.setItems(FXCollections.observableArrayList(serviceFormation.getLabelFormationFiltre()));
        anneeColumn.setCellValueFactory(CellData->CellData.getValue().anneeProperty());
        intituleColumn.setCellValueFactory(CellData->CellData.getValue().intituleProperty());
        centreColumn.setCellValueFactory(CellData->CellData.getValue().centreProperty());
    }

    @FXML
    public void fermerMenu(){
        stage = (Stage) retourButton.getScene().getWindow();
        stage.close();
    }


    public void setStage(Stage stage) {
        this.stage = stage;
    }
}
