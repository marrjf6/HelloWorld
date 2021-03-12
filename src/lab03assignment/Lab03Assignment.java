
package lab03assignment;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Lab03Assignment extends Application{
    int count = 0;
    double strtX = 0, strtY = 0, endX = 0, endY = 0;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        //int stp = 2, size = 100;
        int space;
        //Line ln = new Line();
        //Circle circle1 = new Circle(50, 50, 25, Color.PURPLE);
        //Circle circle2 = new Circle(100, 100, 25, Color.BLUE);
        Rectangle rect1 = new Rectangle(900, 900, Color.GREEN);
        Rectangle rect2 = new Rectangle(900, 400, Color.LIGHTBLUE);
        
        //Roof
        Polygon roof = new Polygon(
                450.0, 0.0,
                100.0, 170.0,
                800.0, 170.0);
        roof.setFill(Color.WHITE);
        roof.setStroke(Color.BLACK);
        
        //Rectangle below roof
        Rectangle roofBoot = new Rectangle(150.0, 170.0, 600, 35);
        roofBoot.setFill(Color.WHITE);
        roofBoot.setStroke(Color.BLACK);
        
        //Red House itself
        Rectangle house = new Rectangle(150, 205, 600, 550);
        house.setFill(Color.BROWN);
        house.setStroke(Color.BLACK);
        
        //Gray Window on house top center
        Rectangle window = new Rectangle(405, 240, 80, 55);
        window.setFill(Color.SILVER);
        window.setStroke(Color.BLACK);
        
        //Skinny rectangle below end pillars
        Rectangle pilEndLeft = new Rectangle(150, 610, 85, 6);
        Rectangle pilEndRight = new Rectangle(654, 610, 96, 6);
        pilEndLeft.setFill(Color.SILVER);
        pilEndLeft.setStroke(Color.BLACK);
        pilEndRight.setFill(Color.SILVER);
        pilEndRight.setStroke(Color.BLACK);
        
        
        Group gp = new Group(rect1, rect2, roof, roofBoot, house, window, pilEndLeft, pilEndRight);
        
                
        //Pillars
        space = 163;
        Rectangle[] pils = new Rectangle[4];
        for (int i = 0; i < 4; i++){
            pils[i] = new Rectangle(175+i*space, 205, 50, 400);
            pils[i].setFill(Color.WHITE);
            pils[i].setStroke(Color.BLACK);
            gp.getChildren().add(pils[i]);
        }
        
        //Pillar Balls
        Circle[] cirsLeftSide = new Circle[4];
        for (int i = 0; i < 4; i++){
            cirsLeftSide[i] = new Circle(173+i*space, 220, 15);
            cirsLeftSide[i].setFill(Color.WHITE);
            cirsLeftSide[i].setStroke(Color.BLACK);
            gp.getChildren().add(cirsLeftSide[i]);
        }
        Circle[] cirsRightSide = new Circle[4];
        for (int i = 0; i < 4; i++){
            cirsRightSide[i] = new Circle(227+i*space, 220, 15);
            cirsRightSide[i].setFill(Color.WHITE);
            cirsRightSide[i].setStroke(Color.BLACK);
            gp.getChildren().add(cirsRightSide[i]);
        }
        
        //Pillar Feet
        Rectangle[] pilFeet = new Rectangle[4];
        for (int i = 0; i < 4; i++){
            pilFeet[i] = new Rectangle(165+i*space, 590, 70, 20);
            pilFeet[i].setFill(Color.WHITE);
            pilFeet[i].setStroke(Color.BLACK);
            gp.getChildren().add(pilFeet[i]);
        }
        
        //3 Doors
        Rectangle[] door = new Rectangle[3];
        for (int i = 0; i < 3; i++){
            door[i] = new Rectangle(240, 410, 82, 200);
            if (i == 1){
                door[i] = new Rectangle(240+i*space, 360, 82, 250);
            }
            if (i == 2){
                door[i] = new Rectangle(240+i*space, 410, 82, 200);
            }
            door[i].setFill(Color.WHITE);
            door[i].setStroke(Color.BLACK);
            gp.getChildren().add(door[i]);
        }
        
        //Door Windows
        int windowSpace = 20;        
        Rectangle[] doorWindow = new Rectangle[10];
        
        //First set of windows
        for (int i = 0; i < 10; i++){
            if(i%2 == 0)
            doorWindow[i] = new Rectangle(250, 420+i*windowSpace, 20 , 20);
            
            if(i%2 != 0)
                doorWindow[i] = new Rectangle(290, 400+i*windowSpace, 20, 20);
            gp.getChildren().add(doorWindow[i]);            
        }
        
        //Second set of windows
        for (int i = 0; i < 10; i++){
            if(i%2 == 0)
            doorWindow[i] = new Rectangle(250+space, 420+i*windowSpace, 20 , 20);
            
            if(i%2 != 0)
                doorWindow[i] = new Rectangle(290+space, 400+i*windowSpace, 20, 20);
            gp.getChildren().add(doorWindow[i]);            
        }
        
        //Third set of Windows
        for (int i = 0; i < 10; i++){
            if(i%2 == 0)
            doorWindow[i] = new Rectangle(250+space*2, 420+i*windowSpace, 20 , 20);
            
            if(i%2 != 0)
                doorWindow[i] = new Rectangle(290+space*2, 400+i*windowSpace, 20, 20);
            gp.getChildren().add(doorWindow[i]);            
        }
        
        
        //Stairs
        int stairSpace = 14;
        Rectangle[] stairs = new Rectangle[11];
        for (int i = 0; i < 11; i++){
            stairs[i] = new Rectangle(235-i*stairSpace, 610+i*stairSpace, 420+2*i*stairSpace, 14);
            stairs[i].setFill(Color.SILVER);
            stairs[i].setStroke(Color.BLACK);
            gp.getChildren().add(stairs[i]);
        }
    
        Scene sn = new Scene(gp, 900, 900);
        stage.setScene(sn);
        stage.show();
        
        
    }
}
