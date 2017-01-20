
package controle;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class RetanguloControle implements Initializable {
    @FXML
    private TextField CampoBase;
    @FXML
    private TextField CampoAltura; 
    @FXML
    private Label CampoArea;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
    public void areaRetangulo (ActionEvent event) throws IOException{
        String base = CampoBase.getText();
        String altura = CampoAltura.getText();
        
        
        
        int area = Integer.parseInt(base) * Integer.parseInt(altura);
        
        CampoArea.setText("Area do retangulo é: "+String.valueOf(area));
    }
}
