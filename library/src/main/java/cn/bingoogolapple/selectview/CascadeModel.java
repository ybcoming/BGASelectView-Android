package cn.bingoogolapple.selectview;

import java.util.List;

/**
 * 作者:王浩 邮件:bingoogolapple@gmail.com
 * 创建时间:15/5/17 12:45
 * 描述:级联数据模型
 */
public class CascadeModel {
    public String id;
    public String name;
    public List<CascadeModel> childrens;
}