/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package socket;


/**
 *
 * @author herna
 */
public class Socket implements Runnable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cli = new Cliente();
        //Cliente cli2 = new Cliente();
        cli.setVisible(true);
        cli.setLocationRelativeTo(null);
        //cli2.setVisible(true);
        Servidor server= new Servidor();
        Thread mihilo = new Thread(server);
        mihilo.start();
        server.setVisible(true);
     
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
