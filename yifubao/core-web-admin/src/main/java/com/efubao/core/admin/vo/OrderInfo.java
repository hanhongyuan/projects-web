package com.efubao.core.admin.vo;

import java.util.List;

import com.efubao.core.order.domain.BaseOrder;
import com.efubao.core.order.domain.OrderCustomDemand;
import com.efubao.core.order.domain.OrderCustomerInfo;
import com.efubao.core.sp.domain.ServiceProvider;

/**
 * 
 * Title: 订单列表中的一些信息<br>
 * Description: <br>
 * Date: 2016年3月12日 <br>
 * 
 * @author duandingyang
 */
public class OrderInfo extends BaseOrder {

	private static final long serialVersionUID = 1L;
	private ServiceProvider serviceProvider;
	// 多个供应商竞标
	private List<ServiceProvider> serviceProviderList;
	private int serviceProviderListSize;
	private OrderCustomDemand orderCustomDemand;
	private OrderCustomerInfo orderCustomerInfo;

	public OrderCustomerInfo getOrderCustomerInfo() {
		return orderCustomerInfo;
	}

	public void setOrderCustomerInfo(OrderCustomerInfo orderCustomerInfo) {
		this.orderCustomerInfo = orderCustomerInfo;
	}

	public int getServiceProviderListSize() {
		return serviceProviderListSize;
	}

	public void setServiceProviderListSize(int serviceProviderListSize) {
		this.serviceProviderListSize = serviceProviderListSize;
	}

	public OrderCustomDemand getOrderCustomDemand() {
		return orderCustomDemand;
	}

	public void setOrderCustomDemand(OrderCustomDemand orderCustomDemand) {
		this.orderCustomDemand = orderCustomDemand;
	}

	public List<ServiceProvider> getServiceProviderList() {
		return serviceProviderList;
	}

	public void setServiceProviderList(List<ServiceProvider> serviceProviderList) {
		this.serviceProviderList = serviceProviderList;
	}

	public ServiceProvider getServiceProvider() {
		return serviceProvider;
	}

	public void setServiceProvider(ServiceProvider serviceProvider) {
		this.serviceProvider = serviceProvider;
	}

}
