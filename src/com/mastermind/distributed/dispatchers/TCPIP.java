package com.mastermind.distributed.dispatchers;

import com.mastermind.types.Color;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

import com.mastermind.types.Error;

public class TCPIP extends utils.TCPIP {
    public TCPIP(Socket socket) {
        super(socket);
    }

    public TCPIP(ServerSocket serverSocket, Socket socket) {
        super(serverSocket, socket);
    }

    public static TCPIP createClientSocket() {
        try {
            Socket socket = new Socket("localhost", 2020);
            System.out.println("Cliente ---> Establecida la conexion");
            return new TCPIP(socket);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static TCPIP createServerSocket() {
        try {
            ServerSocket serverSocket = new ServerSocket(2020);
            System.out.println("Servidor ---> Esperando la conexion...");
            Socket socket = serverSocket.accept();
            System.out.println("Servidor ---> Recibida la conexion de " + socket.getInetAddress().getHostAddress() + ":"
                    + socket.getPort());
            return new TCPIP(serverSocket, socket);
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public void send(List<Color> colors) {
        if (colors == null) {
            this.send("null");
        } else {
            for (Color color: colors) {
                this.send(color.name());
            }
        }
    }
    public List<Color> receiveColors() {
        String colors = this.receiveLine();
        if (colors.equals("null")) {
            return null;
        } else {
            //TODO: parse String colors to array: format (?)
            return List.of();
        }
    }

    public Error receiveError() {
        String error = this.receiveLine();

        if(error.equals("null")){
            return null;
        }
        return Error.valueOf(error);
    }
}
