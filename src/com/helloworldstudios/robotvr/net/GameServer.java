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
       // Log.d("net",message);
        double x = Double.parseDouble(m[0]);
        double y = Double.parseDouble(m[1]);
        game.camera.pos.x =(float) (x/32);
        game.camera.pos.y =(float) (y/32)+0.72f;// the value is to translate the 2d location of the robot into an approximate 3D one

       
    }

   
}