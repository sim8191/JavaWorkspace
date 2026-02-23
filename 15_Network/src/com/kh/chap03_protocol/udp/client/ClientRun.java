package com.kh.chap03_protocol.udp.client;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class ClientRun {
	public static void main(String[] args) {
		try {
			InetAddress server = InetAddress.getByName("localhost");
			int serverPort = 30001;
			
			// 랜덤포트번호 사용
			DatagramSocket socket = new DatagramSocket();
			String message = "데이터 전송 요청";
			byte[] sendData = message.getBytes();
			
			DatagramPacket sendPacket = 
					new DatagramPacket(sendData, sendData.length
							, server, serverPort);
			socket.send(sendPacket);
			
			// 요청메세지 전송 후 데이터 수신 대기
			byte[] data = new byte[1024];
			DatagramPacket receiveData = new DatagramPacket(data, data.length);
			
			socket.receive(receiveData);
			//====
//			socket.receive(sendPacket);// 가독성이 떨어져서 안쓰는거임
			
			String receiv = new String(
					receiveData.getData(), 0, receiveData.getLength()); //0번부터 마지막 문자까지 쭉
			System.out.println(receiv);
			
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
