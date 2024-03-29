package com.mycompany.app;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    private TableView<Product> productTable;
    private TextField productNameField;
    private TextField productPriceField;
    private Button addProductButton;

    @Override
    public void start(Stage stage) {
        // Tạo giao diện
        VBox root = new VBox();
        Scene scene = new Scene(root, 400, 300);

        // Hiển thị danh sách sản phẩm
        productTable = new TableView<>();
        productTable.getColumns().add(new TableColumn<>("Code"));
        productTable.getColumns().add(new TableColumn<>("Name"));
        productTable.getColumns().add(new TableColumn<>("Price"));

        // Thêm sản phẩm
        productNameField = new TextField();
        productPriceField = new TextField();
        addProductButton = new Button("Add");
        addProductButton.setOnAction(event -> {
            // Lay thong tin san pham
            String name = productNameField.getText();
            double price = Double.parseDouble(productPriceField.getText());

            // Thêm sản phẩm vào danh sách
            Product product = new Product(name, price);
            productTable.getItems().add(product);
        });

        // Cấu hình giao diện
        root.getChildren().addAll(productTable, productNameField, productPriceField, addProductButton);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
