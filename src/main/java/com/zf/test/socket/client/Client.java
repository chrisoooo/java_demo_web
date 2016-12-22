package com.zf.test.socket.client;

import com.zf.test.po.ConsumerBean1;

import java.io.IOException;

/**
 * Created by chris on 16/9/21.
 */
public class Client {

	public static void main(String[] args) throws IOException {


        new Thread(new ClientThread(new ConsumerBean1())).start();


	}

}
