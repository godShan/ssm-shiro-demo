package com.wys.demo.entity;
import java.io.Serializable;

/**
 *@author wys
 *@date 10:17 2018/5/15/015
 *@description mock实体类
 */
public class Mock implements Serializable {

	/**自增ID**/
	private Long ID;

	/**请求接口路径**/
	private String URL;

	/**返回参数**/
	private String DATA;

	/**创建时间**/
	private java.util.Date CREATEDAT;

	/**启用:1,停用:0**/
	private Integer isStart;

	/**备注**/
	private String remark;



	public void setID(Long ID){
		this.ID = ID;
	}

	public Long getID(){
		return this.ID;
	}

	public void setURL(String URL){
		this.URL = URL;
	}

	public String getURL(){
		return this.URL;
	}

	public void setDATA(String DATA){
		this.DATA = DATA;
	}

	public String getDATA(){
		return this.DATA;
	}

	public void setCREATEDAT(java.util.Date CREATEDAT){
		this.CREATEDAT = CREATEDAT;
	}

	public java.util.Date getCREATEDAT(){
		return this.CREATEDAT;
	}

	public void setIsStart(Integer isStart){
		this.isStart = isStart;
	}

	public Integer getIsStart(){
		return this.isStart;
	}

	public void setRemark(String remark){
		this.remark = remark;
	}

	public String getRemark(){
		return this.remark;
	}

}
