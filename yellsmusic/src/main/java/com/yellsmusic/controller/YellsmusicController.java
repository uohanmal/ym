package com.yellsmusic.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yellsmusic.dao.YellsmusicDAO;
import com.yellsmusic.domain.YellsmusicVO;
import com.yellsmusic.service.YellsmusicService;

@Controller
@RequestMapping("/yellsmusic/*")
public class YellsmusicController {

 @Inject
 private YellsmusicService service;

 @RequestMapping(value = "/list", method = RequestMethod.GET)
 public void getList(Model model) throws Exception {
  
  List<YellsmusicVO> list = null;
  list = service.list();
  model.addAttribute("list", list);
 }
}