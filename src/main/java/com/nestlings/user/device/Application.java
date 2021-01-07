
package com.nestlings.user.device;

/**
 *
 * @author ú
 */
public enum Application {
    
    
    WEB("web"),
    ANDROID("android"),
    IOS("ios");
   
    private String desc;

    Application(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return this.desc;
    }
    
}
