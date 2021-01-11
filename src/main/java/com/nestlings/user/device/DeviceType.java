
package com.nestlings.user.device;

/**
 *
 * @author ú
 */
public enum DeviceType {
    
    
    WEB("web"),
    ANDROID("android"),
    IOS("ios");
   
    private String desc;

    DeviceType(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return this.desc;
    }
    
}
