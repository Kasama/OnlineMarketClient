package br.usp.icmc.onlinemarketclient;

import java.net.Socket;

/**
 * Created by Lucas on 30/06/2015.
 */
public class OnlineMarketController {


    private Socket socket;

    public void setSocket(Socket s) {
        this.socket = s;
    }
}
