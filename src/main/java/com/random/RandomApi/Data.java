/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.random.RandomApi;

import java.math.MathContext;
import java.util.Random;

/**
 *
 * @author morte
 */
public class Data {
 
    private int logger_id;
    private int org_id;
    private int type;
    private int channels;
    private int providerView;
    private int providerSetup;
    private int position;

    public Data() {
        Random r = new Random();
        this.logger_id = r.nextInt(160);
        this.org_id = r.nextInt(160);
        this.type = r.nextInt(160);
        this.channels = r.nextInt(160);
        this.providerView = 1;
        this.providerSetup = 1;
        this.position = r.nextInt(160);
    }

    public int getLogger_id() {
        return logger_id;
    }

    public void setLogger_id(int loggger_id) {
        this.logger_id = logger_id;
    }

    public int getOrg_id() {
        return org_id;
    }

    public void setOrg_id(int org_id) {
        this.org_id = org_id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getChannels() {
        return channels;
    }

    public void setChannels(int channels) {
        this.channels = channels;
    }

    public int getProviderView() {
        return providerView;
    }

    public void setProviderView(int providerView) {
        this.providerView = providerView;
    }

    public int getProviderSetup() {
        return providerSetup;
    }

    public void setProviderSetup(int providerSetup) {
        this.providerSetup = providerSetup;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
    
    
}
