package net.hualisheng.springBootWebDemo.model;

public class OrderLogBakupWithBLOBs extends OrderLogBakup {
    private String logContent;

    private String images;

    private String signImgs;

    public String getLogContent() {
        return logContent;
    }

    public void setLogContent(String logContent) {
        this.logContent = logContent == null ? null : logContent.trim();
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }

    public String getSignImgs() {
        return signImgs;
    }

    public void setSignImgs(String signImgs) {
        this.signImgs = signImgs == null ? null : signImgs.trim();
    }
}