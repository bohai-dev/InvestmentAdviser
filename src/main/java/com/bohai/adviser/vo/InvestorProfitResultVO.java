package com.bohai.adviser.vo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 查询投资者产生的利润出参
 * @author caojia
 */
public class InvestorProfitResultVO implements Serializable{
    

    /**
     * 
     */
    private static final long serialVersionUID = 7211287483335195529L;

    /**
     * 月份
     */
    private String month;
    
    /**
     * 投资者编号
     */
    private String investorNo;
    
    /**
     * 投资者名称
     */
    private String investorName;
    
    /**
     * 利息
     */
    private BigDecimal interest;
    
    /**
     * 交易所返还
     */
    private BigDecimal exchangeReturn;
    
    /**
     * 客户拿走利息
     */
    private BigDecimal specialInterest;
    
    /**
     * 客户拿走交返
     */
    private BigDecimal specialExchange;
    
    /**
     * 留存手续费
     */
    private BigDecimal lcsxf;
    
    /**
     * 手续费净收入
     */
    private BigDecimal sxfjsr;

    /**
     * 净利息
     */
    private BigDecimal netInterest;
    
    /**
     * 净交返
     */
    private BigDecimal netAmount;
    
    /**
     * 净利润
     */
    private BigDecimal netProfit;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getInvestorNo() {
        return investorNo;
    }

    public void setInvestorNo(String investorNo) {
        this.investorNo = investorNo;
    }

    public String getInvestorName() {
        return investorName;
    }

    public void setInvestorName(String investorName) {
        this.investorName = investorName;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public BigDecimal getExchangeReturn() {
        return exchangeReturn;
    }

    public void setExchangeReturn(BigDecimal exchangeReturn) {
        this.exchangeReturn = exchangeReturn;
    }

    public BigDecimal getSpecialInterest() {
        return specialInterest;
    }

    public void setSpecialInterest(BigDecimal specialInterest) {
        this.specialInterest = specialInterest;
    }

    public BigDecimal getSpecialExchange() {
        return specialExchange;
    }

    public void setSpecialExchange(BigDecimal specialExchange) {
        this.specialExchange = specialExchange;
    }

    public BigDecimal getLcsxf() {
        return lcsxf;
    }

    public void setLcsxf(BigDecimal lcsxf) {
        this.lcsxf = lcsxf;
    }

    public BigDecimal getSxfjsr() {
        return sxfjsr;
    }

    public void setSxfjsr(BigDecimal sxfjsr) {
        this.sxfjsr = sxfjsr;
    }

    public BigDecimal getNetInterest() {
        return netInterest;
    }

    public void setNetInterest(BigDecimal netInterest) {
        this.netInterest = netInterest;
    }

    public BigDecimal getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(BigDecimal netAmount) {
        this.netAmount = netAmount;
    }

    public BigDecimal getNetProfit() {
        return netProfit;
    }

    public void setNetProfit(BigDecimal netProfit) {
        this.netProfit = netProfit;
    }
    
    
}
