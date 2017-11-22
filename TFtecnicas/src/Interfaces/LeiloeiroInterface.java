/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;


import Server.Lote;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author slack
 */
public class LeiloeiroInterface extends Remote {
    public void criarLote(String nome, double preco, long duracao) throws RemoteException; // Cria lote e o inicia
	public boolean encerraLote(int id) throws RemoteException;
        public String existeLote(int id) throws RemoteException;
        public void atualizaLotes() throws RemoteException;
        public boolean enviarLance(double valor, int cod_lote, String comprador) throws RemoteException; // Envia lance
	public void notificaNovoLote(Lote lote) throws RemoteException;
        public void notificaAtualizacao(Lote lote) throws RemoteException;
        public void notificaEncerramento(Lote lote) throws RemoteException;
        public int getNextId() throws RemoteException;
}
