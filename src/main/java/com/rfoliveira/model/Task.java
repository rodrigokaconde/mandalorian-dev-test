package com.rfoliveira.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task {
    String title;
    String description;

    public Task(String key, String description) {
        this.title = key;
        this.description = description;
    }

    public Task() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean checkTitle(){
        return (this.title.length()>=10 && checkSpecialCharacter(this.title));
    }

    private boolean checkSpecialCharacter(String stringCheck) {
        Pattern pattern = Pattern.compile("^[ 0-9a-zA-ZáàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ\b]+$");
        Matcher matcher = pattern.matcher(stringCheck);
        return matcher.matches();
    }
}
