package Views;

import javax.swing.*;
import java.awt.*;

public class LabelContainer extends JPanel{

    static int QUESTIONS_CONTAINER = 0;
    static int COURSES_CONTAINER = 0;
    private String title;
    private JLabel questionsText;
    private GridBagConstraints constraints;

    LabelContainer(String title, int labelType){

        this.title = title;
        
        setLayout(new GridBagLayout());
        setBackground(new Color(255,255,255));
        constraints = new GridBagConstraints();

        addQuestionSummaryTitle();
        addScrollableQuestionsSummaryPanel();

    }

    private void addQuestionSummaryTitle () {

        questionsText = new JLabel(title);

        questionsText.setFont(new Font("Futura", Font.BOLD, 32));
        questionsText.setForeground(new Color(61,90,128));

        constraints.insets = new Insets(16, 20, 16, 80);
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 1.0;
        constraints.anchor = GridBagConstraints.WEST;

        add(questionsText, constraints);

    }

    private void addScrollableQuestionsSummaryPanel(){

        JScrollPane auxiliarPanel = new JScrollPane(new ScrollableLabelPanel(ScrollableLabelPanel.QUESTIONS_SCROLL));

        constraints.anchor = GridBagConstraints.CENTER;

        constraints.gridy = 1;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.insets = new Insets(0, 20, 0, 20);
        constraints.anchor = GridBagConstraints.NORTH;

        auxiliarPanel.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        auxiliarPanel.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        auxiliarPanel.setBorder(null);

        add(auxiliarPanel, constraints);

    }
}