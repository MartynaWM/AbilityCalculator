
package implementation;

import data.UserData;

import java.util.Scanner;

public class DataLoader {
    public UserData returnDataFromUser() {
        UserData userData;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Provide the following data");

        System.out.println("Provide yor employment period(in months)");

        int employmentPeriod = scanner.nextInt();

        System.out.println("Provide yor monthly income (in PLN)");

        double monthlyIncome = scanner.nextDouble();

        System.out.println("Provide yor monthly maintenance costs (in PLN)");

        double monthlyMaintenanceCosts = scanner.nextDouble();

        System.out.println("Provide yor monthly credit obligations (in PLN)");

        double monthlyCreditObligations = scanner.nextDouble();

        System.out.println("Provide yor sum of credit balances (in PLN)");

        double sumOfCreditBalances = scanner.nextDouble();

        userData = new UserData(employmentPeriod, monthlyIncome, monthlyMaintenanceCosts, monthlyCreditObligations,
            sumOfCreditBalances);

        return userData;
    }
}