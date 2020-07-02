package com.ms.example;

import com.ms.example.registration.EurekaServer;
import com.ms.example.rest.order.items.service.OrderItemServer;
import com.ms.example.rest.order.service.OrderServer;
import com.ms.example.web.WebServer;

public class Main {
	public static void main(String[] args) {

		String serverName = "";

		switch (args.length) {
		case 2:
			System.setProperty("server.port", args[1]);
		case 1:
			serverName = args[0].toLowerCase();
			break;

		default:
			return;
		}

		if (serverName.equals("eureka")) {
			EurekaServer.main(args);
		} else if (serverName.equals("orderItem")) {
			OrderServer.main(args);
		} else if (serverName.equals("order")) {
			OrderItemServer.main(args);
		} else if (serverName.equals("web")) {
			WebServer.main(args);
		} else {
			System.out.println("Unknown server type: " + serverName);
		}
	}
}
