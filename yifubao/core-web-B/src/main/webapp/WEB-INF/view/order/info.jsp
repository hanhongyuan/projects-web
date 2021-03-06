<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<script type="text/javascript">
$(function() {  
	$.ajax( {  
        type : "get",  
        url : "http://localhost:8080/core-web-C/publishOrder/orderCustomerInfoVo?orderNo=${orderNo }",
        dataType:"json",  
        success : function(msg) {
            //alert("Data Saved: " + msg.orderCustomerInfo.bespeakName+"--");
            $('#bespeakName').text(msg.orderCustomerInfo.bespeakName); 
            $('#bespeakPhone').text(msg.orderCustomerInfo.bespeakPhone); 
            $('#companyName').text(msg.orderCustomerInfo.companyName); 
            $('#addressDetail').text(msg.reciveAddress.addressDetail); 
            $('#customDepartment').text(msg.orderCustomerInfo.customDepartment);
            $('#orderMeasureAddress').text(msg.list[0].addressDetail);
        }
    });
	$.ajax( {  
        type : "get", 
        url : "http://localhost:8080/core-web-C/publishOrder/orderCustomDemandVo?orderNo=${orderNo }",
        dataType:"json",  
        success : function(msg) {
        	$('#customNum').text(msg.orderCustomDemand.customNum); 
        	$('#customBudget').text(msg.orderCustomDemand.customBudget+"￥"); 
        	$('#customCycle').text(msg.orderCustomDemand.customCycle+"个工作日"); 
        	$('#categoryName').text(msg.orderCustomDemand.categoryName); 
        	$('#categoryProperty').text(msg.orderCustomDemand.categoryProperty); 
        	$('#goodsName').text(msg.orderCustomGoods[0].goodsName); 
        }
    });
});
/* 上门量体之前状态的定制信息 */
</script>
<div class="leirong_2">
	<p>
		<span>定制信息</span>
	</p>
</div>
<div class="kehuinfo">
	<p>
		<span><img src="<%=basePath%>resources/img/tou_1.png">客户信息</span><label
			class="sem "><a href="#"><img
				src="<%=basePath%>resources/img/iconfont_1.png" />完善信息</a></label>
	</p>
</div>
<div class="bor_info">
	<div class="xiqinfo">
		<p>
			<span>姓名</span>：<a id="bespeakName"></a>
		</p>
		<p>
			<span>手机号</span>：<a id="bespeakPhone"></a>
		</p>
	</div>
	<div class="xiqinfo">
		<p>
			<span>企业名称</span>：<a id="companyName"></a>
		</p>
		<p>
			<span>企业地址</span>：<a id="addressDetail"></a>
		</p>
	</div>
	<div class="xiqinfo xiqinfo_1">
		<p>
			<span>定制部门</span>：<a id="customDepartment"></a>
		</p>
		<p>
			<span>量体地址</span>：<a id="orderMeasureAddress"></a>
		</p>
	</div>
</div>
<div class="kehuinfo">
	<p>
		<span><img src="<%=basePath%>resources/img/ye_1.png">客户定制需求</span><a
			href="#"><label class="sem "><img
				src="<%=basePath%>resources/img/iconfont_1.png" />完善定制需求</label></a>
	</p>
</div>
<div class="dingzfs">
	<p>
		<span>定制方式</span>：<label class="col">量体定制</label>
	</p>
	<p>
		<span>定制数量</span>：<label class="col" id="customNum"></label>
	</p>
	<p>
		<span>定制预算</span>：<label class="col" id="customBudget"></label>
	</p>
	<p>
		<span>定制周期</span>：<label class="col" id="customCycle"></label>
	</p>
	<p>
		<span>定制品类</span>：<label class="col" id="categoryName"></label>
	</p>
	<p>
		<span>定制属性</span>：<label class="col" id="categoryProperty"></label>
	</p>
	<p>
		<span>商品名称</span>：<label class="col" id="goodsName"><img
			src="<%=basePath%>resources/img/list1.png" /> <a href="#">
				查看商品详情 >></a></label>
	</p>
</div>
