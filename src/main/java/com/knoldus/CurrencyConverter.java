package com.knoldus;

public class CurrencyConverter {

    private String[] currencies = {"Australian Dollars", "Rupees", "Japanese Yen"};
    private int convertFromIndex;
    private int convertToIndex;

    public double[] australianDollarToOthers = { 1.0, 48.06, 73.64};
    public double[] rupeesToOthers = { 0.021, 1.0, 1.53};
    public double[] japaneseYenToOthers = { 0.014, 0.65, 1.0};

    public double[][] currencyRates = { australianDollarToOthers, rupeesToOthers, japaneseYenToOthers};

    public String getCurrency(int index) {
        return this.currencies[index];
    }

    public int getConvertFromIndex() {
        return this.convertFromIndex ;
    }

    public int getConvertToIndex() {
        return this.convertToIndex ;
    }

    public void setConvertFromIndex(int convertFromIndex) {
        this.convertFromIndex = convertFromIndex - 1 ;
    }

    public void setConvertToIndex(int convertToIndex) {
        this.convertToIndex = convertToIndex - 1 ;
    }

    public String[] getCurrencies() {
        return this.currencies;
    }

    public void displayCurrencies(String[] currencies, int currencyNotToDisplay) {
        int index = 0;
        for (String currency: currencies) {
            if (currencyNotToDisplay != index) {
                System.out.println(index + 1 + ". " + currency);
            }
            ++index;
        }
    }

    public double convert(int from, int to) {
        return this.currencyRates[from][to];
    }
}
