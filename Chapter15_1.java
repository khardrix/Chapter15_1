/*********************************************************************************************************************
 *********************************************************************************************************************
 *****                                          Chapter 15: Problem 1                                            *****
 *****___________________________________________________________________________________________________________*****
 *****    1.  Write a program which uses the Timeline class to generate ActionEvents in which, for each event,   *****
 *****                   increments a variable, count, and outputs it via System.out.println.                    *****
 *****              Start with a duration of 100 and adjust the duration downward (make it faster).              *****
 *****                              A duration of 0.1 will make the numbers fly by.                              *****
 *****-----------------------------------------------------------------------------------------------------------*****
 *****                     NOTE: For this program, you do not need a Pane or Scene object,                       *****
 *****                               and you do not have to show the primaryStage.                               *****
 *********************************************************************************************************************
 *********************************************************************************************************************/

// IMPORTS of needed tools and plug-ins
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class Chapter15_1 extends Application {

    private int count;
    private double timing;
    private Timeline animation;

    public static void main(String[] args) {

        launch(args);
    }

    public void play(){

        animation.play();
    }

    @Override
    public void start(Stage primaryStage){

        count = 0;
        timing = 100.0;


        animation = new Timeline(new
                KeyFrame(Duration.millis(timing),
                e -> {
                    timing -= 0.1;
                    count++;
                    System.out.println(count);
                }
        ));

        animation.setCycleCount(100);
        animation.play();
    }
}
