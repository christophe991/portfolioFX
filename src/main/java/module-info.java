module chris.portfoliofx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens chris.portfoliofx to javafx.fxml;
    exports chris.portfoliofx;
}