package org.necrotic.client.accounts;

import java.io.Serializable;

/* loaded from: Tarn-Obf.jar:org/necrotic/client/accounts/Account.class */
public class Account implements Serializable {
    private static final long serialVersionUID = 1;
    private String username;
    private String password;
    private int box;
    private int gender;
    private int helmet;
    private int IDKHead;
    private int jaw;

    public Account(String str, String str2, int i, int i2, int i3, int i4) {
        this.username = str;
        this.password = str2;
        this.gender = i;
        this.helmet = i2;
        this.IDKHead = i3;
        this.jaw = i4;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public int getBox() {
        return this.box;
    }

    public int getGender() {
        return this.gender;
    }

    public int getHelmet() {
        return this.helmet;
    }

    public int getIDKHead() {
        return this.IDKHead;
    }

    public int getJaw() {
        return this.jaw;
    }

    public void setBox(int i) {
        this.box = i;
    }

    public void setHelmet(int i) {
        this.helmet = i;
    }

    public void setIDKHead(int i) {
        this.IDKHead = i;
    }

    public void setJaw(int i) {
        this.jaw = i;
    }

    public void setGender(int i) {
        this.gender = i;
    }

    public String toString() {
        return " username : " + getUsername() + " password : " + getPassword();
    }
}