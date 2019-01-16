package com.company;

public class DataReader implements InternetConnection {
    @Override
    public boolean checkConnection() {
        return false;
    }

    @Override
    public boolean getConnected() {
        return false;
    }

    @Override
    public boolean getDisconnected() {
        return false;
    }

    @Override
    public String parseXML(String url) {
        return null;
    }

    @Override
    public String parseJSON(String url) {
        return null;
    }

    @Override
    public String downloadPageContent(String url) {
        return null;
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}
