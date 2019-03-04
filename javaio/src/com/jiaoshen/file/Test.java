package com.jiaoshen.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

import sun.launcher.resources.launcher;
import sun.reflect.generics.tree.IntSignature;

public class Test {
	public static void main(String[] args) throws Exception {
		int[] a ={1,3,5};
		List k = Arrays.asList(a);
		for (int i = 0; i < k.size(); i++) {
			System.out.println(k.get(i));

		}

		System.out.println(k);

	}

}
