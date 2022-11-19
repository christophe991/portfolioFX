package chris.portfoliofx;

import chris.portfoliofx.metier.Qualite;
import chris.portfoliofx.service.ServiceQualite;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MenuController {
    @FXML
    private TextArea bonjourText;
    @FXML
    private Button bonjourButton;
    @FXML
    private Button detailButton;
    @FXML
    private Button projetButton;
    @FXML
    private Button merciButton;

    @FXML
    private Button formationButton;

    @FXML
    private Button competenceButton;
    @FXML
    private Button creationButton;
    private Main main;
    @FXML
    private TableView<Qualite> qualiteTable;
    @FXML
    private TableColumn<Qualite, String> qualiteColumn;

    @FXML
    public void initialize(){
        ServiceQualite serviceQualite = new ServiceQualite();
        qualiteTable.setItems(FXCollections.observableArrayList(serviceQualite.getLabelQualiteFiltre()));
        qualiteColumn.setCellValueFactory(CellData -> CellData.getValue().nomProperty());
    }


    @FXML
    protected void bonjourClick() {
        bonjourText.setText("Bonjour, je m’appelle Christophe HEDDEBAUT, actuellement en formation CDA.");
    }
    @FXML
    protected void detailClick() {
        bonjourText.setText("Je recherche une entreprise pour être former gratuitement pendant 3 mois du 20.02 au 17.05.23.");
    }
    @FXML
    protected void projetClick() {
        bonjourText.setText("Afin de décrocher un emploi si possible et valider mon diplôme, voici mes compétences et créations.");
    }
    @FXML
    protected void merciClick() {
        bonjourText.setText("Je vous remercie de votre attention, n’hésitez pas à me contactez si mon profil vous a plu. ");
    }

    public void setMainApp(Main main) {
        this.main = main;
    }

    @FXML
    private void afficherFormation(){
       try{
           FXMLLoader loader = new FXMLLoader();
           loader.setLocation(Main.class.getResource("Formation.fxml"));
           AnchorPane anchorPane = loader.load();
           Scene scene = new Scene(anchorPane);
           Stage stage = new Stage();
           stage.setTitle("Formations");
           stage.initModality(Modality.APPLICATION_MODAL);
           stage.setScene(scene);
           AfficherFormationController afficherFormationController = loader.getController();
           afficherFormationController.setStage(stage);
           stage.showAndWait();
       }catch (Exception e){
           e.printStackTrace();
       }
    }

    @FXML
    private void afficherCompetence(){
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("Competence.fxml"));
            AnchorPane anchorPane = loader.load();
            Scene scene = new Scene(anchorPane);
            Stage stage = new Stage();
            stage.setTitle("Compétences et outils");
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            AfficherCompetenceController afficherCompetenceController = loader.getController();
            afficherCompetenceController.setStage(stage);
            stage.showAndWait();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    private void afficherCreation(){
        try{
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource("Creation.fxml"));
            AnchorPane anchorPane = loader.load();
            Scene scene = new Scene(anchorPane);
            Stage stage = new Stage();
            stage.setTitle("Créations");
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            AfficherCreationController afficherCreationController = loader.getController();
            afficherCreationController.setStage(stage);
            stage.showAndWait();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}