/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ilham;

/**
 *
 * @author
 * NAMA     : Ilham zaki
 * Kelas    : IF1
 * NIM      : 10119006
 * Deskripsi Program : Genre Musik
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HardRock hard = new HardRock();
        hard.genreBlues("Jimmy Hendrik");
        hard.genreJazz("Chad Baker");
        
        Folk folk = new Folk();
        folk.genreFolk("Bob Dylan");
        
        Rockabilly rockabilly = new Rockabilly();
        rockabilly.genreRockabilly("Elvis Presley");
        
        hard.genreProgressiveRock("DreamTheater");
        hard.genrePsycehedellic("The Doors");
        hard.genrePopRock("Kiss");
        
        Metal metal = new Metal();
        metal.genrePunk("MXPX");
        metal.genreHeavyMetal("METALLICA");
        
        GrindCore grind = new GrindCore();
        grind.genreGrindCore("Mesin Tempur");
        
        DeathMetal deathMetal = new DeathMetal();
        deathMetal.genreDeathMetal("JASAD");
        
        DeathCoreKepiting kepiting = new DeathCoreKepiting();
        kepiting.genreDeathCoreKepiting("Revenge The Fate");
        
        BlackMetal blackMetal = new BlackMetal();
        blackMetal.genreBlackMetal("Behemoth");
        
        NewSkul newSkul = new NewSkul();
        newSkul.genreNewSkul("HATEBREED");
    }
    
}
