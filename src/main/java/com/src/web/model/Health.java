package com.src.web.model;

public class Health {
    private boolean isHealthy;
    public Health(){
        isHealthy = true;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public void setHealthy(boolean healthy) {
        isHealthy = healthy;
    }
}
