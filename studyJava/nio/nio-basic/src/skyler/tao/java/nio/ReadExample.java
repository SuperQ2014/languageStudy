package skyler.tao.java.nio;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ReadExample {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		RandomAccessFile file = new RandomAccessFile("temp.txt", "r");
		FileChannel fileChannel = file.getChannel();
		ByteBuffer buffer = ByteBuffer.allocate(512);
		ByteBuffer anotherBuffer = ByteBuffer.allocate(512);
		while (fileChannel.read(buffer) > 0) {
			buffer.flip();
			while (buffer.hasRemaining()) {
				System.out.print((char)buffer.get());
			}
			buffer.clear();
		}
		System.out.println("\n=============");
		while (fileChannel.read(anotherBuffer) > 0) {
			anotherBuffer.flip();
			while (anotherBuffer.hasRemaining()) {
				System.out.print((char)anotherBuffer.get());
			}
			anotherBuffer.clear();
		}
		file.close();
	}
}
