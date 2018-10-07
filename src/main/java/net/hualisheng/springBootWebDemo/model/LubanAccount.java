package net.hualisheng.springBootWebDemo.model;

import java.math.BigDecimal;
import java.util.Date;

public class LubanAccount {
    private Integer id;

    private BigDecimal totalMoney;

    private BigDecimal accountIn;

    private BigDecimal accountOut;

    private BigDecimal withdrawalMoney;

    private String tradePassword;

    private String queryPassword;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }

    public BigDecimal getAccountIn() {
        return accountIn;
    }

    public void setAccountIn(BigDecimal accountIn) {
        this.accountIn = accountIn;
    }

    public BigDecimal getAccountOut() {
        return accountOut;
    }

    public void setAccountOut(BigDecimal accountOut) {
        this.accountOut = accountOut;
    }

    public BigDecimal getWithdrawalMoney() {
        return withdrawalMoney;
    }

    public void setWithdrawalMoney(BigDecimal withdrawalMoney) {
        this.withdrawalMoney = withdrawalMoney;
    }

    public String getTradePassword() {
        return tradePassword;
    }

    public void setTradePassword(String tradePassword) {
        this.tradePassword = tradePassword == null ? null : tradePassword.trim();
    }

    public String getQueryPassword() {
        return queryPassword;
    }

    public void setQueryPassword(String queryPassword) {
        this.queryPassword = queryPassword == null ? null : queryPassword.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}