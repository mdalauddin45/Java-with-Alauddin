import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class ElectricBillingSystem extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Electric Billing System");

        // Create layout
        BorderPane layout = new BorderPane();

        // Create a menu bar
        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        MenuItem exitMenuItem = new MenuItem("Exit");
        fileMenu.getItems().add(exitMenuItem);
        menuBar.getMenus().add(fileMenu);

        // Create a form for entering customer information
        GridPane customerInfoForm = new GridPane();
        customerInfoForm.setHgap(10);
        customerInfoForm.setVgap(5);
        Label nameLabel = new Label("Customer Name:");
        TextField nameField = new TextField();
        Label meterLabel = new Label("Meter Number:");
        TextField meterField = new TextField();
        Label unitsLabel = new Label("Units Consumed:");
        TextField unitsField = new TextField();
        Button calculateButton = new Button("Calculate");

        customerInfoForm.add(nameLabel, 0, 0);
        customerInfoForm.add(nameField, 1, 0);
        customerInfoForm.add(meterLabel, 0, 1);
        customerInfoForm.add(meterField, 1, 1);
        customerInfoForm.add(unitsLabel, 0, 2);
        customerInfoForm.add(unitsField, 1, 2);
        customerInfoForm.add(calculateButton, 1, 3);

        // Create a table to display billing information
        TableView<String> billingTable = new TableView<>();
        TableColumn<String, String> column = new TableColumn<>("Billing Information");
        billingTable.getColumns().add(column);

        // Add components to the layout
        layout.setTop(menuBar);
        layout.setCenter(customerInfoForm);
        layout.setBottom(billingTable);

        Scene scene = new Scene(layout, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}