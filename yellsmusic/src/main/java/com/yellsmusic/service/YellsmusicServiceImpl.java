package com.yellsmusic.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.yellsmusic.dao.YellsmusicDAO;
import com.yellsmusic.domain.YellsmusicVO;

@Service
public class YellsmusicServiceImpl implements YellsmusicService {

 @Inject
 private YellsmusicDAO dao;
 
 @Override
 public List<YellsmusicVO> list() throws Exception {

  return dao.list();
 }

}