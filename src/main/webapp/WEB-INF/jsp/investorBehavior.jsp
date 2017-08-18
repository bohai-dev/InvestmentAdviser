<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Welcome  </title>
    <!-- jquery -->
    <script type="text/javascript" src="resources/jquery/jquery-3.1.1.min.js"></script>
    <!-- Bootstrap -->
    <script type="text/javascript" src="resources/bootstrap/js/bootstrap.min.js"></script>
    <link href="resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="resources/css/dashboard.css" rel="stylesheet">
    <link href="resources/css/sticky-footer.css" rel="stylesheet">
    <script type="text/javascript" src="resources/tree/bootstrap-treeview.min.js"></script>
    <style>
        
        img {
            height:auto;
            width:1600px;
        }
    </style>
    <script type="text/javascript">
   
        $(function(){
            
            var treeObj = ${sessionScope.treeView};
            $('#tree').treeview({data: treeObj,enableLinks: true});
        });
        function queryImage(){
        	if(!isNull($('#mediatorNo').val())){
        		console.log($('#mediatorNo').val());
        		
        		var temp=$('#mediatorNo').val();
        		$("#picture").attr("src","resources/image/picture/" +temp+".jpg");    //修正收益
        		$("#picture_toatal").attr("src", "resources/image/picture_total/"+temp+".jpg");  //完整收益
        		$("#picture_hedge").attr("src", "resources/image/picture_hedge/"+temp+".jpg");    //修正盈亏
        		$("#picture_hedge_total").attr("src", "resources/image/picture_hedge_total/"+temp+".jpg"); //完整盈亏
        		
        	}else{
        		alert('请输入投资者代码，再查询！');
        	}
        	
        }
        function isNull(value){
            if(value == "" || value == undefined || value == null){
                return true;
            }else{
                return false;
            }
        } 
    </script>
  </head>

  <body>

    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container-fluid">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#">渤海期货</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
            
            
            
            <li><a href="#">欢迎：${sessionScope.user.fullName}</a></li>
            <li><a href="logout">退出</a></li>
          </ul>
          <form class="navbar-form navbar-right">
            <input type="text" class="form-control" placeholder="Search...">
          </form>
        </div>
      </div>
    </nav>

    <div class="container-fluid">
      <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <div id="tree"></div>
            
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h1 class="page-header">客户行为分析</h1>
           <div class="row">
                  <form class="form-horizontal" style="margin-top: 30px" id="mediatorForm">
                      <div class="form-group">
                      
                            <!-- <label for="reportMonth1" class="col-sm-2 col-md-1 col-md-offset-1 control-label">统计年月</label>
                            <div class="col-sm-10 col-md-2">
                              <input type="text" class="form-control" id="reportMonth1">
                            </div> -->
                            
                            <label for="mediatorNo" class="col-sm-2 col-md-1 control-label">投资者代码</label>
                            <div class="col-sm-10 col-md-2">
                              <input type="text" class="form-control" id="mediatorNo">
                            </div>                    
                           
                            
                            <div class="col-sm-10 col-md-2 col-md-offset-1 ">
                                <input class="btn btn-default col-xs-7" type="button" value="查询" onclick="queryImage()">
                            </div>
                            
                      </div>
                        
                  </form>
            </div>      
          <div class="row placeholders">
          	  <label>修正收益率图</label>
              <img alt="" src="resources/image/picture/10100187.jpg" id="picture">   
          	  <br><br><br>
          	
              <label>完整收益率图</label>  
              <img alt="" src="resources/image/picture_total/10100187.jpg" id="picture_toatal">
          	  <br><br><br> 
          </div>
          <div class="row placeholders">
              <label>修正盈亏图</label>
              <img alt="" src="resources/image/picture_hedge/10100187.jpg" id="picture_hedge">  
               <br><br><br>  
              <label>完整盈亏图</label>
              <img alt="" src="resources/image/picture_hedge_total/10100187.jpg" id="picture_hedge_total">  
          </div>

        </div>
      </div>
    
    </div>
    
    <footer class="footer">
      <div class="container">
        <p class="text-muted">Place sticky footer content here.</p>
      </div>
    </footer>

  </body>
</html>
