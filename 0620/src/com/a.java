package com;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

public class a {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress address=InetAddress.getByName("jlb");
		System.out.println(address.getHostAddress());
	}
}
