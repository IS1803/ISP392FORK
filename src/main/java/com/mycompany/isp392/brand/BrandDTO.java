/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.isp392.brand;

/**
 *
 * @author Oscar
 */
public class BrandDTO {
    private int brandID;
    private String brandName;
    private int status;

    public BrandDTO(int brandID, String brandName, int status) {
        this.brandID = brandID;
        this.brandName = brandName;
        this.status = status;
    }

    public BrandDTO() {
    }

    public int getBrandID() {
        return brandID;
    }

    public void setBrandID(int brandID) {
        this.brandID = brandID;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
