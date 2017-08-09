package com.bohai.adviser.vo;

import java.io.Serializable;

/**
 * 查询投资者产生的利润入参
 * @author caojia
 */
public class InvestorProfitParamVO implements Serializable{
    
    
    /**
     * 
     */
    private static final long serialVersionUID = 4776571166848435660L;

    /**
     * 投资者编号
     */
    private String investorNo;
    
    /**
     * 投资者名称
     */
    private String investorName;
    
    /**
     * 营销人员编号
     */
    private String marketerNo;
    

    public String getMarketerNo() {
        return marketerNo;
    }

    public void setMarketerNo(String marketerNo) {
        this.marketerNo = marketerNo;
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

    
}
