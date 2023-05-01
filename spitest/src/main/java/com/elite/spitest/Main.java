package com.elite.spitest;

import com.elite.common.DriverManager;

import java.util.Iterator;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        ServiceLoader<DriverManager> providers = ServiceLoader.load(DriverManager.class);
        Iterator<DriverManager> iterator = providers.iterator();
        while(iterator.hasNext()){
            DriverManager next = iterator.next();
            String connectionInfo = next.getConnectionInfo();
            System.out.println(connectionInfo);
        }
    }
}
