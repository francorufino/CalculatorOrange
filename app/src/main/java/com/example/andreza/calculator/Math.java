package com.example.andreza.calculator;

public class Math {
    private float firstNumbertyped;
    private float lastNumberTyped;
    private OperatorSignal operation;
    private float resultOfOperation;


    public float sum(){

        return resultOfOperation = firstNumbertyped + lastNumberTyped;
}

    public float subtract(){

        return resultOfOperation = firstNumbertyped - lastNumberTyped;
}

    public float multiply(){

        return resultOfOperation = firstNumbertyped * lastNumberTyped;
    }

    public float divide(){

        return resultOfOperation = firstNumbertyped / lastNumberTyped;
    }

    public float percent(){

        return resultOfOperation = (firstNumbertyped/100)*lastNumberTyped;
    }

    public float changeSignal(){

        return lastNumberTyped *(-1);
    }

    public float getFirstNumbertyped(){
        return firstNumbertyped;
    }

    public void setFirstNumbertyped(float firstNumbertyped){
        this.firstNumbertyped = firstNumbertyped;
    }

    public float getLastNumberTyped(){

        return lastNumberTyped;
    }
    public void setLastNumberTyped(float LastNumberTyped) {
        this.lastNumberTyped = lastNumberTyped;
    }


    public float doOperation(){
        switch (operation){
            case sum:
                return sum();
            case subtract:
                return subtract();
            case multiply:
                return multiply();
            case divide:
                return divide();
            case percent:
                return percent();
            case changeOfSignal:
                return changeSignal();
        }
        return 0.0F;
    }


    public float getResultOfOperation() {
        return resultOfOperation;
    }

    public void setResultOfOperation(float resultOfOperation) {
        this.resultOfOperation = resultOfOperation;
    }

    public OperatorSignal getOperation(){

        return operation;
    }

    public void setOperation(OperatorSignal operation)
    {
        this.operation = operation;
    }
}
