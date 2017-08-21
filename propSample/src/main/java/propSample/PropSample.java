package propSample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropSample {
    public static void main(String[] args) {
        FileInputStream fis;
        try {
            fis = new FileInputStream(new File("wps.conf"));
        } catch (FileNotFoundException e) {
            // TODO �����������ꂽ catch �u���b�N
            e.printStackTrace();
        }
        
        Properties props = new Properties();
        props.load(fis); // �ǂݍ���
        fis.close();
        System.out.println(props.getProperty("name"));
        
        
    }

}
