/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlnhanvien.controller;

import qlnhanvien.dal.NhanVien_DAL;
import qlnhanvien.model.NhanVien_model;

/**
 *
 * @author nhatnguyen
 */
public class NhanVien_Controller {

    NhanVien_DAL nv = new NhanVien_DAL();

    public int InsertNV(NhanVien_model nvmodel) {
        return nv.Insert_Nhanvien(nvmodel);
    }
    public int DeleteNV(String manv){
        return nv.Delete_NhanVien(manv);
    }
}
