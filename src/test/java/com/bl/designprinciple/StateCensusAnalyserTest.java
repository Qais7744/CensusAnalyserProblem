package com.bl.designprinciple;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;

public class StateCensusAnalyserTest {
    public static final String CSV_FILE_PATH = "C:\\Users\\Altamash\\IdeaProjects\\CensusAnalyserProblem" +
                                               "\\src\\test\\resources\\IndiaStateCensusData.csv";

    @Test
    public void giveInputFromFileShouldPrintTheCensusData() throws IOException, CsvValidationException {
        CSVReader csvReader = new CSVReader(new FileReader(CSV_FILE_PATH));
        String[] row;
        int counter = 0;
        while ((row = csvReader.readNext()) != null) {
            String[] data = row;
            System.out.println("The Data is " + data[0] + ", " + data[1] + ", " + data[2] + ", " + data[3]);
            counter++;
        }
        System.out.println("Total States is :- " + counter);
        Assert.assertEquals(30, counter);
    }
}
