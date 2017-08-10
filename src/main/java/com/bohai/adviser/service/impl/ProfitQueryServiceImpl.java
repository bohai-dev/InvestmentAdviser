package com.bohai.adviser.service.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.bohai.adviser.dataSource.DataSourceContextHolder;
import com.bohai.adviser.dataSource.DataSourceType;
import com.bohai.adviser.exception.BohaiException;
import com.bohai.adviser.persistence.sjzx.CrmCustomerMapper;
import com.bohai.adviser.persistence.sjzx.CrmMarketerMapper;
import com.bohai.adviser.persistence.sjzx.CrmMediatorMapper;
import com.bohai.adviser.service.ProfitQueryService;
import com.bohai.adviser.vo.InvestorProfitParamVO;
import com.bohai.adviser.vo.InvestorProfitResultVO;
import com.bohai.adviser.vo.MarketerProfitParamVO;
import com.bohai.adviser.vo.MarketerProfitResultVO;
import com.bohai.adviser.vo.MediatorProfitParamVO;
import com.bohai.adviser.vo.MediatorProfitResultVO;

/**
 * 查询利润实现类
 * @author caojia
 *
 */
@Service("profitQueryService")
public class ProfitQueryServiceImpl implements ProfitQueryService {
    
    static Logger logger = Logger.getLogger(ProfitQueryServiceImpl.class);
    
    @Autowired
    private CrmCustomerMapper crmCustomerMapper;
    
    @Autowired
    private CrmMediatorMapper crmMediatorMapper;
    
    @Autowired
    private CrmMarketerMapper crmMarketerMapper;

    @Override
    public List<InvestorProfitResultVO> queryInvestorProfit(InvestorProfitParamVO paramVO) throws BohaiException {
        
        logger.debug("查询投资者产生的利润入参："+JSON.toJSONString(paramVO));
        DataSourceContextHolder.setDbType(DataSourceType.SJZX);
        List<InvestorProfitResultVO> list = this.crmCustomerMapper.queryInvestorProfitByMarketer(paramVO);
        logger.debug("查询投资者产生的利润出参："+JSON.toJSONString(list));
        return list;
        
    }

    @Override
    public List<MediatorProfitResultVO> queryMediatorProfit(MediatorProfitParamVO paramVO) throws BohaiException {

        DataSourceContextHolder.setDbType(DataSourceType.SJZX);
        return this.crmMediatorMapper.queryMediatorProfitByMarketer(paramVO);
    }

    @Override
    public List<MarketerProfitResultVO> queryMarketerProfit(MarketerProfitParamVO paramVO) throws BohaiException {
        
        DataSourceContextHolder.setDbType(DataSourceType.SJZX);
        return this.crmMarketerMapper.queryMarketerSelfProfit(paramVO);
    }

}
