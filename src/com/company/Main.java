package com.company;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Main {

    public static void main(String[] args) {
	    ArrayList<String> dataList = new ArrayList<String>();
        utilisation.fileToArray(dataList);
        utilisation.alphaSort(dataList);
    }
}
