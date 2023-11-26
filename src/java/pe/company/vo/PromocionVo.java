/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.company.vo;

import java.util.Date;

/**
 *
 * @author jc_va
 */
public class PromocionVo {
    
    private int idpromo;
    private String despromo;
    private String fchaini;
    private String fchafin;

    public PromocionVo() {
    }

    public PromocionVo(int idpromo, String despromo, String fchaini, String fchafin) {
        this.idpromo = idpromo;
        this.despromo = despromo;
        this.fchaini = fchaini;
        this.fchafin = fchafin;
    }

    public int getIdpromo() {
        return idpromo;
    }

    public void setIdpromo(int idpromo) {
        this.idpromo = idpromo;
    }

    public String getDespromo() {
        return despromo;
    }

    public void setDespromo(String despromo) {
        this.despromo = despromo;
    }

    public String getFchaini() {
        return fchaini;
    }

    public void setFchaini(String fchaini) {
        this.fchaini = fchaini;
    }

    public String getFchafin() {
        return fchafin;
    }

    public void setFchafin(String fchafin) {
        this.fchafin = fchafin;
    }

    
    
    
    
}
