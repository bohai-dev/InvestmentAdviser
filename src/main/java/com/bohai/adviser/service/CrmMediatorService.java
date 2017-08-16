package com.bohai.adviser.service;

import com.bohai.adviser.entity.sjzx.CrmMediator;
import com.bohai.adviser.exception.BohaiException;
import com.bohai.adviser.vo.QueryCrmMediatorParamVO;
import com.bohai.adviser.vo.QueryMediatorOverviewResultVO;

/**
 * 居间人接口
 * @author caojia
 *
 */
public interface CrmMediatorService {

    /**
     * 居间人变更
     * @param mediator
     * @throws BohaiException
     */
    public void modifyCrmMediator(CrmMediator mediator) throws BohaiException;
    
    public void removeCrmMediator(CrmMediator mediator) throws BohaiException;
    
    /**
     * 查询居间人简介
     * @param paramVO
     * @return
     * @throws BohaiException
     */
    public QueryMediatorOverviewResultVO queryMediatorOverview(QueryCrmMediatorParamVO paramVO) throws BohaiException;
}
