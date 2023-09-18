package designpatterns.proxy.machine;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MachineRemote extends Remote {
    int getCount() throws RemoteException;
    State getState() throws RemoteException;
}
