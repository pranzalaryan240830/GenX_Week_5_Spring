package com.genx.spring_sets;

import java.util.HashSet;

public class Numbers {
	HashSet<Integer> st;

	public HashSet<Integer> getSt() {
		return st;
	}

	public void setSt(HashSet<Integer> st) {
		this.st = st;
	}

	@Override
	public String toString() {
		return "Numbers [st=" + st + "]";
	}

}
