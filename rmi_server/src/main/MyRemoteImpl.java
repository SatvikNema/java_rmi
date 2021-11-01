package main;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements RemoteInterface {
    public MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() {
        System.out.println("Method called remotely! :)");
        return "Hello world!";
    }
}
