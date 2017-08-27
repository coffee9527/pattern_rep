package com.jpf.iterator.base.impl;

import com.jpf.iterator.base.Container;
import com.jpf.iterator.base.Iterator;

public class NameRepository implements Container {
	public String[] names = { "Robert", "John", "Julie", "Lora" };

	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}

	private class NameIterator implements Iterator {
		int index;//类的成员变量有初始默认值，int 0，boolean false,Object null;

		@Override
		public boolean hasNext() {
			if (index < names.length) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {
			if (this.hasNext()) {
				return names[index++];
			}
			return null;
		}

	}
}
