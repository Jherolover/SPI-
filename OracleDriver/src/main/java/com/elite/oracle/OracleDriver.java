package com.elite.oracle;


import com.elite.common.DriverManager;



/**
 * 扩展实现  com.elite.oracle.OracleDriver
 * com.elite.common.DriverManager
 */
public class OracleDriver implements DriverManager {
    @Override
    public String getConnectionInfo() {
        return "这是oracle数据库连接的扩展实现";
    }
}
