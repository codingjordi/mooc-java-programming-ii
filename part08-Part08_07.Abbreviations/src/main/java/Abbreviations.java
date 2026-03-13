
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Abbreviations {

    private HashMap<String, String> abbreviations;
    
    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        String sanitizedAbb = sanitizedString(abbreviation);
        String sanitizedExp = sanitizedString(explanation);

        if (!sanitizedAbb.isEmpty() && !sanitizedExp.isEmpty()) {
            this.abbreviations.put(sanitizedAbb, sanitizedExp);
        }

    }

    public boolean hasAbbreviation(String abbreviation) {
        if (this.abbreviations.containsKey(abbreviation)) {
            return true;
        } else {
            return false;
        }
    }

    public String findExplanationFor(String abbreviation) {
        String search = this.abbreviations.get(abbreviation);

        if (search != null) {
            return search;
        } else {
            return null;
        }
    }

    public static String sanitizedString(String string) {
        if (string == null) {
            return "";
        }

        string = string.toLowerCase();
        return string.trim();
    }

}
