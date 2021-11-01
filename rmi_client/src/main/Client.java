package main;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {
    public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException {
        RemoteInterface service = (RemoteInterface) Naming.lookup("rmi://127.0.0.1/RemoteHello");
        System.out.println(service.sayHello());
    }
}
