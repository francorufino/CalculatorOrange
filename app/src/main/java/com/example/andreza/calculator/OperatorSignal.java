package com.example.andreza.calculator;

public enum OperatorSignal {
    sum("+"),
    subtract("-"),
    multiply("x"),
    divide("÷"),
    percent("%"),
    changeOfSignal("+/_");

    private String signal;

    OperatorSignal(String signal) {

        this.signal = signal;
    }

    public String getSignal() {

        return signal;
    }

    public static OperatorSignal searchBySignal(String signal){
        for (OperatorSignal operatorSignal : values()) {
            if (operatorSignal.getSignal().equals(signal)){
                return operatorSignal;
            }
        }
    return null;
    }


}
