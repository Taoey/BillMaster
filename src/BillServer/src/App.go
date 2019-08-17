package main

import (
	"BillServer/src/modules/myapi"
	"BillServer/src/myinit"
	"github.com/kataras/iris"
	"log"
)

var App *iris.Application

func main() {
	// 初始化
	myinit.InitConf()
	//myinit.InitMongo()

	// 初始化App
	App = iris.New()
	SetRoutes()

	// 启动
	run := App.Run(iris.Addr(myinit.GCF.UString("server.url")), iris.WithCharset("UTF-8"))
	log.Fatal(run)
}

// 设置路由
func SetRoutes() {
	//主页
	App.Get("/", myapi.Index)
	App.Get("/hello_json", myapi.IndexHelloJson)

	//根API
	RootApi := App.Party("api/")

	// upload
	RootApi.Post("/upload/ali_bill", iris.LimitRequestBodySize(5<<20), myapi.UploadAliBill)

}
