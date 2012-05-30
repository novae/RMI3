import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.Naming;

public class NumeroImpl extends UnicastRemoteObject implements Numero{
		int cont=0;
		public NumeroImpl() throws RemoteException{
			super();
		}  //El objeto remoto existe y esta listo para aceptar invocaciones
		
		public int getNumero()throws RemoteException{
                    int ret=cont++;
                    return ret;
		}
		
		public static void main(String [] args){
			try{
				NumeroImpl obj=new NumeroImpl();
				Naming.rebind("rmi://localhost/elNumero",obj); //Registrar Objetos en el servidor
				System.out.println("Objeto registrado en el servidor de nombres");
			}
			catch(Exception e){
				System.err.println(e);
			}
		}
}