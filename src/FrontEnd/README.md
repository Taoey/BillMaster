# 项目使用指南

## 安装、运行

### 安装
```
npm install
```
### 测试环境运行
```
npm run dev
```
### 正式环境运行
```
npm run build
```

## 相关链接
- [iview-admin使用文档](https://lison16.github.io/iview-admin-doc/#/)

- [iview github 主页](https://github.com/iview/iview-admin)

- [iview-template github 主页](https://github.com/iview/iview-admin/tree/template)

## 文件结构
```shell
.
├── build  项目构建配置
├── config  开发相关配置
├── public  打包所需静态资源
└── src
    ├── api  AJAX请求
    └── assets  项目静态资源
        ├── icons  自定义图标资源
        └── images  图片资源
    ├── components  业务组件
    ├── config  项目运行配置
    ├── directive  自定义指令
    ├── libs  封装工具函数
    ├── locale  多语言文件
    ├── mock  mock模拟数据
    ├── router  路由配置
    ├── store  Vuex配置
    ├── view  页面文件
    └── tests  测试相关
```

## 添加一个新的左侧菜单

以添加的`账单管理`为例，在routers.js中添加如下代码 
``` js
  {
    path: '/bill',
    name: 'bill',
    component: Main,
    meta: {
      hideInBread: true,
      icon: 'ios-book',
    },
    children: [
      {
        path: 'detail',
        name: 'detail',
        meta: {
          icon: 'md-trending-up',
          title: '账单详情'
        },
        component: () => import('@/view/bill/index.vue')
      }
    ]
  },
```
添加菜单栏统一采用该方式，如果只有一栏（没有子菜单），children 中只需添加一个即可。`component`需要选择Main，只有这样才能保证组件不整个页面显示