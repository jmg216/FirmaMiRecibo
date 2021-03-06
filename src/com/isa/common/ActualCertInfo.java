/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isa.common;

import com.isa.token.HandlerToken;
import java.util.HashMap;

/**
 *
 * @author JMiraballes
 */
public class ActualCertInfo {
    
    
    private HandlerToken handler;
    private String password;
    private HashMap aliasHash;
    private HashMap certs;
    private int certIndex;
    private String cedula;
    private String firmante;

    public String getFirmante() {
        return firmante;
    }

    public void setFirmante(String firmante) {
        this.firmante = firmante;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    private static ActualCertInfo actualCertInfo;
    
    private ActualCertInfo(){
        inicializar();
    }
    
    public static ActualCertInfo getInstance(){
        System.out.println("ActualCertInfo::getInstance init");
        if ( actualCertInfo == null ){
            actualCertInfo = new ActualCertInfo();
        }
        System.out.println("ActualCertInfo::getInstance Fin");
        return actualCertInfo;
    }
    
    public HandlerToken getHandler() {
        return handler;
    }

    public void setHandler(HandlerToken handler) {
        this.handler = handler;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public HashMap getCerts() {
        return certs;
    }

    public void setCerts(HashMap certs) {
        this.certs = certs;
    }

    public int getCertIndex() {
        return certIndex;
    }

    public void setCertIndex(int certIndex) {
        this.certIndex = certIndex;
    }

    public HashMap getAliasHash() {
        return aliasHash;
    }

    public void setAliasHash(HashMap aliasHash) {
        this.aliasHash = aliasHash;
    }
    
    
    public final void inicializar(){
        handler = null;
        password = null;
        cedula = null;
        certs = new HashMap();
        aliasHash = new HashMap();
        certIndex = -1;   
    }
  
    
    
    
}
