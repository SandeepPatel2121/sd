
package com.nestlings.member;

/**
 *
 * @author ú
 */
public class HereForOptions {
        
   
    private String label;
    private String value;
    private boolean selected;

    public HereForOptions(){}

    public HereForOptions(String label, String value,boolean selected) {
        this.label = label;
        this.value = value;
        this.selected = selected;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
    
}
