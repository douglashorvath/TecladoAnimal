/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teclado.animal;

import Frames.Homescreen;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.xml.ws.Holder;

/**
 *
 * @author dough
 */
public class TecladoAnimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Homescreen hm;
        try {
            hm = new Homescreen();
            hm.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(TecladoAnimal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    
}
