package com.bdqn.Server;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bdqn.Mapper.PruMapper;
@Service
public class PruServerImpl implements  PruServer {
   @Resource
   private PruMapper pruMapper;
   

}

