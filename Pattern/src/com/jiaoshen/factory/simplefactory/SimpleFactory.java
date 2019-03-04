package com.jiaoshen.factory.simplefactory;
import com.jiaoshen.factory.bean.GreenTea;
import com.jiaoshen.factory.bean.RedTea;
import com.jiaoshen.factory.bean.Tea;
/**
 * 简单工厂模式 根据传入的类型来生成类（传入的类型可以是字符串或是枚举类）
 * @author jiaoshen
 *
 */

public class SimpleFactory {
	static Tea createTea(String type){
		if ("red".equals(type)) {
			return new RedTea();
		}
		else if("green".equals(type)) {
			return new GreenTea();
		}
		else{
			return null;
		}
	}

}
