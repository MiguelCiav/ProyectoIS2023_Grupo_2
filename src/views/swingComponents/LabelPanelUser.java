package views.swingComponents;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class LabelPanelUser extends LabelPanel{

    private String username;
    private JLabel textLabel;
    private JLabel imageLabel;

    public LabelPanelUser(String username){

        this.username = username;

        constraints = new GridBagConstraints();
        setLayout(new GridBagLayout());
        setBackground(new Color(216,233,241));

        setLabel();
        addLabel();

    }

    @Override
    protected void setLabel() {

        textLabel = new JLabel();

        textLabel.setBackground(new Color(216,233,241));
        textLabel.setOpaque(true);
        textLabel.setFont(new Font("Futura", Font.PLAIN, 12));
        textLabel.setFocusable(false);
        textLabel.setText(username);

        imageLabel = new JLabel(new ImageIcon(getClass().getResource(new PathManager().setFileLink("../img/UsersListView/smallUserIcon.png"))));

    }

    @Override
    protected void addLabel() {

        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 1.0;
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(16, 16, 16, 16);

        add(imageLabel,constraints);

        constraints.gridx = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.insets = new Insets(16, 0, 16, 16);

        add(textLabel, constraints);
        
    }
    
}
