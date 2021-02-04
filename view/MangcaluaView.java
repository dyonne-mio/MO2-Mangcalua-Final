package view;

import java.util.*;

import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.event.ActionEvent;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import org.fxmisc.richtext.*;

import controller.MangcaluaController;

public class MangcaluaView {
    private MangcaluaController controller;
    private TextArea textArea;
    private Stage stage;
    private CodeArea codeArea;

    public MangcaluaView(Stage stage) {
        this.stage = stage;
        Menu runMenu = new Menu("▶ Run");
        // Run Menu
        MenuItem runMenuItemRun = new MenuItem("▶ Run");
        MenuBar menuBar = new MenuBar(runMenu);
        runMenu.getItems().add(runMenuItemRun);
        // Code Area
        codeArea = new CodeArea();
        codeArea.setStyle("-fx-font-family: Consolas; -fx-font-size: 11pt;");
        codeArea.setParagraphGraphicFactory(LineNumberFactory.get(codeArea));
        codeArea.setMinHeight(370);
        runMenuItemRun.addEventHandler(ActionEvent.ACTION,event -> {
            controller.parse(codeArea.getText());
            controller.execute();
        });
        // Console
        textArea = new TextArea();
        textArea.setEditable(false);
        textArea.setPrefHeight(200);
        textArea.setWrapText(true);
        textArea.setStyle("-fx-background-color: linear-gradient(to bottom, derive(-fx-text-box-border, -10%), -fx-text-box-border), linear-gradient(from 0px 0px to 0px 0px, derive(-fx-control-inner-background, -9%), -fx-control-inner-background)");
        textArea.textProperty().addListener(new ChangeListener<Object>() {
            @Override
            public void changed(ObservableValue<?> observable, Object oldValue,
                                Object newValue) {
                textArea.setScrollTop(Double.MAX_VALUE);
            }
        });
        VBox vBox = new VBox(menuBar, codeArea, textArea);
        Scene scene = new Scene(vBox, 1000, 600);
        scene.getStylesheets().add("/view/keywords.css");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("〽️\uD83C\uDDF2angcalua \uD83C\uDDEE\uD83C\uDDE9\uD83C\uDDEA");
        stage.show();
    }

    public String getInput(String prompt) {
        TextInputDialog td = new TextInputDialog(); 
        td.getDialogPane().lookupButton(ButtonType.CANCEL).setVisible(false);
        td.getDialogPane().lookupButton(ButtonType.CANCEL).setManaged(false);
        td.setTitle("Scan input");
        td.setHeaderText(prompt);
        td.showAndWait();
        return td.getEditor().getText(); 
    }

    public void updateLogs(List<String> output) {
        if (output == null) {
            textArea.setText("");
            textArea.appendText(""); 
            return;
        }
        StringBuilder logs = new StringBuilder("");
        output.forEach((li) -> {
            logs.append(li + "\n");
        });
        textArea.setText(logs.toString());
        textArea.appendText(""); 
    }

    public void printToConsole(String msg) {
        String all = textArea.getText();
        if (msg.contains("\\n")){
            msg = msg.replace("\\n", "\n");
        }
        textArea.setText(all + msg);
        textArea.appendText("");
    }

    public void setController(MangcaluaController controller) {
        this.controller = controller;
    }
}