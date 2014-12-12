package br.com.schumaker.io;

import br.com.schumaker.model.Folders;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hudson.sales
 */
public class HsFiles {

    public static void createFolder() {
        ArrayList<String> folders = Folders.getInstance().getFolders();
        String out = Folders.getInstance().getOutPath().getAbsolutePath();
        for (String l : folders) {
            File dir = new File(out + "/" + l);
            dir.mkdir();
            File dirA = new File(out + "/" + l + "/A");
            File dirB = new File(out + "/" + l + "/B");
            dirA.mkdir();
            dirB.mkdir();
        }
    }

    public static void readAlias(File path) {
        BufferedReader in;
        try {
            in = new BufferedReader(new FileReader(path));
            String line;
            while ((line = in.readLine()) != null) {
                Folders.getInstance().addFolder(line);
            }
            in.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ler Alias:\n" + ex, "Read Alias.", JOptionPane.ERROR_MESSAGE);
        }
    }
}
