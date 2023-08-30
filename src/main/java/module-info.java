module com.example.gitgame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gitgame to javafx.fxml;
    exports com.example.gitgame;
}