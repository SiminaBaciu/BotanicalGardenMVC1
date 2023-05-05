package controller;

import model.Languages;
import model.TranslatedFields;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Observable;

public class Language extends Observable {
    private Languages selectedLanguage;
    private TranslatedFields fields;

    public Language(){
        setSelectedLanguage(Languages.ENGLISH);
    }

    public Languages getSelectedLanguage() {
        return selectedLanguage;
    }

    public void setSelectedLanguage(Languages selectedLanguage) {
        String fileName = selectedLanguage.toString().toLowerCase() + ".txt";
        try {
            String text = new String(Files.readAllBytes(Path.of(fileName)), StandardCharsets.UTF_8);
            String[] lines = text.split("\\n");
            //fields = new TranslatedFields(lines[0], lines[1], lines[2], lines[3], lines[4], lines[5], lines[6], lines[7], lines[8]);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        this.selectedLanguage = selectedLanguage;
        setChanged();
        notifyObservers();
    }

    public TranslatedFields getFields() {
        return fields;
    }
}
