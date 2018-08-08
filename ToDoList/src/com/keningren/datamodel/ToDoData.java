package com.keningren.datamodel;

import javafx.collections.FXCollections;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;

public class ToDoData {
    private static ToDoData instance = new ToDoData();

    private static String filename = "ToDoListItems.txt";
    private List<ToDoItem> toDoItemList;
    private DateTimeFormatter formatter;

    public static ToDoData getInstance() {
        return instance;
    }

    // private constructor.
    private ToDoData() {
        this.formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    }

    public List<ToDoItem> getToDoItemList() {
        return toDoItemList;
    }

    public void setToDoItemList(List<ToDoItem> toDoItemList) {
        this.toDoItemList = toDoItemList;
    }

    public void loadToDoItems() throws IOException {
        toDoItemList = FXCollections.observableArrayList();
        Path path = Paths.get(filename);
        BufferedReader br = Files.newBufferedReader(path);
        String input;

        try {
            while ((input = br.readLine()) != null) {
                String[] itemPieces = input.split("\t");
                String shortDescription = itemPieces[0];
                String details = itemPieces[1];
                String dateString = itemPieces[2];

                LocalDate date = LocalDate.parse(dateString, formatter);
                ToDoItem item = new ToDoItem(shortDescription, details, date);
                toDoItemList.add(item);
            }
        } finally {
            if (br != null) {
                br.close();
            }
        }
    }

    public void storeToDoItems() throws IOException {
        Path path = Paths.get(filename);
        BufferedWriter bw = Files.newBufferedWriter(path);
        try {
            Iterator<ToDoItem> itr = toDoItemList.iterator();
            while (itr.hasNext()) {
                ToDoItem item = itr.next();
                bw.write(String.format("%s\t%s\t%s",
                        item.getShortDescription(),
                        item.getDetails(),
                        item.getDeadline().format(formatter)));
                bw.newLine();
            }
        } finally {
            if (bw != null) {
                bw.close();
            }
        }
    }

    public void addToDoItems(ToDoItem item) {
        toDoItemList.add(item);
    }

    public List<ToDoItem> getToDoItems() {
        return toDoItemList;
    }
}
