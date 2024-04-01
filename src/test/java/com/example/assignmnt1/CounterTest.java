package com.example.assignmnt1;

import javafx.embed.swing.JFXPanel;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


import javafx.application.Platform;
import javafx.stage.Stage;

public class CounterTest {

    @BeforeClass
    public static void initJFX() {
        // Initialize JavaFX Toolkit
        new JFXPanel();
    }

    @Test
    public void Start() throws Exception {
        System.out.println("start");

        // Run the UI-related code on the JavaFX Application Thread
        Platform.runLater(() -> {
            Stage primaryStage = new Stage(); // Mocking a Stage instance
            Counter instance = new Counter();
            try {
                instance.start(primaryStage);
            } catch (Exception e) {
                e.printStackTrace();
                fail("Exception occurred while starting the application: " + e.getMessage());
            }

            // Add assertions to verify the behavior of the start method.
            // For example, you can verify if the stage is showing after calling start.
            assertNotNull(primaryStage.getTitle());
        });

        // Wait for the JavaFX Application Thread to finish executing
        Thread.sleep(2000); // Adjust the delay time if needed
    }





    /**
     * Test of addModel method, of class Counter.
     * This method tests the addModel method of the Counter class.
     */

    @Test
    public void testAddModel() {
        System.out.println("addModel");
        CounterModel model = new CounterModel(); // Create a CounterModel instance
        Counter instance = new Counter();
        instance.addModel(model);
        assertNotNull(instance.getModel()); // Verify that the model is not null after addition
        assertEquals(model, instance.getModel()); // Verify that the added model is the same as the retrieved model
    }



}
