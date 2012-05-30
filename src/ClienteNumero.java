import java.rmi.*;
import java.rmi.Naming;
	public class ClienteNumero{
		public static void main(String arg []){
			try{
				Numero obj=(Numero)Naming.lookup("rmi://localhost/elNumero"); //Obtener Referencia del Objeto
				for(int i=0;i<=10;i++){
                                    System.out.println("El numero obtenido del objeto remoto:"+obj.getNumero());
                                }
                                
				
			}
			catch(Exception e){
				System.out.println("excpcion del cliente "+e);
			}
		}
	}