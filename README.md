# TZCC-REN-ADMIN SYSTEM 


### 介绍


后台管理系统开发框架，页面搭建基于element-template，后端采用springboot多模块，技术选型为springboot-jpa,前后端完全分离

vue3.0

#### 系统介绍  

扫描二维码查看公众号-System-v2.x

![](./资料/qrcode_for_gh_ebb533508d15_258.jpg)

#### 开发日志

2022-04-19

    （新增）国际化配置（仅后端）
    （新增）系统字典模块

2021-11-23

    （新增）表格支持排序，排序的优先级:第一次进行排序的字段具有最高优先级（不管升序和降序和多次改变都一样，如需改变优先级请先清空排序）
    （新增）动态换肤功能
    （优化）vue升级到3.2.0
    （优化）element-plus升级到1.2.0-beta.3
    （优化）支持多级菜单（含外部网页）

2021-07-01

    （新增）支付服务项目（后端服务）

2021-06-08

    （优化）表格页检索可选（顶部或弹出框），默认顶部显示

2021-05-13

    （优化）后端接口调用采用nacos+fegin
    （新增）系统编码自动生成功能，需配置

2021-04-05

    （优化）剥离前端组件，上传到npm,方便前端分布式项目开发
    （优化）tinymce富文本编辑器接入（组件支持）

2021-03-30

    （新增）菜单路由支持外部服务（分布式项目，加入其他前端项目页面）
    （优化）菜单维护界面树型表格，顶部导航路由样式优化

2021-03-21
    
    （新增）顶部导航优化
          -将面包屑换成卡片模式并加入缓存
          -中心区域刷新功能，不足:刷新将会清空中心区域组件所有实例缓存

2021-03-10

    （新增）表格组件TZTable
       -新增删除之前的prop,beforeDeleteData,这是一个异步的方法，返回false(===)中断删除操作

    （新增）可编辑表格
         -批量保存删除
         -字段验证

    （新增）后端JPA querydsl工具类
        -BaseService get查询querydsl的实现（不支持级联）

2021-02-14

    （升级）vue3.0环境
        - 富文本编辑器升级暂未完成  

2021-02-06

    （新增）基础数据-备忘录功能 [所有]
          - 富文本:图片上传（base64）,视频上传

    （优化）超级管理员权限菜单
        - 企业（用户组）下的用户权限一致 
        - 菜单可以让某一些客户有权限访问	
        - 左侧菜单显示:系统菜单+没有指定客户的菜单（==超级管理员可见的菜单）

2021-01-01  Init