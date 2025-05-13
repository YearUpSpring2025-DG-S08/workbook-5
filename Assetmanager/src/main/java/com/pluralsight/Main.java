package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Asset> portfolio = new ArrayList<>();
        
        House house = new House("My main house", "2027-05-25", 120000,
                "717 Love Lane", 3, 2700, 21000);
        
        
        portfolio.add(new Asset("Hundred Dollar Bill", "2025-01-01", 100));
        portfolio.add(new Asset("Diamond Necklace", "2025-2-14", 225));
        portfolio.add(house);
        
        System.out.println("Your portfolio has the following assets: " );
        
        double totalNetWorth = 0;
        for(Asset a : portfolio){
            System.out.printf("    %s valued at $%.2f\n", a.getDescription(), a.getValue());
            totalNetWorth += a.getValue();
        }
        
        System.out.println("Your net worth is: $" + totalNetWorth);
    }
}