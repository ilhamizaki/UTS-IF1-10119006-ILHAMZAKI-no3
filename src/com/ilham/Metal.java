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
public class Metal extends HardRock implements HeavyMetal, Punk {

    @Override
    public void genreHeavyMetal(String artistName) {
        System.out.println(artistName + " adalah musisi HeavyMetal");
    }

    @Override
    public void genrePunk(String artistName) {
        System.out.println(artistName + " adalah musisi Punk");
    }
    
    
}
