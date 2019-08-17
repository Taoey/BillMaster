package myapi

import (
	. "BillServer/src/entity"
	. "BillServer/src/modules/myservice"
	"github.com/kataras/iris"
	"io/ioutil"
)

func UploadAliBill(ctx iris.Context) {
	file, _, _ := ctx.FormFile("file")
	bytes, _ := ioutil.ReadAll(file)
	s := string(bytes)
	UploadAliBillPrint(s)
	ctx.JSON(OKResponse("OK"))
}
