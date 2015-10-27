
package kata4v2;

import java.io.File;

public class Kata4v2 {

    public static void main(String[] args) {
       File file = new File ("C:\\Users\\usuario\\Desktop");
       print(file.listFiles(), "");
    }

    private static void print(File[] files, String indent) {
        for (File file : files) {
             System.out.println( indent +(file.isDirectory()?"+":"-")+file.getName());
            if(!file.isDirectory() || file.isHidden()) continue;
            if(file.isDirectory()) print(file.listFiles()," ");
        }        
    }
    
}
