package com.zf.test.socket.server;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by chris on 16/9/21.
 */
public class Server {

	public static void main(String[] args) throws Exception {
		// 服务端在20006端口监听客户端请求的TCP连接
		ServerSocket server = new ServerSocket(20006);
		Socket client = null;
		boolean f = true;
        int i = 1;
		while (f) {
            System.out.println("server_start:" + i);
            // 等待客户端的连接，如果没有获取连接
			client = server.accept();
			System.out.println("与客户端连接成功！");
			// 为每个客户端连接开启一个线程
			new Thread(new ServerThread(client)).start();
            System.out.println("server_end:" + i);
            i++;
            Thread.sleep(1000);
		}
		server.close();
	}

}
