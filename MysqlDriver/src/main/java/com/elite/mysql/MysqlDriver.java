package com.elite.mysql;


import com.elite.common.DriverManager;

/**
 * SPI：MySQL对于 getConnectionInfo 的一种实现
 *
 */
public class MysqlDriver implements DriverManager
{

    @Override
    public String getConnectionInfo() {
        return "this is mysqldriver";
    }
}
