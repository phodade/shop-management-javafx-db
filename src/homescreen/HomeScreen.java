package homescreen;

import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class HomeScreen {
	
	public static void showHomeScreen() {
		
			try {
				Parent actorGroup = FXMLLoader.load(new URL("file:///C|//Users//Pratiksha//eclipse-workspace//ShopManagementJavaFX(Project2)//src//homescreen//HomeScreen.fxml"));
				StageFactory.stage.setTitle(" Home Screen ");
				Scene scene = new Scene(actorGroup ,600,400);
				StageFactory.stage.setScene(scene);
				//StageFactory.stage.setFullScreen(true);
				StageFactory.stage.show();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
}
