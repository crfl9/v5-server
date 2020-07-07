# V5

## 模块功能
- v5-service 核心业务逻辑
- v5-service-api service对外提供的rpc接口(资源有限，暂不使用rpc框架，但接口保留便于扩展)
- v5-job 定时任务
- v5-web restful接口暴露层
- v5-common web和service共用的部分
- v5-starter 项目启动器

## 启动方式

### 中间键
项目依赖的中间键可以通过docker一键拉起。
```bash
docker-compose up -d
```
### 配置文件
复制 `v5-starter/src/main/resources/application.yml.example`的文件，去掉example，变成你本地的配置文件


## 编码约定
- 项目中引入了kotlin依赖，可以在工具类和dto中使用kotlin，但核心逻辑必须使用java