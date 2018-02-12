package main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/14.
 */
public class MainTestListArray {
    public static void main(String[] args) throws IOException {
        File file=new File("D://java/basebuskm.sql");
        FileReader fileReader=new FileReader(file);
        BufferedReader bf=new BufferedReader(fileReader);
        FileWriter  fw=new FileWriter("D://km2.sql");
        BufferedWriter bw=new BufferedWriter(fw);
        String str="";
        while ((str=bf.readLine())!=null){
           str= str.replace("INSERT INTO ``","INSERT INTO `base_bus_km`");
            bw.write(str);
            bw.flush();
        }
        bf.close();
        bw.close();

    }
}
