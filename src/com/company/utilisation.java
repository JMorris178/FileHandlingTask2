package com.company;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class utilisation {
    public static void fileToArray(ArrayList<String> dataList) {
        try {
            FileReader fr = new FileReader("data");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                dataList.add(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(dataList);
    }


    public static void alphaSort(ArrayList<String> dataList) {
        Collections.sort(dataList);
        for(int i = 0; i < dataList.size();i++){
            System.out.println(dataList.get(i));
        }

    }
}
