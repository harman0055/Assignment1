package com.example.assignmnt1;
//
// Source code recreated from a .class file by IntelliJ IDEA
//

import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToolBar;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CounterView {
    private CounterModel model;
    private TextArea textInput;
    private Label lineCountLabel;
    private Label wordCountLabel;
    private Label charCountLabel;
    private Label digitCountLabel;
    private ToolBar statusBar;
    private Button countButton;
    private Stage stage;

    public CounterView(Stage stage, CounterModel model1) {
        this.stage = stage;
        this.model = model1;
        this.textInput = new TextArea();
        this.textInput.setPrefRowCount(20);
        this.textInput.setPrefColumnCount(50);
        this.statusBar = new ToolBar();
        this.createStatusBar();
        this.countButton = new Button();
        this.countButton.setText("process the text");
        this.countButton.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        this.countButton.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent event) {
                CounterView.this.model.setTextInput(CounterView.this.textInput.getText());
                CounterView.this.model.processInput();
                CounterView.this.updateLabels();
            }
        });
        stage.addEventHandler(KeyEvent.KEY_RELEASED, (event) -> {
            if (!event.isConsumed() && KeyCode.ESCAPE == event.getCode()) {
                stage.hide();
            }

        });
        String style = "-fx-padding: 4px; -fx-font: bold 14pt serif; -fx-background-color: white";
        this.lineCountLabel = new Label("  Number of lines:");
        this.lineCountLabel.setStyle("-fx-text-fill: green; -fx-font: italic bold 16pt serif;-fx-padding: 4px;-fx-background-color: white");
        this.lineCountLabel.setMaxWidth(1000.0);
        this.wordCountLabel = new Label("  Number of words:");
        this.wordCountLabel.setStyle("-fx-text-fill: red; -fx-font: italic bold 16pt serif;-fx-padding: 4px;-fx-background-color: white");
        this.wordCountLabel.setMaxWidth(1000.0);
        this.charCountLabel = new Label("  Number of chars:");
        this.charCountLabel.setStyle("-fx-text-fill: blue; -fx-font: italic bold 16pt serif;-fx-padding: 4px;-fx-background-color: white");
        this.charCountLabel.setMaxWidth(1000.0);
        this.digitCountLabel = new Label("  Number of digits:");
        this.digitCountLabel.setStyle("-fx-text-fill: black; -fx-font: italic bold 16pt serif;-fx-padding: 4px;-fx-background-color: white");
        this.digitCountLabel.setMaxWidth(1000.0);
        VBox root = new VBox(6.0, new Node[]{new BorderPane(this.statusBar), this.textInput, new BorderPane(this.countButton), this.lineCountLabel, this.wordCountLabel, this.charCountLabel, this.digitCountLabel});
        root.setStyle("-fx-background-color: lightgrey; -fx-border-color: grey; -fx-border-width:5px");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("MicrosoftWord/Word/Char/digit Counter");
        stage.setResizable(false);
        stage.show();
    }

    private void createStatusBar() {
        Label textInputLabel = new Label("Type your text here ");
        textInputLabel.setStyle("-fx-text-fill: black; -fx-font: bold  12pt serif;-fx-padding: 4px;");
        Pane separator = new Pane();
        separator.setPrefHeight(1.0);
        HBox.setHgrow(separator, Priority.ALWAYS);
        Label escLabel = new Label("Press Esc to Exit ");
        this.statusBar.getItems().addAll(new Node[]{textInputLabel, separator, escLabel});
    }

    private void updateLabels() {
        this.lineCountLabel.setText("  Number of lines:  " + this.model.getLineCount());
        this.wordCountLabel.setText("  Number of words:  " + this.model.getWordCount());
        this.charCountLabel.setText("  Number of chars:  " + this.model.getCharCount());
        this.digitCountLabel.setText("  Number of digits:  " + this.model.getDigitCount());
    }

    public TextArea getTextInput() {
        return this.textInput;
    }

    public Label getLineCountLabel() {
        return this.lineCountLabel;
    }

    public Label getWordCountLabel() {
        return this.wordCountLabel;
    }

    public Label getCharCountLabel() {
        return this.charCountLabel;
    }

    public Label getDigitCountLabel() {
        return this.digitCountLabel;
    }

    public Button getCountButton() {
        return this.countButton;
    }

    public Stage getStage() {
        return this.stage;
    }
}
