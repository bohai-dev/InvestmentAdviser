package com.bohai.adviser.vo;

import java.io.Serializable;

/**
 * 查询营销人员产生的利润入参
 * @author caojia
 */
public class MarketerProfitParamVO implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 5593156773717195307L;

    /**
     * 营销人员编号
     */
    private String marketerNo;
    
    /**
     * 营销人员名称
     */
    private String marketerName;

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
    
    
}
