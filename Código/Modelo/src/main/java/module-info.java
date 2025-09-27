module org.sambold.tg {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens org.sambold.tg.Controller to javafx.fxml;
    opens org.sambold.tg.tgmodeloBeans to javafx.fxml;

    exports org.sambold.tg;
    exports org.sambold.tg.Controller;
}



