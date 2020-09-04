
package filedemonstration;

/**
 *
 * @author Ghabrielly Costa
 */
import java.io.File;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class FileDemonstration {

    
    public static void main(String[] args) {
       
        String text = JOptionPane.showInputDialog(null,"Enter file or directory name: "
                ,"File", JOptionPane.PLAIN_MESSAGE);
        analyzePath(text);
    }
    public static void analyzePath(String path){
        File name = new File(path);
        if (name.exists()){
            System.out.printf("%s%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s",
                    name.getName(),"exists",
                    (name.isFile()?"is a file": " is not a file"),
                    (name.isDirectory()?"is a directory" :
                      " is not a directory "),
                    (name.isAbsolute()? "is absolute path": "is not absolute path"),
                    "last modified: ", name.lastModified(),"Length: ", name.length(),
                    "Path: ", name.getPath(),"absolute path: ", name.getAbsolutePath(),"Parent: ",name.getParent());
            
                    if(name.isDirectory()){
                        String[] directory = name.list();
                        System.out.println("\n\nDirectory coments");
                        
                        for (String directoryName : directory)
                            System.out.println( directoryName);
                        
                        
                    }
                    
                    }
        else{
            System.out.printf("%s %s",path," does not exist, ");
        }

      }
   }