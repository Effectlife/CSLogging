
package be.effectlife.cslogging.dto;

import java.util.List;

public class CSLoggingDTO {

    private List<Character> characters;
    private String csLogging;

    public List<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }

    public String getCsLogging() {
        return csLogging;
    }

    public void setCsLogging(String csLogging) {
        this.csLogging = csLogging;
    }

}
