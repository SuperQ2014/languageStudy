package skyler.tao.java.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteReadExample {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("temp.txt");
		write(path);
		read(path);
	}

	private static void write(Path path) throws IOException {

		String input = "  This is a input string!  ";
		byte[] inputBytes = input.getBytes();
		ByteBuffer buffer = ByteBuffer.wrap(inputBytes);
		FileChannel channelWrite = FileChannel.open(path, StandardOpenOption.CREATE,StandardOpenOption.WRITE);
		channelWrite.write(buffer);
		channelWrite.close();
	}

	private static void read(Path path) throws IOException {

		FileChannel channelRead = FileChannel.open(path);
		ByteBuffer buffer = ByteBuffer.allocate(512);
		channelRead.read(buffer);
		byte[] byteArray = buffer.array();
//		String fileContent = byteArray.toString();	//not right
		String fileContent = new String(byteArray).trim();
		System.out.println("File content: " + fileContent);
		channelRead.close();
	}
}
