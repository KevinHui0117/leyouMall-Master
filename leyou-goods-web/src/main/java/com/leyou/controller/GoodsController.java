package com.leyou.controller;

import com.leyou.service.GoodsHtmlService;
import com.leyou.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @Author: 98050
 * Time: 2018-10-17 16:06
 * Feature: 商品详情页面跳转
 */
@Controller
@RequestMapping("item")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @Autowired
    private GoodsHtmlService goodsHtmlService;

    @GetMapping("{id}.html")
    public String toItemPage(Model model,@PathVariable("id")String id){
        System.out.println(id);
        Long idN = Long.parseLong(id);
        //加载数据
        Map<String, Object> modelMap = this.goodsService.loadModel(idN);
        //把数据放入模型中
        model.addAllAttributes(modelMap);
        //页面静态化
        this.goodsHtmlService.asyncExecute(idN);
        return "item";

    }
}
