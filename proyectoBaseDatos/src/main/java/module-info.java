module com.example.proyectobasedatos {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;


    opens com.example.proyectobasedatos to javafx.fxml;
    exports com.example.proyectobasedatos;
}