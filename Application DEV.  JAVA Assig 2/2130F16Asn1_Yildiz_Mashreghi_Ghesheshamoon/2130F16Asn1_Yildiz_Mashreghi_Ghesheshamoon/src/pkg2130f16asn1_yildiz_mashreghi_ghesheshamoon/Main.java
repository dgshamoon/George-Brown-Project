/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2130f16asn1_yildiz_mashreghi_ghesheshamoon;

import assignment.arzu_negin_danial_flight;
import assignment.arzu_negin_danial_passanger;
import assignment.arzu_negin_danial_travel;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    Scene scene;		

    @Override
    public void start(Stage primaryStage) {
        GridPane root = new GridPane();					

        ArrayList flights = new ArrayList();			
        ArrayList passengers = new ArrayList();			

        Button flightBtn = new Button("Add Flight");		
        Button passengerBtn = new Button("Add Passenger");	
        Button showInfoBtn = new Button("Show Information");	
        Button removeFlightBtn = new Button("Delete Flight");	
        Button removePassengerBtn = new Button("Remove Passenger");		
        flightBtn.setOnAction(new EventHandler<ActionEvent>() {		
            @Override
            public void handle(ActionEvent event) {
                getFlightPane();		

            }

            private void getFlightPane() {		

                root.getChildren().clear();		
                Label flightSourceLbl = new Label("Flight Source");		
                TextField sourceTxt = new TextField();
                   	

                root.add(flightSourceLbl, 0, 0);				
                root.add(sourceTxt, 1, 0);						

                Label flightDestinationLbl = new Label("Flight Destination");

                TextField destinationTxt = new TextField() ;
                
                root.add(flightDestinationLbl, 0, 1);
                root.add(destinationTxt, 1, 1);

                Label dateLabel = new Label("Flight Date");
                DatePicker date = new DatePicker();			
                root.add(dateLabel, 0, 2);
                root.add(date, 1, 2);					
                Label flightNumLabel = new Label("Flight number");
                TextField flightNumTxt = new TextField();		
                root.add(flightNumLabel, 0, 3);
                root.add(flightNumTxt, 1, 3);

                Button saveBtn = new Button("Save");		
                Text errorTxt = new Text();    		
                root.add(saveBtn, 0, 4);
                root.add(errorTxt, 1, 4);
                
                StringBuilder messages = new StringBuilder();			
                saveBtn.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        if (sourceTxt.getText().length() == 0) {
                            messages.append("Enter Flight source\n");			
                        }
                        if (destinationTxt.getText().length() == 0) {
                            messages.append("Enter Flight Destination\n");
                        }
                        if (date.getValue() == null) {
                            messages.append("Enter Flight Date\n");
                        }
                        if (date.getValue().isBefore(LocalDate.now())) {        
                            messages.append("Flight Date is wrong");
                        }
                        if (flightNumTxt.getText().length() == 0) {		
                            messages.append("Enter flight number");
                        }
                        if (messages.toString().length() != 0) {
                            errorTxt.setText(messages.toString());
                            messages.delete(0, messages.toString().length());
                        } else {
                            assignment.arzu_negin_danial_flight flight0 = new assignment.arzu_negin_danial_flight();		
                            flight0.setSource(sourceTxt.getText());
                            flight0.setDestination(destinationTxt.getText());
                            flight0.setDot(date.getValue().toString());
                            flight0.setFlightNum(Integer.parseInt(flightNumTxt.getText()));		
                            flights.add(flight0);				

                            showMainItems();			
                        }
                    }

                    private void showMainItems() {
                        root.getChildren().clear();

                        root.add(flightBtn, 0, 0);
                        root.add(passengerBtn, 0, 1);
                        root.add(showInfoBtn, 0, 2);
                        root.add(removeFlightBtn, 0, 3);
                        root.add(removePassengerBtn, 0, 4);
                    }
                });
            }
        });
        passengerBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                getPassengerPane();
            }

            private void getPassengerPane() {
                root.getChildren().clear();
                Label firstNameLabel = new Label("First Name");
                TextField firstNameField = new TextField() {
                    @Override
                    public void replaceText(int start, int end, String text) {
                        // If the replaced text would end up being invalid, then simply
                        // ignore this call!
                        if (!text.matches("[0-9]")) {
                            super.replaceText(start, end, text);
                        }
                    }

                    @Override
                    public void replaceSelection(String text) {
                        if (!text.matches("[0-9]")) {
                            super.replaceSelection(text);
                        }
                    }
                };
                root.add(firstNameLabel, 0, 0);
                root.add(firstNameField, 1, 0);

                Label lastNameLabel = new Label("Last Name");
                TextField lastNameField = new TextField() {
                    @Override
                    public void replaceText(int start, int end, String text) {
                        // If the replaced text would end up being invalid, then simply
                        // ignore this call!
                        if (!text.matches("[0-9]")) {
                            super.replaceText(start, end, text);
                        }
                    }

                    @Override
                    public void replaceSelection(String text) {
                        if (!text.matches("[0-9]")) {
                            super.replaceSelection(text);
                        }
                    }
                };
                root.add(lastNameLabel, 0, 1);
                root.add(lastNameField, 1, 1);

                Label ageLabel = new Label("Age(1-100)");
                TextField ageField = new TextField() {
                    @Override
                    public void replaceText(int start, int end, String text) {
                        // If the replaced text would end up being invalid, then simply
                        // ignore this call!
                        if (!text.matches("[a-z]|[A-Z]") && Integer.parseInt(text)  < 100) {
                            super.replaceText(start, end, text);
                        }
                       
                    }

                    @Override
                    public void replaceSelection(String text) {
                        if (!text.matches("[a-z]|[A-Z]")) {
                            super.replaceSelection(text);
                        }
                    }
                };
                root.add(ageLabel, 0, 2);
                root.add(ageField, 1, 2);

                Label frequentFlyerLabel = new Label("Frequent Flyer Number[xxxxx]");
                TextField frequentFlyerField = new TextField();
                root.add(frequentFlyerLabel, 0, 3);
                root.add(frequentFlyerField, 1, 3);

                Label milesLabel = new Label("Miles");
                TextField milesField = new TextField();
                root.add(milesLabel, 0, 4);
                root.add(milesField, 1, 4);

                Button saveBtn = new Button("Save");
                Text errorTxt = new Text();
                root.add(saveBtn, 0, 5);
                root.add(errorTxt, 1, 5);
                StringBuilder messages = new StringBuilder();
                saveBtn.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        if (firstNameField.getText().length() == 0) {
                            messages.append("Enter first Name\n");
                        }
                        if (lastNameField.getText().length() == 0) {
                            messages.append("Enter last name\n");
                        }
                        if (ageField.getText().length() == 0) {
                            messages.append("Enter Age\n");
                        }
                        try {
                            int age = Integer.parseInt(ageField.getText());
                        } catch (NumberFormatException ex) {
                            messages.append("Bad Number format for age \n");
                        }
                        if (frequentFlyerField.getText().length() != 5) {
                            messages.append("Enter frequent flyer number\n");
                        }
                        try {
                            if (Integer.parseInt(milesField.getText()) <= 50) {
                                messages.append("Enter Mile \n");
                            }
                        } catch (NumberFormatException ex) {
                            messages.append("Bad Number format for miles \n");
                        }

                        if (messages.toString().length() != 0) {
                            errorTxt.setText(messages.toString());
                            messages.delete(0, messages.toString().length());
                        } else {
                            assignment.arzu_negin_danial_passanger passenger0 = new assignment.arzu_negin_danial_passanger();	
                            passenger0.setFirstName(firstNameField.getText());
                            passenger0.setLastName(lastNameField.getText());
                            passenger0.setAge(Integer.parseInt(ageField.getText()));
                            passenger0.setFrequetNum(Integer.parseInt(frequentFlyerField.getText()));
                            passenger0.setMiles(Integer.parseInt(milesField.getText()));
                            passengers.add(passenger0);			
                            showMainItems();			
                        }
                    }

                    private void showMainItems() {
                        
                        root.getChildren().clear();

                        root.add(flightBtn, 0, 0);
                        root.add(passengerBtn, 0, 1);
                        root.add(showInfoBtn, 0, 2);
                        root.add(removeFlightBtn, 0, 3);
                        root.add(removePassengerBtn, 0, 4);
                    }
                });
            }
        });
        showInfoBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                getInfoGroup();
            }

            private void getInfoGroup() {
                root.getChildren().clear();
                assignment.arzu_negin_danial_travel travel = new arzu_negin_danial_travel();
                
                
                
                Text txt = new Text();
                
                txt.setText(txt.getText() + "\n----------------------flights------------------------------");
                for (Object fl : flights) {				
                    arzu_negin_danial_flight flight0 = (arzu_negin_danial_flight) fl;		
                    txt.setText(txt.getText() + "\n" + arzu_negin_danial_travel.DisplayInfo(flight0));		
                    txt.setText(txt.getText() + "\n" + "Total fare with tax : " + arzu_negin_danial_travel.totalFare(flight0));
                    txt.setText(txt.getText() + "\n----------------------------------------------------");
                }

                txt.setText(txt.getText() + "\n----------------------passengers------------------------------");
                for (Object pass : passengers) {			
                    arzu_negin_danial_passanger passenger0 = (arzu_negin_danial_passanger) pass;		
                    txt.setText(txt.getText() + "\n" + arzu_negin_danial_travel.DisplayInfo(passenger0));		
                    txt.setText(txt.getText() + "\n----------------------------------------------------");
                }

//       
                root.add(txt, 0, 0);
                Button backBtn = new Button("Back");		
                root.add(backBtn, 0, 1);
                
                
                backBtn.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {

                        showMainItems();

                    }
                });

            }

            private void showMainItems() {
                root.getChildren().clear();

                root.add(flightBtn, 0, 0);
                root.add(passengerBtn, 0, 1);
                root.add(showInfoBtn, 0, 2);
                root.add(removeFlightBtn, 0, 3);
                root.add(removePassengerBtn, 0, 4);
            }
        });

        removeFlightBtn.setOnAction(new EventHandler<ActionEvent>() {		
            @Override
            public void handle(ActionEvent event) {
                root.getChildren().clear();
                Label flightNumLabel = new Label("Enter Flight Number");		
                TextField flightNumField = new TextField();		
                root.add(flightNumLabel, 0, 0);
                root.add(flightNumField, 1, 0);
                Button delBtn = new Button("delete");		
                root.add(delBtn, 0, 1);
                delBtn.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        int flightNum = Integer.parseInt(flightNumField.getText());
                        for (Object fl : flights) {				
                            arzu_negin_danial_flight flight0 = (arzu_negin_danial_flight) fl;
                            if (flight0.getFlightNum() == flightNum) {		
                                flights.remove(fl);		
                                showMainItems();		
                                return;
                            }

                        }
                        showMainItems();
                    }

                    private void showMainItems() {
                        root.getChildren().clear();

                        root.add(flightBtn, 0, 0);
                        root.add(passengerBtn, 0, 1);
                        root.add(showInfoBtn, 0, 2);
                        root.add(removeFlightBtn, 0, 3);
                        root.add(removePassengerBtn, 0, 4);
                    }
                });
            }
        });
        removePassengerBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                root.getChildren().clear();
                Label passengerNumLabel = new Label("Enter frequent Number");
                TextField frequentNumField = new TextField();		
                root.add(passengerNumLabel, 0, 0);
                root.add(frequentNumField, 1, 0);
                Button delBtn = new Button("delete");		
                root.add(delBtn, 0, 1);
                
                delBtn.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        
                        int frequentNum = Integer.parseInt(frequentNumField.getText());
                        
                        for (Object fl : passengers) {
                            
                            arzu_negin_danial_passanger passenger0 = (arzu_negin_danial_passanger) fl;
                            
                            if (passenger0.getFrequetNum() == frequentNum) {
                                
                                passengers.remove(fl);		
                                showMainItems();
                                return;
                            }

                        }
                        showMainItems();
                    }

                    private void showMainItems() {
                        root.getChildren().clear();

                        root.add(flightBtn, 0, 0);
                        root.add(passengerBtn, 0, 1);
                        root.add(showInfoBtn, 0, 2);
                        root.add(removeFlightBtn, 0, 3);
                        root.add(removePassengerBtn, 0, 4);
                    }
                });
            }
        });
        Group group = CreateLogo();

        root.setPadding(new Insets(5, 5, 5, 5));		
        root.setVgap(5);			

        root.getChildren().clear();

        root.add(flightBtn, 0, 0);
        root.add(passengerBtn, 0, 1);
        root.add(showInfoBtn, 0, 2);
        root.add(removeFlightBtn, 0, 3);
        root.add(removePassengerBtn, 0, 4);

        scene = new Scene(root, 500, 450);			

        primaryStage.setTitle("Dragonite AirLines");		
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    private Group CreateLogo() {
        Text text = new Text();
        text.setText("<>=======()\n"
                + "(/\\___   /|\\\\          ()==========<>_\n"
                + "      \\_/ | \\\\        //|\\   ______/ \\)\n"
                + "        \\_|  \\\\      // | \\_/\n"
                + "          \\|\\/|\\_   //  /\\/\n"
                + "           (oo)\\ \\_//  /\n"
                + "          //_/\\_\\/ /  |\n"
                + "        @@/  |=\\  \\  |\n"
                + "             \\_=\\_ \\ |\n"
                + "                \\==\\ \\|\\_ \n"
                + "             __(\\===\\(  )\\\n"
                + "            (((~) __(_/   |\n"
                + "                 (((~) \\  / \n"
                + "                 ______/ /\n"
                + "                '------'\n"
                + "\"Welcome to Dragonite Airlines. Please Enter Your Info\"");
        return new Group(text);}
    
    private String printLogo()
    {
        return "<>=======()\n"
                + "(/\\___   /|\\\\          ()==========<>_\n"
                + "      \\_/ | \\\\        //|\\   ______/ \\)\n"
                + "        \\_|  \\\\      // | \\_/\n"
                + "          \\|\\/|\\_   //  /\\/\n"
                + "           (oo)\\ \\_//  /\n"
                + "          //_/\\_\\/ /  |\n"
                + "        @@/  |=\\  \\  |\n"
                + "             \\_=\\_ \\ |\n"
                + "                \\==\\ \\|\\_ \n"
                + "             __(\\===\\(  )\\\n"
                + "            (((~) __(_/   |\n"
                + "                 (((~) \\  / \n"
                + "                 ______/ /\n"
                + "                '------'\n";
                //+ "\"Welcome to Dragonite Airlines. Please Enter Your Info\"";
    
    }

    }


