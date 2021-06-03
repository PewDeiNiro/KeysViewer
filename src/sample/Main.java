package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;

public class Main extends Application {

    @FXML
    TextField keyField1, keyField2, keyField3, keyField4, keyField5, keyField6, keyField7, keyField8, keyField9, keyField10, keyField11, keyField12, keyField13, keyField14, keyField15, keyField16, keyField17, keyField18, keyField19, keyField20, messageField;
    @FXML
    TextField out1, out2, out3, out4, out5, out6, out7, out8, out9, out10, out11, out12, out13, out14, out15, out16, out17, out18, out19, out20;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("KeyViewer");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void onClick(){
        if (!isFulled()){
            int r1 = Integer.parseInt(keyField1.getText());
            int r2 = Integer.parseInt(keyField2.getText()) + r1;
            int r3 = Integer.parseInt(keyField3.getText()) + r2;
            int r4 = Integer.parseInt(keyField4.getText()) + r3;
            int r5 = Integer.parseInt(keyField5.getText()) + r4;
            int r6 = Integer.parseInt(keyField6.getText()) + r5;
            int r7 = Integer.parseInt(keyField7.getText()) + r6;
            int r8 = Integer.parseInt(keyField8.getText()) + r7;
            int r9 = Integer.parseInt(keyField9.getText()) + r8;
            int r10 = Integer.parseInt(keyField10.getText()) + r9;
            int r11 = Integer.parseInt(keyField11.getText()) + r10;
            int r12 = Integer.parseInt(keyField12.getText()) + r11;
            int r13 = Integer.parseInt(keyField13.getText()) + r12;
            int r14 = Integer.parseInt(keyField14.getText()) + r13;
            int r15 = Integer.parseInt(keyField15.getText()) + r14;
            int r16 = Integer.parseInt(keyField16.getText()) + r15;
            int r17 = Integer.parseInt(keyField17.getText()) + r16;
            int r18 = Integer.parseInt(keyField18.getText()) + r17;
            int r19 = Integer.parseInt(keyField19.getText()) + r18;
            int r20 = Integer.parseInt(keyField20.getText()) + r19;

            String message = messageField.getText();
            String first = message.substring(0, r1);
            String second = message.substring(r1, r2);
            String third = message.substring(r2, r3);
            String fourth = message.substring(r3, r4);
            String fifth = message.substring(r4, r5);
            String sixth = message.substring(r5, r6);
            String seventh = message.substring(r6, r7);
            String eighth = message.substring(r7, r8);
            String ninth = message.substring(r8, r9);
            String tenth = message.substring(r9, r10);
            String eleventh = message.substring(r10, r11);
            String twelfth = message.substring(r11, r12);
            String thirteenth = message.substring(r12, r13);
            String fourteenth = message.substring(r13, r14);
            String fifteenth = message.substring(r14, r15);
            String sixteenth = message.substring(r15, r16);
            String seventeenth = message.substring(r16, r17);
            String eighteenth = message.substring(r17, r18);
            String nineteenth = message.substring(r18, r19);
            String twentieth = message.substring(r20);

            out1.setText(first);
            out2.setText(second);
            out3.setText(third);
            out4.setText(fourth);
            out5.setText(fifth);
            out6.setText(sixth);
            out7.setText(seventh);
            out8.setText(eighth);
            out9.setText(ninth);
            out10.setText(tenth);
            out11.setText(eleventh);
            out12.setText(twelfth);
            out13.setText(thirteenth);
            out14.setText(fourteenth);
            out15.setText(fifteenth);
            out16.setText(sixteenth);
            out17.setText(seventeenth);
            out18.setText(eighteenth);
            out19.setText(nineteenth);
            out20.setText(twentieth);

        }
        else{
            JOptionPane.showMessageDialog(null, "Заполните все поля", "Ошибка", JOptionPane.WARNING_MESSAGE);
        }
    }

    private boolean isFulled(){
        if (!(keyField1.getText().trim().isEmpty() || keyField2.getText().trim().isEmpty() || keyField3.getText().trim().isEmpty() ||
                keyField4.getText().trim().isEmpty() || keyField5.getText().trim().isEmpty() || keyField6.getText().trim().isEmpty() ||
                keyField7.getText().trim().isEmpty() || keyField8.getText().trim().isEmpty() || keyField9.getText().trim().isEmpty() ||
                keyField10.getText().trim().isEmpty() || keyField11.getText().trim().isEmpty() || keyField12.getText().trim().isEmpty() ||
                keyField13.getText().trim().isEmpty() || keyField14.getText().trim().isEmpty() || keyField15.getText().trim().isEmpty() ||
                keyField16.getText().trim().isEmpty() || keyField17.getText().trim().isEmpty() || keyField18.getText().trim().isEmpty() ||
                keyField19.getText().trim().isEmpty() || keyField20.getText().trim().isEmpty() || messageField.getText().trim().isEmpty())){
            return false;
        }
        else{
            return true;
        }
    }

}
