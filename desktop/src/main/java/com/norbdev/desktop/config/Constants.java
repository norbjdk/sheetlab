package com.norbdev.desktop.config;

import java.util.LinkedList;
import java.util.Queue;

public class Constants {
    public final static String appPath = "/com/norbdev/desktop/";
    private final static Queue<String> projectPaths = new LinkedList<>();
    protected Constants() {}

    public void addProjectPath(String path) {
        projectPaths.add(path);
    }

    public static Queue<String> getProjectPaths() {
        return projectPaths;
    }
}
