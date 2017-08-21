package propSample;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropSample {
    public static void main(String[] args) {
        FileInputStream fis;
        Properties props = new Properties();
        try {
            fis = new FileInputStream(new File("wps.conf"));   
            props.load(fis); // �ǂݍ���
            fis.close();
        } catch (FileNotFoundException e) {
            // TODO �����������ꂽ catch �u���b�N
            e.printStackTrace();
        } catch (IOException e) {
            // TODO �����������ꂽ catch �u���b�N
            e.printStackTrace();
        }
        
        System.out.println(props.getProperty("COMMON_PAGE_PATH"));
        System.out.println(props.getProperty("PAGE_PATH"));
        System.out.println(props.getProperty("PATTERN"));

        
        
    }

}
