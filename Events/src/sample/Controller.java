package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
public class Controller {
    @FXML
    private TextField nameField;
    @FXML
    private Button helloButton;
    @FXML
    private Button byeButton;
    @FXML
    private CheckBox checkBox;
    @FXML
    private Label ourLabel;

    // initialize() is called automatically when Controller class is initialized.
    @FXML
    public void initialize() {
        helloButton.setDisable(true);
        byeButton.setDisable(true);
    }

    @FXML
    public void onButtonClicked(ActionEvent e) {
        if (e.getSource().equals(helloButton)) {
            System.out.println("Hello " + nameField.getText());
        } else if (e.getSource().equals(byeButton)) {
            System.out.println("Bye " + nameField.getText());
        }

        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    String s = Platform.isFxApplicationThread()?"UI Thread":"non-UI Thread";
                    System.out.println("I am running on " + s);
                    Thread.sleep(10);
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            String s = Platform.isFxApplicationThread()?"UI Thread":"non-UI Thread";
                            System.out.println("I am running on " + s);

                            ourLabel.setText("We did something");
                        }
                    });
                } catch (InterruptedException event) {
                    // We do not care about this.
                }
            }
        };
        new Thread(task).start();

        if (checkBox.isSelected()) {
            nameField.clear();
            helloButton.setDisable(true);
            byeButton.setDisable(true);
        }
    }

    @FXML
    public void handleKeyReleased() {
        String text = nameField.getText();
        boolean disableButton = text.isEmpty() || text.trim().isEmpty();
        helloButton.setDisable(disableButton);
        byeButton.setDisable(disableButton);
    }

    @FXML
    public void handleChange() {
        System.out.println("The CheckBox is " + (checkBox.isSelected()?"checked" : "unchecked"));
    }
}
