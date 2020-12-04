/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ilham;

/**
 *
 * @author Ilham zaki
 */
public class HardRock extends Rnb implements PopRock, ProgressiveRock, PsychedelicRock {
    
    public void genreHardRock(String artistName) {
        
    }

    @Override
    public void genrePopRock(String artistName) {
        System.out.println(artistName + " adalah musisi PopRock");
    }

    @Override
    public void genrePsycehedellic(String artistName) {
        System.out.println(artistName + " adalah musisi Psycehedellic");
    }
    
    @Override
    public void genreProgressiveRock(String artistName) {
        System.out.println(artistName + " adalah musisi ProgressiveRock");
    }

}
