package berg;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Fenster extends Application {
    
    private StackPane root;
    private GridPane myWindow;
    private Button start1;
    private Button start2;
    private Button einfuegen;
    private Button loeschen;
    private Button aendern;
    private Button anzeigen;
    private Label label1;
    private Label label2;
    private Label label3;
    private Label label4;
    private Label label5;
    private Label label6;
    private Label label7;
    private Label label8;
    private Label label9;
    private Label label10;
    private Label label11;
    private Label label12;
    private Label label13;
    private Label label14;
    private TextField anzahlRechnungen;
    private TextField bNrEinfuegen;
    private TextField aNr;
    private TextField kNr;
    private TextField verkaufsdatum;
    private TextField anzahl;
    private TextField bNrLoeschen;
    private TextField bNrAendern;
    private RadioButton bezahlt;
    private RadioButton unbezahlt;
    private ToggleGroup group;
    private ComboBox<String> combo;
    private Label leer1 = new Label();
    private Label leer2 = new Label();
    private Label leer3 = new Label();
    private Label leer4 = new Label();
    private Label leer5 = new Label();
    private Label leer6 = new Label();
  
    @Override
        public void start(Stage primaryStage) {
        root = new StackPane();
        primaryStage.setScene(new Scene(root, 500, 620));
        primaryStage.setTitle("Datenbankzugriff");

        myWindow = new GridPane();
        myWindow.setVgap(5);
        myWindow.setHgap(5);
        myWindow.setPadding(new Insets(10));

        label1 = new Label("Auswertung der Datenbank Berg");
        label2 = new Label("Datenbankabfrage bezahlt/unbezahlte Rechnungen");
        bezahlt = new RadioButton("bezahlte Rechnungen");
        unbezahlt = new RadioButton("unbezahlte Rechnungen");
        group = new ToggleGroup();
        bezahlt.setToggleGroup(group);
        unbezahlt.setToggleGroup(group);
        bezahlt.setSelected(true);
        start1 = new Button("Start");
        label3 = new Label("Anzahl der Rechnungen:");
        anzahlRechnungen = new TextField();
        
        label4 = new Label("Datenbankabfrage: Bestellungen nach Artikelnummer");
        combo = new ComboBox<String>();
        combo.getItems().addAll("10xxx", "20xxx", "30xxx", "40xxx");
        combo.setValue("10xxx");
        start2 = new Button("Start");

        label5 = new Label("Einfügen eines neuen Datensatzes");
        label6 = new Label("Bestellnummer:");
        label7 = new Label("Artikelnummer:");
        label8 = new Label("Kundennummer:");
        label9 = new Label("Verkaufsdatum:");
        label10 = new Label("Anzahl:");
        bNrEinfuegen = new TextField();
        aNr = new TextField();
        kNr = new TextField();
        verkaufsdatum = new TextField();
        anzahl = new TextField();
        einfuegen = new Button("Einfuegen");
        
        label11 = new Label("Datensatz löschen");
        label12 = new Label("Bestellnummer:");
        bNrLoeschen = new TextField();
        loeschen = new Button("Löschen");
        
        label13 = new Label("Zahlung einer Rechnung");
        label14 = new Label("Bestellnummer:");
        bNrAendern = new TextField();
        aendern = new Button("Ändern");
        
        anzeigen = new Button("Alle Datensätze anzeigen");
              
        myWindow.add(label1, 0, 0, 2, 1);
        myWindow.add(leer1, 0, 1);
        myWindow.add(label2, 0, 2, 2, 1);
        myWindow.add(bezahlt, 0, 3);
        myWindow.add(unbezahlt, 0, 4);
        myWindow.add(label3, 0, 5);
        myWindow.add(start1, 2, 5);
        myWindow.add(anzahlRechnungen, 1, 5);
        myWindow.add(leer2, 0, 6);
        
        myWindow.add(label4, 0, 7, 2, 1);
        myWindow.add(combo, 0, 8);
        myWindow.add(start2, 2, 8);
        myWindow.add(leer3, 0, 9);
        
        myWindow.add(label5, 0, 10, 2, 1);
        myWindow.add(label6, 0, 11);
        myWindow.add(label7, 0, 12);
        myWindow.add(label8, 0, 13);
        myWindow.add(label9, 0, 14);
        myWindow.add(label10, 0, 15);
        myWindow.add(bNrEinfuegen, 1, 11);
        myWindow.add(aNr, 1, 12);
        myWindow.add(kNr, 1, 13);
        myWindow.add(verkaufsdatum, 1, 14);
        myWindow.add(anzahl, 1, 15);
        myWindow.add(einfuegen, 2, 15);
        myWindow.add(leer4, 0, 16);
        
        myWindow.add(label11, 0, 17);
        myWindow.add(label12, 0, 18);
        myWindow.add(bNrLoeschen, 1, 18);
        myWindow.add(loeschen, 2, 18);
        myWindow.add(leer5, 0, 19);
        
        myWindow.add(label13, 0, 20);
        myWindow.add(label14, 0, 21);
        myWindow.add(bNrAendern, 1, 21);
        myWindow.add(aendern, 2, 21);
        myWindow.add(leer6, 0, 22);
        
        myWindow.add(anzeigen, 2, 23);
        
        start1.setMinSize(150, 25);
        start2.setMinSize(150, 25);
        einfuegen.setMinSize(150, 25);
        loeschen.setMinSize(150, 25);
        aendern.setMinSize(150, 25);
        anzeigen.setMinSize(150, 25);
                
        root.getChildren().add(myWindow);
        primaryStage.show();
        Presenter.start(this);
    }

    public static void main(String[] args) {
        launch(args);
    }

    public void setAnzahlRechnungen(String ergebnis) {
        anzahlRechnungen.setText(ergebnis);
    }
    
    public Button getStart1() {
        return start1;
    }

    public Button getStart2() {
        return start2;
    }

    public Button getEinfuegen() {
        return einfuegen;
    }

    public Button getLoeschen() {
        return loeschen;
    }

    public Button getAendern() {
        return aendern;
    }

    public Button getAnzeigen() {
        return anzeigen;
    }
    
    public RadioButton getBezahlt() {
        return bezahlt;
    }
    
    public RadioButton getUnbezahlt() {
        return unbezahlt;
    }
    
    public ComboBox<String> getCombo() {
        return combo;
    }
    
    public TextField getBNrEinfuegen() {
        return bNrEinfuegen;
    }
    
    public TextField getANr() {
        return aNr;
    }
    
    public TextField getKNr() {
        return kNr;
    }
    
    public TextField getVerkaufsdatum() {
        return verkaufsdatum;
    }
    
    public TextField getAnzahl() {
        return anzahl;
    }
    
    public TextField getBNrLoeschen() {
        return bNrLoeschen;
    }
    
    public TextField getBNrAendern() {
        return bNrAendern;
    }
}
