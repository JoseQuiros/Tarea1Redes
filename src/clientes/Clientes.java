/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

import java.net.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author jqm25
 */
public class Clientes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException  {
     GreetServer server=new GreetServer();
        server.start(6666);
    }

   

}

