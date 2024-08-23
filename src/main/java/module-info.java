module homework {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    //requires org.xerial.sqlitejsbc;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens homework to javafx.fxml;
}