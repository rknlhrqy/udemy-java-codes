package com.keningren;

import com.keningren.datamodel.ToDoData;
import com.keningren.datamodel.ToDoItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

public class Controller {
    private List<ToDoItem> toDoItemList;
    @FXML
    private ListView<ToDoItem> toDoListView;

    @FXML
    private TextArea itemDetails;

    @FXML
    private Label deadLineLabel;

    @FXML
    private BorderPane mainBorderPane;

    public void initialize() {
        // Need to comment out when readin from file at boot-up
        /*
        toDoItemList = new ArrayList<>();

        ToDoItem item = new ToDoItem("Mail birthday card",
                "Buy a 30th birthday card for John",
                LocalDate.of(2018, Month.MAY, 10));
        toDoItemList.add(item);

        item = new ToDoItem("Doctor's appointment",
                "See Dr. Smith at 123 Main Street. Bring paperwork",
                LocalDate.of(2018, Month.MAY, 19));
        toDoItemList.add(item);

        item = new ToDoItem("Finish Design Proposal for client",
                "I promised Mike I'd email website mockups by Friday 22nd May",
                LocalDate.of(2018, Month.MAY, 22));
        toDoItemList.add(item);

        item = new ToDoItem("Pick up Doug at the train station",
                "Doug's arrival on May 24 on the 5PM train",
                LocalDate.of(2018, Month.MAY, 24));
        toDoItemList.add(item);

        item = new ToDoItem("Pick up Dry cleaning",
                "The clothes shoudl be ready by 26th",
                LocalDate.of(2018, Month.MAY, 27));
        toDoItemList.add(item);

        ToDoData.getInstance().setToDoItemList(toDoItemList);
        */

        toDoListView.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                if( newValue != null ) {
                    ToDoItem item = toDoListView.getSelectionModel().getSelectedItem();
                    itemDetails.setText(item.getDetails());
                    //deadLineLabel.setText(item.getDeadline().toString());



                    DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM d, yyyy");
                    deadLineLabel.setText(df.format(item.getDeadline()));
                }
            }
        });

        //Populate the list into FXML
        // Need to comment out when reading from file during bootup.
        //toDoListView.getItems().setAll(toDoItemList);
        // Need to enable when reading from file during boot-up
        toDoListView.getItems().setAll(ToDoData.getInstance().getToDoItemList());



        //Make sure only one item is selected at a time in the list.
        toDoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        toDoListView.getSelectionModel().selectFirst();
    }

    @FXML
    public void showNewItemDialog() {
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainBorderPane.getScene().getWindow());

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("toDoItemDialog.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
            //Parent root = FXMLLoader.load(getClass().getResource("toDoItemDialog.fxml"));
            //dialog.getDialogPane().setContent(root);
        } catch (IOException e) {
            System.out.println("Could not load the dialog");
            e.printStackTrace();
            return;
        }

        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> result = dialog.showAndWait();
        DialogController controller = fxmlLoader.getController();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            controller.processResults();
            // Update the item list in FXML.
            toDoListView.getItems().setAll(ToDoData.getInstance().getToDoItemList());
            System.out.println("OK pressed");
        } else if (result.isPresent() && result.get() == ButtonType.CANCEL) {
            System.out.println("CANCEL pressed");
        }
    }

    @FXML
    public void handleClickListView() {
        ToDoItem item = toDoListView.getSelectionModel().getSelectedItem();
        //System.out.println("The selected item is: " + item);
        /*
        StringBuilder sb = new StringBuilder(item.getDetails());
        sb.append("\n\n\n\n");
        sb.append(item.getDeadline().toString());
        itemDetails.setText(sb.toString());
        */
        itemDetails.setText(item.getDetails().toString());
        deadLineLabel.setText(item.getDeadline().toString());
    }
}
