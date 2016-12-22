package com.zf.test.socket.client;

import com.zf.test.po.ConsumerBean1;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * Created by chris on 16/9/21.
 */
public class ClientThread implements Runnable {

	private ConsumerBean1 consumer = null;

	public ClientThread(ConsumerBean1 consumer) {
		this.consumer = consumer;
	}

	@Override
	public void run() {
		Socket client = null;
		ObjectOutputStream out = null;
		ObjectInputStream input = null;

		try {
			// 客户端请求与本机在20006端口建立TCP连接
			client = new Socket("127.0.0.1", 20006);
			client.setSoTimeout(10000);
			// // 获取键盘输入
			// BufferedReader input = new BufferedReader(new
			// InputStreamReader(System.in));
			// 获取Socket的输出流，用来发送数据到服务端
			out = new ObjectOutputStream(client.getOutputStream());

			out.writeObject(this.consumer);
			out.flush();

			// 获取Socket的输入流，用来接收从服务端发送过来的数据
			input = new ObjectInputStream(new BufferedInputStream(client.getInputStream()));
			Object obj = input.readObject();
			if (obj != null) {
				System.out.println("obj: " + obj);
			}

			input.close();
			if (client != null) {
				// 如果构造函数建立起了连接，则关闭套接字，如果没有建立起连接，自然不用关闭
				client.close(); // 只关闭socket，其关联的输入输出流也会被关闭
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				input.close();
			} catch (Exception ex) {
			}
			try {
				out.close();
			} catch (Exception ex) {
			}
			try {
				client.close();
			} catch (Exception ex) {
			}
		}
	}

}
