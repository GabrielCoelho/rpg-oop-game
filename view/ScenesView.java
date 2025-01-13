import javax.swing.*;
import java.awt.event.*;

/**
 * ScenesView
 */
public class ScenesView {
  private JFrame mainFrame;
  protected int scene = 0;
  private JButton nextButton = new JButton("next ->");
  private JButton prevButton = new JButton("<- prev");
  private JEditorPane storyline = new JEditorPane();
  private String test = "<html><body><h1 style=\"text-align: center\">Texto Estático</h1><p style=\"margin: 0.8px\">Este é um exemplo de JEditorPane que exibe texto estático.</p></body></html>";

  public ScenesView(JFrame mainf) {
    this.mainFrame = mainf;
  }

  public JButton addNextButton() {
    nextButton.setBounds(235, 420, 150, 40);
    return nextButton;
  }

  public JButton addPreviousButton() {
    prevButton.setBounds(5, 420, 150, 40);
    return prevButton;
  }

  public void createNewScene() {
    this.scene += 1;
    switch (this.scene) {
      case 1:
        storyline.setContentType("text/html");
        storyline.setText(test);
        storyline.setBounds(0, 0, 400, 400);
        storyline.setEditable(false);
        mainFrame.add(storyline);
        mainFrame.revalidate();
        mainFrame.repaint();
        break;

      default:
        System.out.println("Not enough scenes");
        break;
    }
  }

}
