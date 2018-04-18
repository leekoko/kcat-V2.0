package cn.kcat.common.utils;

import java.util.Collection;
import java.util.Map;



import org.apache.log4j.Logger;

import net.sf.json.util.JSONUtils;

public class Tools {

	private static Logger log = Logger.getLogger(Tools.class.getName());

	/**
	 * 判断对象是否Empty(null或元素为0)<br>
	 * 实用于对如下对象做判断:String Collection及其子类 Map及其子类
	 * 
	 * @param pObj
	 *            待检查对象
	 * @return boolean 返回的布尔值
	 */
	@SuppressWarnings("unchecked")
	public static boolean isEmpty(Object pObj) {
		if (pObj == null)
			return true;
		if (pObj == "")
			return true;
		if (pObj instanceof String) {
			if (((String) pObj).length() == 0) {
				return true;
			}
			if (((String) pObj).equalsIgnoreCase("null")) {
				return true;
			}
		} else if (pObj instanceof Collection) {
			if (((Collection) pObj).size() == 0) {
				return true;
			}
		} else if (pObj instanceof Map) {
			if (((Map) pObj).size() == 0) {
				return true;
			}
		} else if (JSONUtils.isArray(pObj)) {
			try {
				if (((Object[]) pObj).length == 0) {
					return true;
				}
			} catch (Exception e) {
			}
		}
		return false;
	}

	/**
	 * 判断对象是否为NotEmpty(!null或元素>0)<br>
	 * 实用于对如下对象做判断:String Collection及其子类 Map及其子类
	 * 
	 * @param pObj
	 *            待检查对象
	 * @return boolean 返回的布尔值
	 */
	@SuppressWarnings("unchecked")
	public static boolean isNotEmpty(Object pObj) {
		if (pObj == null)
			return false;
		if (pObj == "")
			return false;
		if (pObj instanceof String) {
			if (((String) pObj).length() == 0) {
				return false;
			}
			if (((String) pObj).equalsIgnoreCase("null")) {
				return false;
			}
		} else if (pObj instanceof Collection) {
			if (((Collection) pObj).size() == 0) {
				return false;
			}
		} else if (pObj instanceof Map) {
			if (((Map) pObj).size() == 0) {
				return false;
			}
		} else if (JSONUtils.isArray(pObj)) {
			try {
				if (((Object[]) pObj).length == 0) {
					return false;
				}
			} catch (Exception e) {
			}
		}
		return true;
	}



}
