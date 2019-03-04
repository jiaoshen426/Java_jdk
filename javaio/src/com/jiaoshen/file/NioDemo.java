package com.jiaoshen.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NioDemo {
	public static void main(String[] args) throws IOException {
	    String fileName="E:"+File.separator+"hello.txt";
	    File file = new File(fileName);
        FileOutputStream outputStream = new FileOutputStream(file);
        FileChannel channel = outputStream.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        String string = "java ";
        buffer.put(string.getBytes());
        buffer.flip();     //此处必须要调用buffer的flip方法
        channel.write(buffer);
        channel.close();
        outputStream.close();
}
}
