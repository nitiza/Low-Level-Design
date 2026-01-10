package org.nitisha.CreationalPatterns.SingletonPattern.Problem;

import org.nitisha.CreationalPatterns.SingletonPattern.Problem.AppSettings;

public class WithoutSingletonPattern {

    public static void main(String[] args) {
        AppSettings appSettings = new AppSettings();
        AppSettings appSettings1 = new AppSettings();

        System.out.println(appSettings.getApiKey());
        System.out.println(appSettings1.getApiKey());


        System.out.println(appSettings == appSettings1);
    }
}
