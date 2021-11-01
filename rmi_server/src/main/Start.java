package main;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class Start {
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        RemoteInterface remote = new MyRemoteImpl();
        System.out.println("Starting the rmi server...");
        Naming.rebind("RemoteHello", remote);
    }
}
