module com.example.firstjavafx {
    requires javafx.controls;
    requires javafx.fxml;
            
                requires validatorfx;
                requires org.kordamp.bootstrapfx.core;
            
    opens com.example.firstjavafx to javafx.fxml;
    exports com.example.firstjavafx;
}