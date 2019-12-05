package modelo;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class JPlaceholderPasswordField extends JPasswordField {
    private String ph;
    Font fuenteArial18Normal=new Font("Arial", 0, 18);

    public JPlaceholderPasswordField(String ph) {
        this.ph = ph;
    }
    public JPlaceholderPasswordField() {
        this.ph = null;
    }

    @Override
    public String getText() {
        String text = new String(super.getPassword());

        if (text.trim().length() == 0 && ph != null) {
            text = ph;
        }

        return text;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        String text = new String(super.getPassword());
	
        if (text.length() > 0 || ph == null) {
            return;
        }
	
        Graphics2D g2 = (Graphics2D) g;

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(super.getDisabledTextColor());
        g2.setFont(fuenteArial18Normal);
        g2.drawString(ph, getInsets().left, g.getFontMetrics().getAscent() + getInsets().top);
    }
}