package com.bohai.adviser.service;

import java.util.List;

import com.bohai.adviser.exception.BohaiException;
import com.bohai.adviser.vo.InvestorProfitParamVO;
import com.bohai.adviser.vo.InvestorProfitResultVO;
import com.bohai.adviser.vo.MarketerProfitParamVO;
import com.bohai.adviser.vo.MarketerProfitResultVO;
import com.bohai.adviser.vo.MediatorProfitParamVO;
import com.bohai.adviser.vo.MediatorProfitResultVO;

/**
 * 利润查询api接口
 * @author caojia
 *
 */
public interface ProfitQueryService {
    
    /**
     * 查询客户产生的利润
     * @param paramVO
     * @return
     * @throws BohaiException
     */
    public List<InvestorProfitResultVO> queryInvestorProfit(InvestorProfitParamVO paramVO) throws BohaiException;

    /**
     * 查询居间人产生的利润
     * @param paramVO
     * @return
     * @throws BohaiException
     */
    public List<MediatorProfitResultVO> queryMediatorProfit(MediatorProfitParamVO paramVO) throws BohaiException;
    
    /**
     * 查询营销人员产生的利润
     * @param paramVO
     * @return
     * @throws BohaiException
     */
    public List<MarketerProfitResultVO> queryMarketerProfit(MarketerProfitParamVO paramVO) throws BohaiException;
}
