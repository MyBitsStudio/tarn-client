package org.necrotic.client.accounts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import org.necrotic.client.aa;
import org.necrotic.client.ae;
import org.necrotic.client.f.c.b;

/* loaded from: Tarn-Obf.jar:org/necrotic/client/accounts/AccountManager.class */
public class AccountManager {
    private final String FILE_NAME = "accounts.dat";
    private Account[] accounts = new Account[5];
    private int totalAccounts;

    public AccountManager() {
        if (saveExists()) {
            load();
        }
    }

    public void addAccount(Account account, boolean z) {
        int emptyBox = getEmptyBox();
        if (emptyBox == -1) {
            return;
        }
        account.setBox(emptyBox);
        this.accounts[account.getBox()] = account;
        this.totalAccounts++;
        updateInterface();
        if (z) {
            save();
        }
    }

    public void removeAccount(Account account, boolean z) {
        this.accounts[account.getBox()] = null;
        this.totalAccounts--;
        updateInterface();
        if (z) {
            save();
        }
    }

    public void updateInterface() {
        Account[] accountArr;
        ArrayList arrayList = new ArrayList();
        for (Account account : this.accounts) {
            if (account != null) {
                arrayList.add(account);
            }
        }
        aa.a();
        b.a(arrayList);
    }

    private boolean saveExists() {
        return new File(ae.c() + "/accounts.dat").exists();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.ObjectInputStream, java.lang.Exception] */
    private void load() {
        ?? objectInputStream;
        try {
            FileInputStream fileInputStream = new FileInputStream(ae.c() + "/accounts.dat");
            objectInputStream = new ObjectInputStream(fileInputStream);
            this.totalAccounts = ((Integer) objectInputStream.readObject()).intValue();
            this.accounts = (Account[]) objectInputStream.readObject();
            fileInputStream.close();
            objectInputStream.close();
        } catch (Exception unused) {
            objectInputStream.printStackTrace();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.OutputStream, java.io.FileOutputStream, java.lang.Exception] */
    public void save() {
        ?? fileOutputStream;
        try {
            fileOutputStream = new FileOutputStream(ae.c() + "/accounts.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(Integer.valueOf(this.totalAccounts));
            objectOutputStream.writeObject(this.accounts);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (Exception unused) {
            fileOutputStream.printStackTrace();
        }
    }

    public Account getAccount(String str) {
        Account[] accountArr;
        for (Account account : this.accounts) {
            if (account != null && account.getUsername().equals(str)) {
                return account;
            }
        }
        return null;
    }

    public int getEmptyBox() {
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= this.accounts.length) {
                break;
            } else if (this.accounts[i2] != null) {
                i2++;
            } else {
                i = i2;
                break;
            }
        }
        return i;
    }

    public Account[] getAccounts() {
        return this.accounts;
    }
}