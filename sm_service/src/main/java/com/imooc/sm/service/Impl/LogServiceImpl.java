package com.imooc.sm.service.Impl;

import com.imooc.sm.dao.LogDao;
import com.imooc.sm.entity.Log;
import com.imooc.sm.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("logService")
public class LogServiceImpl implements LogService {
    @Autowired
    private LogDao logDao;
    public void addSystemLog(Log log) {
        log.setOprTime(new Date());
        log.setType("system");
        logDao.insert(log);
    }

    public void addLoginLog(Log log) {
        log.setOprTime(new Date());
        log.setType("login");
        logDao.insert(log);
    }

    public void addOperationLog(Log log) {
        log.setOprTime(new Date());
        log.setType("operation");
        logDao.insert(log);
    }

    public List<Log> selectSystemLog(String type) {
        return logDao.selectByType("system");
    }

    public List<Log> selectLoginLog(String type) {
        return logDao.selectByType("login");
    }

    public List<Log> selectOperationLog(String type) {
        return logDao.selectByType("operation");
    }
}
