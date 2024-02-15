package main.views.frames;

import javax.swing.*;

import main.views.components.*;

import java.awt.*;

public class CreateTestView extends JFrame{

    private PrincipalPanel mainPanel = new PrincipalPanel();
    private DoublePanel createTestPanel;
    private TestDataPanel testDataPanel = new TestDataPanel();
    private QuestionsAndAnswersPanel questionsAndAnswersPanel = new QuestionsAndAnswersPanel();


    public CreateTestView(){
        super("Uhuru: Create test");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setMinimumSize(new Dimension(800,600));
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        testDataPanel.setMaximumSize(new Dimension(500,500));
        createTestPanel = new DoublePanel(testDataPanel, questionsAndAnswersPanel);
        add(createTestPanel);

        setVisible(true);
    }
}