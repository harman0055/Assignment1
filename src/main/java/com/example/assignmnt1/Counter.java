package com.example.assignmnt1;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * A JavaFX application for a counter.
 */
public class Counter extends Application implements CounterController {

    private CounterModel model;
    private CounterView view;
    Stage stage;

    /**
     * Starts the JavaFX application.
     *
     * @param primaryStage the primary stage for this application
     * @throws Exception if an error occurs during application startup
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        model = new CounterModel();
        stage = primaryStage;
        addModel(model);
        createGUI();
    }

    /**
     * Adds a model to the controller.
     *
     * @param model1 the model to add
     */
    @Override
    public void addModel(CounterModel model1) {
        model = model1;
    }

    /**
     * Creates the graphical user interface for the counter.
     */
    @Override
    public void createGUI() {
        view = new CounterView(stage, model);
    }

    public CounterModel getModel() {
        return model;
    }

    public CounterView getView() {
        return view;
    }


}
