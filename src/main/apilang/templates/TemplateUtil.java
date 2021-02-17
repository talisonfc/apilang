package apilang.templates;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

public class TemplateUtil {

  public static String readFile(String path){
    File file = new File(path);
    FileInputStream fileInputStream = null;
    String content = null;
    try {
       fileInputStream = new FileInputStream(file);
      byte[] bytes = fileInputStream.readAllBytes();
      content = new String(bytes, StandardCharsets.UTF_8);
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if(fileInputStream != null){
        try{
          fileInputStream.close();
        } catch(IOException e){
          e.printStackTrace();
        }
      }
    }
    return content;
  }

  public static void writeFile(String content, String path){
    File file = new File(path);
    FileOutputStream fileOutputStream = null;
    try {
      fileOutputStream = new FileOutputStream(file);
      byte[] bytes = content.getBytes();
      fileOutputStream.write(bytes);
    } catch (IOException e){
      e.printStackTrace();
    } finally {
      try {
        if(fileOutputStream != null){
          fileOutputStream.close();
        }
      } catch (IOException e){
        e.printStackTrace();
      }
    }
  }

  // public static void createClass(String code, String pathDir, String className){
  //   File dir = new File(pathDir);
  // }
}