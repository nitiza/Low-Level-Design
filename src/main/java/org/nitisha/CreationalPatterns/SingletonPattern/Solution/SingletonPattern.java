package org.nitisha.CreationalPatterns.SingletonPattern.Solution;



public class SingletonPattern {

    public static void main(String[] args) {
        AppSettings appSettings = AppSettings.getInstance();
        AppSettings appSettings1 = AppSettings.getInstance();

        System.out.println(appSettings.getApiKey());
        System.out.println(appSettings1.getApiKey());


        System.out.println(appSettings == appSettings1);
    }

}
