package com.bohai.adviser.dataSource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 动态数据源路由
 * @author caojia
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        
        return DataSourceContextHolder. getDbType();
        
    }

}
