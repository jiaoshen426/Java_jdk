package com.jiaoshen.file;

import java.io.File;
import java.io.IOException;

public class FilesDemo {

	public static void main(String[] args)throws IOException {
		
		listFiles("E:\\demo\\file123");
	}
	
	public static void  listFiles(String path) throws IOException{
		File file = new File(path);
		if(!file.exists()){
			throw new IllegalArgumentException("文件" + path + "不存在");
		}
		else if(file.isFile()) {
			throw new IllegalArgumentException("文件" + path + "不是目录");
		}
		for(File file2 :file.listFiles()){
			if(file2 != null && file2.isDirectory()){
				listFiles( file2.getPath());
			}
			else{
				
				System.out.println(file2.getName());
			}
		}
	} 

}
