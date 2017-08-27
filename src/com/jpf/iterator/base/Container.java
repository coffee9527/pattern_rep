package com.jpf.iterator.base;
/**
 * 聚合类接口，持有自己的迭代器对象
 * @author Administrator
 *
 */
public interface Container {
	public Iterator getIterator();
}
