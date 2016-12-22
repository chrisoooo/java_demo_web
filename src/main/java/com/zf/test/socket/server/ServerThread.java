package com.zf.test.socket.server;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * Created by chris on 16/9/21.
 */
public class ServerThread implements Runnable {

	private Socket client = null;

	public ServerThread(Socket client) {
		this.client = client;
	}

	@Override
	public void run() {
		ObjectInputStream input = null;
		ObjectOutputStream out = null;
		try {
			// 获取Socket的输出流，用来向客户端发送数据
			out = new ObjectOutputStream(client.getOutputStream());
			// 获取Socket的输入流，用来接收从客户端发送过来的数据
			input = new ObjectInputStream(new BufferedInputStream(client.getInputStream()));

			Object obj = input.readObject();

			System.out.println("obj:" + obj);
			out.writeObject(obj);
			out.flush();

			out.close();
			client.close();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				client.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
