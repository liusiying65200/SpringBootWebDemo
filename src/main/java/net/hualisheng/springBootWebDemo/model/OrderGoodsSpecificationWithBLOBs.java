package net.hualisheng.springBootWebDemo.model;

public class OrderGoodsSpecificationWithBLOBs extends OrderGoodsSpecification {
    private String descripation;

    private String images;

    public String getDescripation() {
        return descripation;
    }

    public void setDescripation(String descripation) {
        this.descripation = descripation == null ? null : descripation.trim();
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }
}