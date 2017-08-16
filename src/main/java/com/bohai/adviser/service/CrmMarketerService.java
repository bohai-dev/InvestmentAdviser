package com.bohai.adviser.service;

import com.bohai.adviser.entity.sjzx.CrmMarketer;
import com.bohai.adviser.exception.BohaiException;
import com.bohai.adviser.vo.QueryCrmMarketerParamVO;
import com.bohai.adviser.vo.QueryMarketerOverviewResultVO;

/**
 * 营销人员接口
 * @author caojia
 *
 */
public interface CrmMarketerService {

    /**
     * 营销人员变更
     * @throws BohaiException
     */
    public void modifyCrmMarketer(CrmMarketer marketer) throws BohaiException;
    
    /**
     * 营销人员删除
     * @param marketer
     * @throws BohaiException
     */
    public void removeCrmMarketer(CrmMarketer marketer) throws BohaiException;
    
    
    /**
     * 查询营销人员简介
     * @param paramVO
     * @return
     * @throws BohaiException
     */
    public QueryMarketerOverviewResultVO queryMarketerOverview(QueryCrmMarketerParamVO paramVO) throws BohaiException;
}
