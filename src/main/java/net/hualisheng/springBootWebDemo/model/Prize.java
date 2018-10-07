package net.hualisheng.springBootWebDemo.model;

public class Prize {
    private Integer id;

    private String prizeName;

    private Integer prizeType;

    private Float prizeValue;

    private Integer pageNo;

    private Integer useIn;

    private Integer isUse;

    private String actCode;

    private Double probability;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrizeName() {
        return prizeName;
    }

    public void setPrizeName(String prizeName) {
        this.prizeName = prizeName == null ? null : prizeName.trim();
    }

    public Integer getPrizeType() {
        return prizeType;
    }

    public void setPrizeType(Integer prizeType) {
        this.prizeType = prizeType;
    }

    public Float getPrizeValue() {
        return prizeValue;
    }

    public void setPrizeValue(Float prizeValue) {
        this.prizeValue = prizeValue;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getUseIn() {
        return useIn;
    }

    public void setUseIn(Integer useIn) {
        this.useIn = useIn;
    }

    public Integer getIsUse() {
        return isUse;
    }

    public void setIsUse(Integer isUse) {
        this.isUse = isUse;
    }

    public String getActCode() {
        return actCode;
    }

    public void setActCode(String actCode) {
        this.actCode = actCode == null ? null : actCode.trim();
    }

    public Double getProbability() {
        return probability;
    }

    public void setProbability(Double probability) {
        this.probability = probability;
    }
}