package javaFX_NumberGrid;

/* ************************ */
/* **** Number Grid ******* */
/* *** By: Sashae Owens *** */
/* ************************ */

// I Sashae Owens wrote this code

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;

public class JavaFX_NumberGrid extends Application {

	@Override // Override the start method in the Application class

	public void start(Stage primaryStage) {
		
		GridPane pane = new GridPane(); // Create a grid pane object
		pane.setAlignment(Pos.TOP_LEFT); // Set the alignment
		pane.setPadding(new Insets(10)); // Set padding

		// Variables and array for loop
		Label[] myLabels = new Label[100];
		int cCount = 0;
		int rCount = 0;

		// Loop through 100 labels
		for (int i = 0; i < 100; i++) {
			int x = (int) (Math.random() * 100);
			String y = String.valueOf(x);
			myLabels[i] = new Label(y);

			// Simple logic for style assignment
			if (x % 6 == 0) {
				myLabels[i].setStyle("-fx-border-color: black; -fx-background-color: lightgreen; -fx-padding: 5;");
			} else if (x % 3 == 0) {
				myLabels[i].setStyle("-fx-border-color: black; -fx-background-color: yellow; -fx-padding: 5;");
			} else if (x % 2 == 0) {
				myLabels[i].setStyle("-fx-border-color: black; -fx-background-color: lightblue; -fx-padding: 5;");
			} else {
				myLabels[i].setStyle("-fx-border-color: black; -fx-background-color: white; -fx-padding: 5;");
			}

			// Add new pane to grid
			pane.add(myLabels[i], rCount, cCount);

			// Update Counters for grid location
			rCount++;
			if (rCount == 10) {
				rCount = 0;
				cCount++;
			}

		}

		// Create scene and use default stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("ShowGridPane"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

}