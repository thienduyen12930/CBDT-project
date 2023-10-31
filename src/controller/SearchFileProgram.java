
package controller;

import view.Menu;
import common.Algorithm;

public class SearchFileProgram extends Menu<String> {
    static String[] options = {"Count Word In File", "Find File By Word", "Exit"};
    Algorithm ar;
    public SearchFileProgram() {
        super("========== Word Program ==========", options);
        ar = new Algorithm();
    }

    @Override
    public void execute(int n) {
        switch(n) {
            case 1 :
                ar.countWordInFile();
                break;
            case 2 :
                ar.findFileByWord();
                break;
            case 3 :
                System.exit(0);
                break;
        }
    }
    
}
