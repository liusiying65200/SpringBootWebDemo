package net.hualisheng.springBootWebDemo.model;

public class LbdjActivityRule {
    private Integer id;

    private Integer actId;

    private String rules;

    private Integer rulesType;

    private Integer effectiveTimes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActId() {
        return actId;
    }

    public void setActId(Integer actId) {
        this.actId = actId;
    }

    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules == null ? null : rules.trim();
    }

    public Integer getRulesType() {
        return rulesType;
    }

    public void setRulesType(Integer rulesType) {
        this.rulesType = rulesType;
    }

    public Integer getEffectiveTimes() {
        return effectiveTimes;
    }

    public void setEffectiveTimes(Integer effectiveTimes) {
        this.effectiveTimes = effectiveTimes;
    }
}