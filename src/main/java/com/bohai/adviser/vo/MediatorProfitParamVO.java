package com.bohai.adviser.vo;

import java.io.Serializable;

/**
 * 查询居间人产生的利润入参
 * @author caojia
 */
public class MediatorProfitParamVO  implements Serializable{
    
    /**
     * 
     */
    private static final long serialVersionUID = 3165937766958163070L;

    /**
     * 居间人编号
     */
    private String mediatorNo;
    
    /**
     * 居间人名称
     */
    private String mediatorName;
    
    /**
     * 营销人员编号
     */
    private String marketerNo;
    
    private String depNo;
    

    public String getDepNo() {
        return depNo;
    }

    public void setDepNo(String depNo) {
        this.depNo = depNo;
    }

    public String getMarketerNo() {
        return marketerNo;
    }

    public void setMarketerNo(String marketerNo) {
        this.marketerNo = marketerNo;
    }

    public String getMediatorNo() {
        return mediatorNo;
    }

    public void setMediatorNo(String mediatorNo) {
        this.mediatorNo = mediatorNo;
    }

    public String getMediatorName() {
        return mediatorName;
    }

    public void setMediatorName(String mediatorName) {
        this.mediatorName = mediatorName;
    }

    
    
}
