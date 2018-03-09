package com.example.examplestatemachine;

public class StateContext extends State {
    private char firstAction = 0;

    StateContext() {
        this.accept = false;
    }

    @Override
    public void actionA() {
        if (firstAction == 0) {
            firstAction = 'A';
        }

        this.accept = (firstAction == 'A');
    }

    @Override
    public void actionB() {
        if (firstAction == 0) {
            firstAction = 'B';
        }

        this.accept = (firstAction == 'B');
    }
}
