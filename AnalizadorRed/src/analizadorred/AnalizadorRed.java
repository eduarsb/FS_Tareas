/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizadorred;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author Eduardo
 */
public class AnalizadorRed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnknownHostException, IOException {
        // TODO code application logic here
        
        IAnalizador ia = new IAnalizador();
        ia.setVisible(true);
        
        /*
        String ip_inicio = "192.168.100.1";
        String ip_final = "192.168.100.20";

        String[] ips_inicio = ip_inicio.split("\\.");
        String[] ips_final = ip_final.split("\\.");
        
        int ipi = Integer.parseInt(ips_inicio[3]);
        int ipf = Integer.parseInt(ips_final[3]);

        for (int i = ipi; i <= ipf; i++) {
            String ip = ips_inicio[0]+"."+ips_inicio[1]+"."+ips_inicio[2]+"."+i;
            InetAddress inet = InetAddress.getByName(ip);
            System.err.print(ip+" ");
            System.out.println(inet.isReachable(5000) ? "Host is reachable" : "Host is NOT reachable");
        }
         */
        //System.out.println("Sending Ping Request to " + ipAddress);
        //System.out.println(inet.isReachable(5000) ? "Host is reachable" : "Host is NOT reachable");
        
    }
    
}
