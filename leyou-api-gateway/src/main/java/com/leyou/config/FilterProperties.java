package com.leyou.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * @Author: 98050
 * @Time: 2018-10-24 16:55
 * @Feature: 过滤白名单
 */
@ConfigurationProperties(prefix = "leyou.filter")
public class FilterProperties {

    private List<String> allowPaths;

    public List<String> getAllowPaths() {
        return allowPaths;
    }

    public void setAllowPaths(List<String> allowPaths) {
        this.allowPaths = allowPaths;
    }
}
