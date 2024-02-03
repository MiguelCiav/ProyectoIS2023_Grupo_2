package views.swingComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import views.listeners.GoToTestView;


public class LabelSummary extends JPanelRound implements MouseListener{

    static final int QUESTION_SUMMARY = 0;
    static final int COURSE_SUMMARY = 1;
    
    int questionNumber;
    String questionSummary;
    JTextArea questionSummaryLabel = new JTextArea();
    JLabel testLabel = new JLabel();
    JLabel arrowLabel;
    GridBagConstraints constraints = new GridBagConstraints();

    public LabelSummary(int questionNumber, String questionSummary){
        
        this.questionNumber = questionNumber;
        this.questionSummary = questionSummary;

        setLayout(new GridBagLayout());
        setBackground(new Color(216,233,241));
        addMouseListener(this);

        setQuestionSummaryLabel();
        addQuestionSummaryLabel();

    }

    public LabelSummary(String testTitle){

        setLayout(new GridBagLayout());
        setBackground(new Color(216,233,241));

        setTestLabel();
        addTestLabel();

    }

    private void setTestLabel(){

        testLabel.setBackground(new Color(216,233,241));
        testLabel.setOpaque(true);
        testLabel.setFont(new Font("Futura", Font.PLAIN, 12));
        testLabel.setFocusable(false);
        testLabel.setText("TEST");

        arrowLabel = new JLabel(new ImageIcon(getClass().getResource("../img/testListView/siguiente.png")));

    }

    private void addTestLabel(){

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(16, 16, 16, 16);

        add(testLabel, constraints);

        constraints.gridx = 1;
        constraints.anchor = GridBagConstraints.EAST;

        add(arrowLabel, constraints);

        arrowLabel.addMouseListener(new GoToTestView());

    }

    private void setQuestionSummaryLabel(){

        questionSummaryLabel.setBackground(new Color(216,233,241));
        questionSummaryLabel.setFont(new Font("Futura", Font.PLAIN, 12));
        questionSummaryLabel.setEditable(false);
        questionSummaryLabel.setFocusable(false);
        questionSummaryLabel.setLineWrap(true);
        questionSummaryLabel.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce quis odio vitae velit pretium ultrices. Nam ut velit ac dui elementum pharetra. Morbi id egestas ex. Proin ac iaculis orci, at viverra ex. Vestibulum eget feugiat ligula, et ultrices purus. Aliquam dignissim ligula nibh, sed gravida mi mollis eget. Morbi.");

    }
    
    private void addQuestionSummaryLabel(){

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.anchor = GridBagConstraints.NORTHWEST;
        constraints.insets = new Insets(16, 16, 16, 16);

        JScrollPane auxiliarPane = new JBlueScrollPane(questionSummaryLabel);
        auxiliarPane.setBorder(null);
        auxiliarPane.setPreferredSize(new Dimension(200,60));
        
        auxiliarPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        auxiliarPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
        add(auxiliarPane, constraints);

    }

    @Override public void mouseClicked(MouseEvent e){

        setBackground(new Color(143, 179, 227));
        questionSummaryLabel.setBackground(new Color(143, 179, 227));

    }

    @Override public void mousePressed(MouseEvent e){}
    @Override public void mouseReleased(MouseEvent e){}
    @Override public void mouseEntered(MouseEvent e){}
    @Override public void mouseExited(MouseEvent e){}

}