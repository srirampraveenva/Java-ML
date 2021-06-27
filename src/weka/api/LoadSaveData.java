package weka.api;

import weka.core.Instances;
import weka.core.converters.CSVSaver;
import weka.core.converters.ConverterUtils.DataSource;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class LoadSaveData {
    public Instances loadDataSource(String pathName) throws Exception {

        DataSource source = new DataSource(pathName);
        Instances dataset = null;
        try {
            dataset = source.getDataSet();
        } catch (IOException ex) {
            System.err.println("File not found: " + pathName);
        }

        return dataset;
    }
    public Instances loadFile(String pathName) throws Exception {
        System.out.println("File Loaded");
        return new Instances(new BufferedReader((new FileReader(pathName))));
    }
    //public void saveArff(Instances dataset, String pathName) throws Exception {



}
