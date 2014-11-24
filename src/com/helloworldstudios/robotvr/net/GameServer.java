package com.helloworldstudios.robotvr.net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

import com.helloworldstudios.robotvr.MainActivity;


public class GameServer extends Thread {

    private DatagramSocket socket;
    private MainActivity game;
    

    public GameServer(MainActivity game) {
        this.game = game;
        try {
            this.socket = new DatagramSocket(1337);
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    public void run() {
        while (true) {
            byte[] data = new byte[1024];
            DatagramPacket packet = new DatagramPacket(data, data.length);
            try {
                socket.receive(packet);
            } catch (IOException e) {
                e.printStackTrace();
            }
            this.parsePacket(packet.getData(), packet.getAddress(), packet.getPort());
        }
    }

    private void parsePacket(byte[] data, InetAddress address, int port) {
        String message = new String(data).trim();
        String[] m = message.split(",");
        int x = Integer.parseInt(m[0]);
        int y = Integer.parseInt(m[1]);
        game.camera.pos.x =x;
        game.camera.pos.y =y;
//        if(x>0)game.camera.pos.x+=0.3125f;
//        if(x<0)game.camera.pos.x-=0.3125f;
//        if(y>0)game.camera.pos.y+=0.3125f;
//        if(y<0)game.camera.pos.y-=0.3125f;
       
    }

   
}