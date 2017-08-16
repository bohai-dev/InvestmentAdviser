package com.bohai.adviser.service;

import com.bohai.adviser.exception.BohaiException;
import com.bohai.adviser.vo.QueryCrmCustomerParamVO;
import com.bohai.adviser.vo.QueryInvestorOverviewResultVO;

public interface CrmCustomerService {

    /**
     * 查询客户简介
     * @param paramVO
     * @return
     * @throws BohaiException
     */
    public QueryInvestorOverviewResultVO queryInvestorOverview(QueryCrmCustomerParamVO paramVO) throws BohaiException;
    
    
}
