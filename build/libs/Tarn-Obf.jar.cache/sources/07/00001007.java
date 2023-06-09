package org.necrotic.client.a;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Paths;
import org.necrotic.client.Client;
import org.necrotic.client.ae;
import org.necrotic.client.d.a;

/* loaded from: Tarn-Obf.jar:org/necrotic/client/a/a.class */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v57, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public static void a(Client client) {
        String str;
        File file = Paths.get(ae.c(), "/settings.json").toFile();
        file.getParentFile().setWritable(true);
        ?? exists = file.exists();
        if (exists == 0) {
            try {
                exists = file.getParentFile().mkdirs();
            } catch (Throwable unused) {
                exists.printStackTrace();
            }
        }
        try {
            FileWriter fileWriter = new FileWriter(file);
            Gson create = new GsonBuilder().setPrettyPrinting().create();
            JsonObject jsonObject = new JsonObject();
            Client client2 = Client.q;
            if (Client.D == null || !org.necrotic.a.d) {
                str = "";
            } else {
                Client client3 = Client.q;
                str = Client.D;
            }
            jsonObject.addProperty("username", str);
            jsonObject.addProperty("password", (Client.q.bM == null || !org.necrotic.a.d) ? "" : Client.q.bM);
            jsonObject.addProperty("save-accounts", Boolean.valueOf(org.necrotic.a.d));
            jsonObject.addProperty("new-f-keys", Boolean.valueOf(org.necrotic.a.o));
            jsonObject.addProperty("new-hp-bars", Boolean.valueOf(org.necrotic.a.j));
            jsonObject.addProperty("new-hitmark", Boolean.valueOf(org.necrotic.a.h));
            jsonObject.addProperty("constitution", Boolean.valueOf(org.necrotic.a.i));
            jsonObject.addProperty("new-cursor", Boolean.valueOf(org.necrotic.a.n));
            jsonObject.addProperty("display-hp-above-head", Boolean.valueOf(org.necrotic.a.e));
            jsonObject.addProperty("display-username-above-head", Boolean.valueOf(org.necrotic.a.f));
            a.EnumC0025a enumC0025a = org.necrotic.client.d.a.a;
            a.EnumC0025a enumC0025a2 = a.EnumC0025a.FRAME_525;
            jsonObject.addProperty("gameframe", Boolean.FALSE);
            jsonObject.addProperty("highlight-username", Boolean.valueOf(org.necrotic.a.m));
            jsonObject.addProperty("high-detail", Boolean.valueOf(org.necrotic.a.r));
            jsonObject.addProperty("split-chat-color", Integer.valueOf(client.R));
            jsonObject.addProperty("clan-chat-color", Integer.valueOf(client.S));
            jsonObject.addProperty("split-chat", Integer.valueOf(client.bO[502]));
            jsonObject.addProperty("ground-text", Boolean.valueOf(org.necrotic.a.q));
            jsonObject.addProperty("fog-enabled", Boolean.valueOf(org.necrotic.a.p));
            String str2 = "";
            for (int i = 0; i < client.bJ.length; i++) {
                str2 = str2 + client.bJ[i];
            }
            jsonObject.add("quick-prayers", create.toJsonTree(str2));
            String str3 = "";
            for (int i2 = 0; i2 < client.bK.length; i2++) {
                str3 = str3 + client.bK[i2];
            }
            jsonObject.add("quick-curses", create.toJsonTree(str3));
            fileWriter.write(create.toJson((JsonElement) jsonObject));
            fileWriter.close();
            if (0 != 0) {
                fileWriter.close();
            } else {
                fileWriter.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}