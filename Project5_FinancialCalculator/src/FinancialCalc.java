/* Daniel Eggers                 *
 * CMPSCI2261 with Khaldoon Dhou *
 * April 22, 2018                */
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import java.text.DecimalFormat;  //for formatting as dollar amount


public class FinancialCalc extends Application {
		
	public static void main(String[] args) {
		Application.launch(args);
	}
	
	
	@Override
	public void start(Stage arg0) throws Exception {
		
		/* Make layout objects */
		FlowPane pane = new FlowPane();
		pane.setAlignment(Pos.CENTER);
		
		BorderPane bpane = new BorderPane();
		HBox hbox = new HBox();
		VBox vbox_left = new VBox();
		VBox vbox_right = new VBox();
		
		TextField tf1 = new TextField();
		TextField tf2 = new TextField();
		TextField tf3 = new TextField();
		TextField tf4 = new TextField();
		
		Button btCalc = new Button("Calculate");
		tf4.setEditable(false);
		
		Label label1 = new Label("Investment Amount:     ");
		Label label2 = new Label("Number of Years:       ");
		Label label3 = new Label("Annual Interest Rate:  ");
		Label label4 = new Label("Future value:          ");
		Label labelN = new Label("");
		
		
		/* Adjust layout alignment */
		bpane.setCenter(hbox);
		hbox.setAlignment(Pos.CENTER);
		vbox_left.getChildren().addAll(label1, label2, label3, label4, labelN);
		vbox_right.getChildren().addAll(tf1, tf2, tf3, tf4, btCalc);
		hbox.getChildren().addAll(vbox_left, vbox_right);
		
		
		/* Adjust alignment and sizes of labels and text fields */
		double LHEIGHT = 24;   //Label height
		double TFHEIGHT = 24;  //TextField height
		double TFWIDTH = 128;  //TextField width
		label1.setPrefHeight(LHEIGHT+4);
		label2.setPrefHeight(LHEIGHT);
		label3.setPrefHeight(LHEIGHT);
		label4.setPrefHeight(LHEIGHT);
		labelN.setPrefHeight(LHEIGHT+4);
		tf1.setPrefHeight(TFHEIGHT);
		tf2.setPrefHeight(TFHEIGHT);
		tf3.setPrefHeight(TFHEIGHT);
		tf4.setPrefHeight(TFHEIGHT);
		tf1.setPrefWidth(TFWIDTH);
		tf1.setAlignment(Pos.CENTER_RIGHT);
		tf2.setAlignment(Pos.CENTER_RIGHT);
		tf3.setAlignment(Pos.CENTER_RIGHT);
		tf4.setAlignment(Pos.CENTER_RIGHT);
		vbox_left.setAlignment(Pos.CENTER_LEFT);
		vbox_right.setAlignment(Pos.CENTER_RIGHT);
		
		
		/* create scene */
		Scene scene = new Scene (bpane, 350, 250);
		arg0.setTitle("Financial Calculator");
		arg0.setScene(scene);
		arg0.show();
		
		
		/* Math and Print Results: */
		btCalc.setOnAction( e -> {
			double dbl_futureValue = calculateFutureValue( tf1.getText(), tf2.getText(), tf3.getText() );
			DecimalFormat formatter = new DecimalFormat("#.00");
			String str_futureValue = String.valueOf( formatter.format(dbl_futureValue) );
			tf4.setText( "$" + str_futureValue );
		});
		
	}

	
	/* formula: Future Value = Investment Amount * (1 + Monthly Interest Rate)^(Years * 12) */
	public double calculateFutureValue(String str_investment, String str_years, String str_annual) {
		/* convert all passed strings to doubles */
		double dbl_investment = Double.parseDouble(str_investment);
		double dbl_annual = Double.parseDouble(str_annual);
		double dbl_monthly = ( dbl_annual / 1200 );
		double dbl_years = Double.parseDouble(str_years);
		
		double baseExpr = (1 + dbl_monthly);  //base of expression
		double exponentExpr = (dbl_years * 12);  //exponent of expression
		double dbl_futureValue = dbl_investment * Math.pow(baseExpr, exponentExpr);
		return dbl_futureValue;
	}

}