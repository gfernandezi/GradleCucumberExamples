package com.test.stepdefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

import java.util.List;
import java.util.Map;

public class DataTableStepDefs {
    @Given("the following animals:")
    public void theFollowingAnimals(DataTable dataTable) {
        //this is used when the data is in single column with no header
        List<String> list = dataTable.asList();
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
    }

    @Given("these animals:")
    public void theseAnimals(DataTable dataTable) {
        //this is used when the data is in multiple rows with no header
        List<String> values = dataTable.values();
        System.out.println(values.get(0));
        System.out.println(values.get(1));
        System.out.println(values.get(2));
    }

    @Given("these rows of animals:")
    public void theseRowsOfAnimals(DataTable dataTable) {
        List<String> row = dataTable.row(0);
        System.out.println(row.get(0) + " " + row.get(1)+ " " + row.get(2));
         row = dataTable.row(1);
        System.out.println(row.get(0) + " " + row.get(1)+ " " + row.get(2));
    }

    @Given("these rows of animals list of list")
    public void theseRowsOfAnimalsListOfList(DataTable dataTable) {
        List<List<String>> lists = dataTable.asLists();
        System.out.println("******First Row************");
        System.out.println(lists.get(0).get(0));
        System.out.println(lists.get(0).get(1));
        System.out.println(lists.get(0).get(2));
        System.out.println("******Second Row************");
        System.out.println(lists.get(1).get(0));
        System.out.println(lists.get(1).get(1));
        System.out.println(lists.get(1).get(2));
    }

    @Given("these credentials")
    public void theseCredentials(DataTable dataTable) {
        List<Map<String, String>> map = dataTable.asMaps();
        System.out.println("****First Credentials**********");
        System.out.println("UserName: " + map.get(0).get("UserName"));
        System.out.println("Password: " + map.get(0).get("Password"));
        System.out.println("****Second Credentials**********");
        System.out.println("UserName: " + map.get(1).get("UserName"));
        System.out.println("Password: " + map.get(1).get("Password"));
    }
}
