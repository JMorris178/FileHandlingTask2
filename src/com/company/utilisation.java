package com.company;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class utilisation {
    public static void fileToArray (ArrayList<person> dataList){
        try {
            FileReader fr = new FileReader("data");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line!= null){
                    System.out.println(line);
                    line = br.readLine();
                }
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
