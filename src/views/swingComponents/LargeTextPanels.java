package views.swingComponents;

import javax.swing.*;
import java.awt.*;

public class LargeTextPanels extends JPanelRound{
    
    JScrollPane textScrollPane;
    JTextArea textArea;
    GridBagConstraints constraints = new GridBagConstraints();

    LargeTextPanels(String text, Color c){
        setRoundBackgroundColor(c);
        setLayout(new GridBagLayout());
        textArea = new JTextArea();

        textArea.setText(text);
        textArea.setBorder(null);
        textArea.setBackground(c);
        textArea.setLineWrap(true);

        textScrollPane = new JScrollPane(textArea);
        
        textScrollPane.setBorder(null);
        textScrollPane.setLayout(new ScrollPaneLayout());

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.anchor = GridBagConstraints.NORTH;
        constraints.insets = new Insets(10, 15, 15, 15);

        add(textScrollPane, constraints);

    }
}