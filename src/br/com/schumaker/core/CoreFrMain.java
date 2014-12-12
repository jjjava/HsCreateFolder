package br.com.schumaker.core;

import br.com.schumaker.io.HsFiles;
import br.com.schumaker.model.Folders;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author hudson.sales
 */
public class CoreFrMain {

    private static final CoreFrMain INSTANCE = new CoreFrMain();

    private CoreFrMain() {
    }

    public static CoreFrMain getInstance() {
        return INSTANCE;
    }

    public void create() {
        HsFiles.readAlias(Folders.getInstance().getPathFile());
        HsFiles.createFolder();
        JOptionPane.showMessageDialog(null, "Pastas criadas", "Criar", JOptionPane.INFORMATION_MESSAGE);
    }

    public String openFile() {
        JFileChooser chooser = new JFileChooser(System.getProperty("user.home"));
        chooser.setDialogTitle("Abrir arquivo");
        chooser.setApproveButtonText("Abrir");
        int sf = chooser.showOpenDialog(null);
        if (sf == JFileChooser.APPROVE_OPTION) {
            Folders.getInstance().setPathFile(chooser.getSelectedFile());
        }
        return chooser.getSelectedFile().getAbsolutePath();
    }

    public String setOut() {
        JFileChooser chooser = new JFileChooser(System.getProperty("user.home"));
        chooser.setDialogTitle("Escolher local");
        chooser.setApproveButtonText("Escolher");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int sf = chooser.showOpenDialog(null);
        if (sf == JFileChooser.APPROVE_OPTION) {
            Folders.getInstance().setOutPath(chooser.getSelectedFile());
        }
        return chooser.getSelectedFile().getAbsolutePath();
    }

    public void close() {
        System.exit(0);
    }
}
