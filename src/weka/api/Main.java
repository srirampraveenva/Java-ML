package weka.api;

import weka.core.Instances;

public class Main {
    public static void main(String[] args) throws Exception{
        LoadSaveData lsd = new LoadSaveData();
        Instances dataset = lsd.loadDataSource("data/airline_123.arff");
    }
}
