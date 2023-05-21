package org.necrotic.client.security;

public class Security {

    public static String getSystemCode(){
        switch(SecurityUtils.getOperatingSystem()){
            case 0:
                try {
                    return SecurityUtils.getUUID();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case 1:
                try {
                    return SecurityUtils.getLUUID();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case 2:
                try {
                    return SecurityUtils.getMUUID();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            default: return "INVALID";
        }
        return "INVALID";
    }
}
