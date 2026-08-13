


package employee.management.system;

import java.awt.*;
import javax.swing.*;

public class RoundedButton extends JButton {

    public RoundedButton(String text) {

        super(text);

        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setForeground(Color.WHITE);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setFont(new Font("Segoe UI", Font.BOLD, 16));
    }

    @Override
    protected void paintComponent(Graphics g) {

        Graphics2D g2 = (Graphics2D) g.create();

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        GradientPaint gp = new GradientPaint(
                0,
                0,
                getBackground(),
                getWidth(),
                getHeight(),
                getBackground().darker());

        g2.setPaint(gp);

        g2.fillRoundRect(0,0,getWidth(),getHeight(),25,25);

        super.paintComponent(g2);

        g2.dispose();
    }

    @Override
    protected void paintBorder(Graphics g) {

        Graphics2D g2=(Graphics2D)g;

        g2.setColor(new Color(220,220,220));

        g2.drawRoundRect(0,0,getWidth()-1,getHeight()-1,25,25);

    }
}