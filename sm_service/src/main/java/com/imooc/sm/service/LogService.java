package com.imooc.sm.service;

import com.imooc.sm.entity.Log;

import java.util.List;

public interface LogService {
    void addSystemLog(Log log);
    void addLoginLog(Log log);
    void addOperationLog(Log log);
    List<Log> selectSystemLog(String type);
    List<Log> selectLoginLog(String type);
    List<Log> selectOperationLog(String type);
}
