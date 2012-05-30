import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Numero extends Remote{
	public int getNumero()throws RemoteException;
}