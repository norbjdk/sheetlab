package com.norbdev.desktop.event;

public class ViewChangeEvent {
    private final String targetView;

    public ViewChangeEvent(String targetView) {
        this.targetView = targetView;
    }

    public String getTargetView() {
        return targetView;
    }
}
