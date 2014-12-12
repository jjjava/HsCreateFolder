package br.com.schumaker.model;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author hudson.sales
 */
public class Folders {

    private static final Folders INSTANCE = new Folders();
    private File pathFile;
    private File outPath;
    private ArrayList<String> dirNames;

    private Folders() {
        dirNames = new ArrayList<>();
    }

    public static Folders getInstance() {
        return INSTANCE;
    }

    public File getPathFile() {
        return pathFile;
    }

    public void setPathFile(File pathFile) {
        this.pathFile = pathFile;
    }

    public File getOutPath() {
        return outPath;
    }

    public void setOutPath(File outPath) {
        this.outPath = outPath;
    }

    public void addFolder(String name) {
        this.dirNames.add(name);
    }

    public ArrayList getFolders() {
        return dirNames;
    }
}
