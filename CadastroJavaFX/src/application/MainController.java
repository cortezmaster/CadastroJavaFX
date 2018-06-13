package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController implements Initializable 
{

		@Override
		public void initialize(URL location, ResourceBundle resources) 
		{
			// TODO Auto-generated method stub
		}
		
		@FXML
		private Label lblCadastro;
		
		
		@FXML
		private PasswordField txtSenha;
		
		@FXML
		private TextField txtEmail;
		
		@FXML 
		private TextField txtNovoNome;
		
		@FXML
		private PasswordField txtNovaSenha;
		
		@FXML
		private TextField txtNovoEmail;
		
		@FXML
		public static  Label label ;
		
		
		@FXML
		private  Label label1;
		
		

		@FXML
		private String Nome1  ;
		
		
		@FXML
		public static String Nome ;
		@FXML
		public static String Senha ;
		@FXML
		public static String Email ;


		
		
		
	   
		
		
		public void Enviar1 (ActionEvent event) throws IOException
		{
			
			Nome= txtNovoNome.getText();
			Senha= txtNovaSenha.getText();
			Email= txtNovoEmail.getText();
		//	label1.setText(Nome);
			
			
			
			
			if (txtNovoNome.getText().equals(Nome) && txtNovaSenha.getText().equals(Senha) &&
					txtNovoEmail.getText().equals(Email))
			{
				Stage primaryStage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("/application/login.fxml"));
				Scene scene = new Scene(root);
				primaryStage.setScene(scene);
				primaryStage.show();
			
			}
		}	
		
		
		
	
		
		public void Enviar (ActionEvent event) throws IOException 
		{			
			
			
					
			if (txtSenha.getText().equals(Senha) && txtEmail.getText().equals(Email))
			{
				
				
				
				
				Stage primaryStage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("/application/CadastroRealizado.fxml"));
				
				Scene scene = new Scene(root);
				primaryStage.setScene(scene);
				primaryStage.show();
		
				
				
			}
			
			else 
			{
				
				Stage primaryStage = new Stage();
				Parent root = FXMLLoader.load(getClass().getResource("/application/CadastroNaoRealizado.fxml"));
				Scene scene = new Scene(root);
				primaryStage.setScene(scene);
				primaryStage.show();
			}
		}

}



