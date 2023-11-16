package deleteproduct;

import java.net.URL;

import common.StageFactory;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class DeleteProductScreen {
	
public static void showDeleteProductScreen() {
		
		try {
			Parent actorGroup = FXMLLoader.load(new URL("file:///C|//Users//Pratiksha//eclipse-workspace//ShopManagementJavaFX(Project2)//src//deleteproduct//DeleteProductScreen.fxml"));
			StageFactory.stage.setTitle(" DeleteProduct Screen ");
			Scene scene = new Scene(actorGroup ,600,400);
			StageFactory.stage.setScene(scene);
			StageFactory.stage.setFullScreen(true);
			StageFactory.stage.show();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}


}
