package com.iamdj.countrycomparison;

import android.app.Application;

public class DemoClass extends Application {

    public static double executionTime;


    public DemoClass() {
    }

    public static double getExecutionTime() {
        return executionTime;
    }

    public static void setExecutionTime(double executionTime) {
        DemoClass.executionTime = executionTime;
    }
}
