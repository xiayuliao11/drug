package com.jk.service;

import com.jk.mapper.PortMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class PortServiceImpl implements PortsService {

    @Autowired
    private PortMapper portMapper;

}
