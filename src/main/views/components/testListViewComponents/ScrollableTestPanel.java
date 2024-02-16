package main.views.components.testListViewComponents;

import java.awt.Dimension;
import javax.swing.Box;

import main.views.components.ScrollablePanel;

public class ScrollableTestPanel extends ScrollablePanel{

    private static ScrollableTestPanel instance;

    private ScrollableTestPanel(){
        super();
        addScrollableElements();
    }

    public static ScrollableTestPanel getInstance(){

        if(instance == null){
            instance = new ScrollableTestPanel();
        }

        return instance;
    }

    public static void loadExams(String CourseID){

        
    }

    @Override
    protected void addScrollableElements(){
        for(int i = 0; i < 5; i++){
            add(new LabelPanelTest("Test " + String.valueOf(i), i));
            add(Box.createRigidArea(new Dimension(0,20)));
        } 
    }
}