/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7_ex3_controller;

/**
 *
 * @author selu3
 */
import Week7_ex3_model.EastAsiaCountries;
import Week7_ex3_view.Menu;
import java.util.*;

public class ManageEastAsiaCountries {

    private List<EastAsiaCountries> countriesList = new ArrayList<>();

    public void addCountryInformation(String countryCode, String countryName, float totalArea, String countryTerrain) {
        countriesList.add(new EastAsiaCountries(countryCode, countryName, totalArea, countryTerrain));
    }

    public void getRecentlyEnteredInformation() {
        if (countriesList.isEmpty()) {
            System.out.println("\nNo country information available.");
            return;
        }
        System.out.printf("%-5s %-15s %-10s %-15s\n", "Code", "Name", "Area", "Terrain");
        for (EastAsiaCountries country : countriesList) {
            country.display();
        }
    }

    public void sortCountry() {
        if (countriesList.isEmpty()) {
            System.out.println("\nNo country information available to sort.");
            return;
        }
        countriesList.sort(Comparator.comparing(EastAsiaCountries::getCountryName));
        System.out.printf("%-5s %-15s %-10s %-15s\n", "Code", "Name", "Area", "Terrain");
        for (EastAsiaCountries country : countriesList) {
            country.display();
        }
    }

    public void searchCountry(String name) {
        boolean found = false;
        for (EastAsiaCountries country : countriesList) {
            if (country.getCountryName().equalsIgnoreCase(name)) {
                System.out.println("name found");
                System.out.printf("%-5s %-15s %-10s %-15s\n", "Code", "Name", "Area", "Terrain");
                country.display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("\nCountry not found.");
        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.start();
    }
}
