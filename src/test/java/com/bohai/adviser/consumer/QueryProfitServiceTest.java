package com.bohai.adviser.consumer;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.alibaba.fastjson.JSON;
import com.bohai.dataCenter.api.ProfitQueryService;
import com.bohai.dataCenter.api.exception.BohaiException;
import com.bohai.dataCenter.api.vo.InvestorProfitParamVO;
import com.bohai.dataCenter.api.vo.InvestorProfitResultVO;

@ContextConfiguration(locations = "classpath:spring/dubbo-consumer.xml")
public class QueryProfitServiceTest extends AbstractJUnit4SpringContextTests{
    
    @Autowired
    private ProfitQueryService profitQueryService;
    
    @Test
    public void queryInvestorProfit() throws BohaiException{
        
        InvestorProfitParamVO paramVO = new InvestorProfitParamVO();
        
        paramVO.setInvestorName("王士杰");
        paramVO.setMarketerNo("19010001");
        List<InvestorProfitResultVO> list = this.profitQueryService.queryInvestorProfit(paramVO);
        
        System.out.println("查询利润输出："+JSON.toJSONString(list));
        
    }

}
