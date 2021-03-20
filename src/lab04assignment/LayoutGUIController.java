package lab04assignment;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class LayoutGUIController {
    
    double num1 = 0;
    double num2 = 0;
    int temp = 0;
    String operator = "";
    double answer = 0;
    double answerDecimal = 0;
    
    @FXML
    private TextField txt1;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button plusBtn;

    @FXML
    private Button eqlBtn;
    
    @FXML
    private Button btn0;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;

    @FXML
    private Button minusBtn;

    @FXML
    private Button multBtn;

    @FXML
    private Button divBtn;
    
    @FXML
    private Button clearBtn;

    @FXML
    void addNum(ActionEvent event) {
        if (((Button) event.getSource()).getText().equals("0")) {
            txt1.setText(txt1.getText() + "0");
        }
        
        if (((Button) event.getSource()).getText().equals("1")) {
            txt1.setText(txt1.getText() + "1");
        }

        if (((Button) event.getSource()).getText().equals("2")) {
            txt1.setText(txt1.getText() + "2");
        }

        if (((Button) event.getSource()).getText().equals("3")) {
            txt1.setText(txt1.getText() + "3");
        }
        
        if (((Button) event.getSource()).getText().equals("4")) {
            txt1.setText(txt1.getText() + "4");
        }
        
        if (((Button) event.getSource()).getText().equals("5")) {
            txt1.setText(txt1.getText() + "5");
        }
        
        if (((Button) event.getSource()).getText().equals("6")) {
            txt1.setText(txt1.getText() + "6");
        }
        
        if (((Button) event.getSource()).getText().equals("7")) {
            txt1.setText(txt1.getText() + "7");
        }
        
        if (((Button) event.getSource()).getText().equals("8")) {
            txt1.setText(txt1.getText() + "8");
        }
        
        if (((Button) event.getSource()).getText().equals("9")) {
            txt1.setText(txt1.getText() + "9");
        }
        
        
            
    }


    @FXML
    void eqOp(ActionEvent event) {
        num2 = Double.parseDouble(txt1.getText());
        switch(operator){
            case "add":
                answer = num1 + num2;
                txt1.setText(String.valueOf(answer));
                break;
                
            case "subtract":
                answer = num1 - num2;
                txt1.setText(String.valueOf(answer));
                break;
                
            case "multiplication":
                answer = num1 * num2;
                txt1.setText(String.valueOf(answer));
                break;
                
            case "division":
                if (num2 != 0){
                    answerDecimal =  num1 / num2;
                    txt1.setText(String.valueOf(answerDecimal));
                }
                
                if (num2 == 0){
                    txt1.setText("Cannot divide by 0");
                }
                
                break;
                                
        }
        
    }
    
    @FXML
    void addOp(ActionEvent event) {
        if (operator.equals("")){
            num1 = Double.parseDouble(txt1.getText());
            operator = "add";
            txt1.setText("");
            System.out.println("testing1");
        }
        operator = "add";
        if (operator.equals("add")) {
            num1 = Double.parseDouble(txt1.getText());
            answer =  num1;
            txt1.setText(String.valueOf(answer));
            txt1.setText("");
            operator = "add";
            System.out.println("testing2");
        }
        
    }
    
    @FXML
    void multOp(ActionEvent event) {
        /*num1 = Integer.parseInt(txt1.getText());
        operator = "multiplication";
        txt1.setText("");*/
        
        if (operator.equals("")){
            num1 = Double.parseDouble(txt1.getText());
            operator = "multiplication";
            txt1.setText("");
        }
        operator = "multiplication";
        if (operator.equals("multiplication")) {
            num1 = Double.parseDouble(txt1.getText());
            answer = num1;
            txt1.setText(String.valueOf(answer));
            txt1.setText("");
            operator = "multiplication";
        }

    }
    
    @FXML
    void minusOp(ActionEvent event){
        /*num1 = Integer.parseInt(txt1.getText());
        operator = "subtract";
        txt1.setText("");*/
        
        if (operator.equals("")){
            num1 = Double.parseDouble(txt1.getText());
            operator = "subtract";
            txt1.setText("");
        }
        operator = "subtract";
        if (operator.equals("subtract")) {
            num1 = Double.parseDouble(txt1.getText());
            answer = num1;
            txt1.setText(String.valueOf(answer));
            txt1.setText("");
            operator = "subtract";
        }
        
    }
    
    @FXML 
    void divOp(ActionEvent event){
        /*num1 = Integer.parseInt(txt1.getText());
        operator = "division"; 
        txt1.setText("");*/
        
        if (operator.equals("")){
            num1 = Double.parseDouble(txt1.getText());
            operator = "division";
            txt1.setText("");
            System.out.println("Testing1");
        }
        operator = "division";
        if (operator.equals("division")) {
            num1 = Double.parseDouble(txt1.getText());
            answer = num1;
            txt1.setText(String.valueOf(answer));
            txt1.setText("");
            operator = "division";
            System.out.println("Testing2");
        }
        
    }
    
    @FXML
    void clearOp(ActionEvent event){
        num1 = 0;
        answer = 0;
        answerDecimal = 0;
        operator = "";
        txt1.setText("");        
    }

}
