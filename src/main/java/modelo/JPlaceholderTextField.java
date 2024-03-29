package modelo;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JTextField;

@SuppressWarnings("serial")
public class JPlaceholderTextField extends JTextField {
    private String ph;
    Font fuenteArial18Normal=new Font("Arial", 0, 18);

    public JPlaceholderTextField(String ph) {
        this.ph = ph;
    }
    public JPlaceholderTextField() {
        this.ph = null;
    }

    @Override
    public String getText() {
        String text = super.getText();

        if (text.trim().length() == 0 && ph != null) {
            text = ph;
        }

        return text;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (super.getText().length() > 0 || ph == null) {
            return;
        }

        Graphics2D g2 = (Graphics2D) g;

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(super.getDisabledTextColor());
        g2.setFont(fuenteArial18Normal);
        g2.drawString(ph, getInsets().left, g.getFontMetrics().getAscent() + getInsets().top);
    }
}