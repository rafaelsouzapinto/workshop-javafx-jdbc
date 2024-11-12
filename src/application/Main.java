package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			// Passamos o caminho da view e carregamos ela
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/gui/MainView.fxml"));
			ScrollPane scrollPane = loader.load();
			
			// Ajustando ScrollPane para o tamanho na janela
			scrollPane.setFitToHeight(true);
			scrollPane.setFitToWidth(true);
			
			// Instanciamos a cena principal passando a view instanciada
			Scene mainScene = new Scene(scrollPane);
			
			// Setamos no palco a cena principal, um título, e exibimos ele
			primaryStage.setScene(mainScene);
			primaryStage.setTitle("Sample JavaFX application");
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
