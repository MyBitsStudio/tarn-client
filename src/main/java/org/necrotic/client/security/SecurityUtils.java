package org.necrotic.client.security;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecurityUtils {

    public static int getOperatingSystem(){
        String OS = System.getProperty("os.name").toLowerCase();
        if(OS.contains("win")) return 0;
        if(OS.contains("mac")) return 1;
        if(OS.contains("sunos")) return 2;
        if(OS.contains("nix") || OS.contains("nux") || OS.indexOf("aix") > 0 ) return 3;
        return -1;
    }

    public static String getUUID() throws IOException {
        StringBuilder output = new StringBuilder();

        Process SerNumProcess = Runtime.getRuntime().exec("wmic csproduct get UUID");
        BufferedReader sNumReader = new BufferedReader(new InputStreamReader(SerNumProcess.getInputStream()));

        String line;
        while ((line = sNumReader.readLine()) != null) {
            output.append(line).append("\n");
        }

        return output.substring(output.indexOf("\n"), output.length()).trim();
    }

    public static String getLUUID() throws IOException {
        StringBuilder output = new StringBuilder();

        Process SerNumProcess = Runtime.getRuntime().exec("# cat /sys/class/dmi/id/product_uuid");
        BufferedReader sNumReader = new BufferedReader(new InputStreamReader(SerNumProcess.getInputStream()));

        String line;
        while ((line = sNumReader.readLine()) != null) {
            output.append(line).append("\n");
        }

        return output.substring(output.indexOf("\n"), output.length()).trim();
    }

    public static String getMUUID() throws IOException, InterruptedException {
        String command = "system_profiler SPHardwareDataType | awk '/UUID/ { print $3; }'";

        StringBuilder output = new StringBuilder();


        Process SerNumProcess = Runtime.getRuntime().exec(command);

        BufferedReader sNumReader = new BufferedReader(new InputStreamReader(SerNumProcess.getInputStream()));

        String line = "";

        while ((line = sNumReader.readLine()) != null) {
            output.append(line).append("\n");
        }

        String MachineID= output.substring(output.indexOf("UUID: "), output.length()).replace("UUID: ", "");

        SerNumProcess.waitFor();

        sNumReader.close();

        return MachineID;
    }
}
