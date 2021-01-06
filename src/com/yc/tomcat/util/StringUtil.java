package com.yc.tomcat.util;

/**
 * 字符串工具类
 * @author ASUS
 *
 */

public class StringUtil {
	
	/**
	 * 空判断
	 * @param strs
	 * @return
	 */
	public static boolean checkNull(String ...strs ){
		if(strs==null||strs.length<=0){
			return true;
		}
		for(String str:strs){
			if(str==null||"".equals(str)){
				return true;
			}
		}
		return false;
	}

}
