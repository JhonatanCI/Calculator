package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainWindow {
		
	  	@FXML
	    private Button sevenBUT;

	    @FXML
	    private TextField calculateTA;

	    @FXML
	    private TextField resultTA;

	    @FXML
	    private TextArea HistoyTA;

	    @FXML
	    private Button eightBUT;

	    @FXML
	    private Button nineBUT;

	    @FXML
	    private Button fourBUT;

	    @FXML
	    private Button fiveBUT;

	    @FXML
	    private Button sixBUT;

	    @FXML
	    private Button oneBUT;

	    @FXML
	    private Button twoBUT;

	    @FXML
	    private Button threeBUT;

	    @FXML
	    private Button zeroBUT;

	    @FXML
	    private Button asthericBUT;

	    @FXML
	    private Button divideBUT;

	    @FXML
	    private Button plusBUT;

	    @FXML
	    private Button lessBUT;

	    @FXML
	    private Button equaBUT;
	   
	    
	
	    @FXML
	    void numbers(ActionEvent event) {
	    	Button[ ] numbers = new  Button[] {zeroBUT,oneBUT,twoBUT,threeBUT,fourBUT,fiveBUT,sixBUT,sevenBUT,eightBUT,nineBUT};	
		    	
		    for (int i=0; i>numbers.length;i++) {
		    	System.out.println("1");
			   if(event.getSource()==numbers[i]){
		    		calculateTA.appendText(numbers[i].getText());
		    		System.out.println("exit");
		    	}
			
		   }
	   }
	    @FXML
	    void operations(ActionEvent event) {
	    	
	    	Button[ ] operations = new  Button[] {equaBUT,plusBUT,lessBUT,asthericBUT,divideBUT};	
		    	
		    for (int i=0; i>operations.length;i++) {
			   if(event.getSource()== operations[i]){
		    		calculateTA.appendText(operations[i].getText());
		    	}
			
		   }
	    }
	    
	    
	    @FXML
	    void result(ActionEvent event) {
	    	
	    	resultTA.getText().split("+");
	    	
	    }
	    	/*if(event.getSource()== sevenBUT){
	    		calculateTA.appendText(oneBUT.getText());
	    	}*/

	

}
