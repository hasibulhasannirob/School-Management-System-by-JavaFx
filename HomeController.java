package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {
    @FXML
    private Button btnAdmin;

    @FXML
    private Button btnTeacher;

    @FXML
    private Button btnStudent;



    @FXML
    private Button loginStudent;
    @FXML
    private String userT;

    @FXML
    private PasswordField passT;

    @FXML
    private Button loginTeacher;
    @FXML
    private Button Notices;
    @FXML
    private Button Attendence;

    @FXML
    private Button Fees;

    @FXML
    private Button Result;
    @FXML
    private Button noticeT;

    @FXML
    private Button attendanceT;




    @FXML
    void handleTeacher(ActionEvent event){
        if(event.getSource()==noticeT){
            LoadStages("/sample/TeacherNotices.fxml");
        }
        else if(event.getSource()==attendanceT){
            LoadStages("/sample/TeacherAttendance.fxml");
        }
    }




    @FXML
    void handleNotices(ActionEvent event){
        if(event.getSource()==Notices){
            LoadStages("/sample/StudentNotices.fxml");
        }
        else if(event.getSource()==Result){
            LoadStages("/sample/StudentResult.fxml");
        }
        else if(event.getSource()==Attendence){
            LoadStages("/sample/StudentAttendence.fxml");
        }
        else if(event.getSource()==Fees){
            LoadStages("/sample/StudentFees.fxml");
        }
    }



    @FXML
    void handle(ActionEvent event) {
        if(event.getSource()==loginStudent){
            LoadStages("/sample/StudentHome.fxml");
        }
        else if(event.getSource()==loginTeacher){
            LoadStages("/sample/TeacherHome.fxml");
        }
    }




    @FXML
    private void handleButtonClicks(javafx.event.ActionEvent mouseEvent){
        if(mouseEvent.getSource()==btnAdmin){
            LoadStages("/sample/AdminLogin.fxml");
        }
        else if (mouseEvent.getSource()==btnTeacher){
            LoadStages("/sample/TeacherLogin.fxml");
            }
        else if (mouseEvent.getSource()==btnStudent){
            LoadStages("/sample/StudentLogin.fxml");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    private void LoadStages(String fxml){
        try {
            Parent root = FXMLLoader.load(getClass().getResource(fxml));
            Stage stage=new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
