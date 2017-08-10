package com.bohai.adviser.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bohai.adviser.exception.BohaiException;
import com.bohai.adviser.service.ProfitQueryService;
import com.bohai.adviser.vo.InvestorProfitParamVO;
import com.bohai.adviser.vo.InvestorProfitResultVO;
import com.bohai.adviser.vo.MarketerProfitParamVO;
import com.bohai.adviser.vo.MarketerProfitResultVO;
import com.bohai.adviser.vo.MediatorProfitParamVO;
import com.bohai.adviser.vo.MediatorProfitResultVO;

/**
 * 查询利润
 * @author caojia
 *
 */
@RestController
public class ProfitController {

    static Logger logger = Logger.getLogger(ProfitController.class);
    
    @Autowired
    private ProfitQueryService profitQueryService;
    
    @RequestMapping(value="queryInvestorProfit")
    public List<InvestorProfitResultVO> queryInvestorProfit(@RequestBody InvestorProfitParamVO paramVO) throws BohaiException{
        
        return this.profitQueryService.queryInvestorProfit(paramVO);
        
    }
    
    @RequestMapping(value="queryMediatorProfit")
    public List<MediatorProfitResultVO> queryMediatorProfit(@RequestBody MediatorProfitParamVO paramVO) throws BohaiException{
        
        return this.profitQueryService.queryMediatorProfit(paramVO);
        
    }
    
    @RequestMapping(value="queryMarketerProfit")
    public List<MarketerProfitResultVO> queryMarketerProfit(@RequestBody MarketerProfitParamVO paramVO) throws BohaiException{
        
        return this.profitQueryService.queryMarketerProfit(paramVO);
        
    }
    
    
}
