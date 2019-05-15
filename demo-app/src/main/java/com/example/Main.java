package com.example;

import com.example.warehouse.DependencyFactory;
import com.example.warehouse.TrialDependencyFactory;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        DependencyFactory dependencyFactory = new TrialDependencyFactory();
        new App(List.of(args), dependencyFactory).run();
    }
}
