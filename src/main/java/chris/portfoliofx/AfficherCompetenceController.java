package chris.portfoliofx;

import chris.portfoliofx.metier.Outil;
import chris.portfoliofx.metier.Technologie;
import chris.portfoliofx.service.ServiceOutil;
import chris.portfoliofx.service.ServiceTechnologie;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class AfficherCompetenceController {

    @FXML
    private TableView<Technologie> technoTable;
    @FXML
    private TableView<Outil> outilTable;
    @FXML
    private TableColumn<Technologie, String> technoColumn;
    @FXML
    private TableColumn<Outil, String> outilColumn;
    @FXML
    private Button retourButton;
    private Stage stage;

    @FXML
    private void initialize(){
        ServiceOutil serviceOutil = new ServiceOutil();
        ServiceTechnologie serviceTechnologie = new ServiceTechnologie();
        technoTable.setItems(FXCollections.observableArrayList(serviceTechnologie.getLabelTechnologieFiltre()));
        outilTable.setItems(FXCollections.observableArrayList(serviceOutil.getLabelOutilFiltre()));
        technoColumn.setCellValueFactory(CellData->CellData.getValue().langageProperty());
        outilColumn.setCellValueFactory(CellData->CellData.getValue().outilProperty());
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
