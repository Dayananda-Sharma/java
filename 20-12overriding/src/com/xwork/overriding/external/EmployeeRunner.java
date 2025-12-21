package com.xwork.overriding.external;

import com.xwork.overriding.internal.Worker;

public class EmployeeRunner {
    public static void main(String[] args) {
        Worker worker=new Worker();
        worker.displayEmployee(1,"dasa",887766543,'D',true,23);
    }
}
