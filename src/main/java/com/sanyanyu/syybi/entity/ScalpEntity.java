package com.sanyanyu.syybi.entity;

import java.io.Serializable;

import org.apache.commons.lang3.StringUtils;

import com.sanyanyu.syybi.utils.SysUtil;

/**
 * 刷单分析的店铺列表
 * 
 * @Description: TODO
 * @author Ivan 2862099249@qq.com
 * @date 2015年7月28日 下午5:34:21 
 * @version V1.0
 */
public class ScalpEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String shop_id;
	private String shop_name;
	private String shop_type;
	private String rise_index;
	private String sales_amount;
	private String item_count;
	private String shua_amount;
	private String shua_volume;
	private String shua_count;
	private String shop_url;

	public String getShop_id() {
		return shop_id;
	}

	public void setShop_id(String shop_id) {
		this.shop_id = shop_id;
	}

	public String getShop_name() {
		return shop_name;
	}

	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
	}

	public String getShop_type() {
		return shop_type;
	}

	public void setShop_type(String shop_type) {
		this.shop_type = shop_type;
	}

	public String getRise_index() {
		return rise_index;
	}

	public void setRise_index(String rise_index) {
		this.rise_index = rise_index;
	}

	public String getSales_amount() {
		return sales_amount;
	}

	public void setSales_amount(String sales_amount) {
		this.sales_amount = sales_amount;
	}

	public String getItem_count() {
		return item_count;
	}

	public void setItem_count(String item_count) {
		this.item_count = item_count;
	}

	public String getShua_amount() {
		return shua_amount;
	}

	public void setShua_amount(String shua_amount) {
		this.shua_amount = shua_amount;
	}

	public String getShua_volume() {
		return shua_volume;
	}

	public void setShua_volume(String shua_volume) {
		this.shua_volume = shua_volume;
	}

	public String getShua_count() {
		return shua_count;
	}

	public void setShua_count(String shua_count) {
		this.shua_count = shua_count;
	}

	public String getShop_url() {
		if(StringUtils.isNotBlank(this.getShop_id())){
			return SysUtil.getShopUrl(this.getShop_id());
		}
		return shop_url;
	}

	public void setShop_url(String shop_url) {
		this.shop_url = shop_url;
	}

}
