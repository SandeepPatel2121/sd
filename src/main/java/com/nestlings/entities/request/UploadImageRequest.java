
package com.nestlings.entities.request;

/**
 *
 * @author ú
 */
public class UploadImageRequest {
    private String croppedImageUrl;
    private String croppedWidth;
    private String croppedHeight;
    public String getCroppedImageUrl() {
        return croppedImageUrl;
    }

    public void setCroppedImageUrl(String croppedImageUrl) {
        this.croppedImageUrl = croppedImageUrl;
    }

    public String getCroppedWidth() {
        return croppedWidth;
    }

    public void setCroppedWidth(String croppedWidth) {
        this.croppedWidth = croppedWidth;
    }

    public String getCroppedHeight() {
        return croppedHeight;
    }

    public void setCroppedHeight(String croppedHeight) {
        this.croppedHeight = croppedHeight;
    }
}
