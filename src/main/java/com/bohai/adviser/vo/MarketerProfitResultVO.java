package com.bohai.adviser.vo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 查询营销人员产生的利润出参
 * @author caojia
 */
public class MarketerProfitResultVO implements Serializable{


    /**
     * 
     */
    private static final long serialVersionUID = 792307129816731601L;

    /**
     * 统计月份
     */
    private String month;
    
    /**
     * 营销人员编号
     */
    private String marketerNo;
    
    /**
     * 营销人员名称
     */
    private String marketerName;
    
    /**
     * 利息
     */
    private BigDecimal interest;
    
    /**
     * 交返
     */
    private BigDecimal exchangeReturn;
    
    /**
     * 客户拿走利息
     */
    private BigDecimal investorSpecialInterest;
    
    /**
     * 客户拿走交返
     */
    private BigDecimal investorSpecialExchange;
    
    /**
     * 居间人拿走利息
     */
    private BigDecimal mediatorSpecialInterest;
    
    /**
     * 居间人拿走交返
     */
    private BigDecimal mediatorSpecialExchange;
    
    /**
     * 手续费净收入
     */
    private BigDecimal sxfjsr;
    
    /**
     * 居间人返佣
     */
    private BigDecimal dbl16;
    
    /**
     * 营销人员提成
     */
    private BigDecimal money;
    
    /**
     * 净利润
     */
    private BigDecimal netProfit;
    

    /**
     * 营销人员编号
     */
    public String getMarketerNo() {
        return marketerNo;
    }

    public void setMarketerNo(String marketerNo) {
        this.marketerNo = marketerNo;
    }

    /**
     * 营销人员名称
     */
    public String getMarketerName() {
        return marketerName;
    }

    public void setMarketerName(String marketerName) {
        this.marketerName = marketerName;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
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

    public BigDecimal getInvestorSpecialInterest() {
        return investorSpecialInterest;
    }

    public void setInvestorSpecialInterest(BigDecimal investorSpecialInterest) {
        this.investorSpecialInterest = investorSpecialInterest;
    }

    public BigDecimal getInvestorSpecialExchange() {
        return investorSpecialExchange;
    }

    public void setInvestorSpecialExchange(BigDecimal investorSpecialExchange) {
        this.investorSpecialExchange = investorSpecialExchange;
    }

    public BigDecimal getMediatorSpecialInterest() {
        return mediatorSpecialInterest;
    }

    public void setMediatorSpecialInterest(BigDecimal mediatorSpecialInterest) {
        this.mediatorSpecialInterest = mediatorSpecialInterest;
    }

    public BigDecimal getMediatorSpecialExchange() {
        return mediatorSpecialExchange;
    }

    public void setMediatorSpecialExchange(BigDecimal mediatorSpecialExchange) {
        this.mediatorSpecialExchange = mediatorSpecialExchange;
    }

    public BigDecimal getSxfjsr() {
        return sxfjsr;
    }

    public void setSxfjsr(BigDecimal sxfjsr) {
        this.sxfjsr = sxfjsr;
    }

    public BigDecimal getDbl16() {
        return dbl16;
    }

    public void setDbl16(BigDecimal dbl16) {
        this.dbl16 = dbl16;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getNetProfit() {
        return netProfit;
    }

    public void setNetProfit(BigDecimal netProfit) {
        this.netProfit = netProfit;
    }
    
    
}
