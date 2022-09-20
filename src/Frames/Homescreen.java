/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import java.awt.AWTEvent;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.AWTEventListener;
import java.awt.event.KeyEvent;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author dough
 */
public class Homescreen extends javax.swing.JFrame {

    private static final int IMAGE_WIDTH = 470;
    private static final int IMAGE_HEIGHT = 350;
    
    
    public Homescreen() throws IOException{
        initComponents();
        this.setTitle("Teclado Animal!");
        Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Images/icon.png"));
        ImageIcon icon = new ImageIcon(image);
        setIconImage(icon.getImage());
        
        this.setUndecorated(true);
        this.getContentPane().setBackground(Color.WHITE);
        
        lbImage.setIcon(GeraImagem(new File("IMAGEM/homescreen.png"))); 
        
         Toolkit.getDefaultToolkit().addAWTEventListener(new AWTEventListener() {
            @Override
            public void eventDispatched(AWTEvent event) {
                KeyEvent ev = (KeyEvent) event;
                
                
                if (ev.getID() == KeyEvent.KEY_RELEASED) {
                    
                    switch(ev.getKeyCode())
                    {
                        
                        //Normal Keys
                        
                        // Primeira Linha   
                        case KeyEvent.VK_ESCAPE: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/ESC.png"))); tocarSom(new File("AUDIO/ESC.wav")); break;
                        case KeyEvent.VK_F1: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/F1.png"))); tocarSom(new File("AUDIO/F1.wav")); break;
                        case KeyEvent.VK_F2: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/F2.png"))); tocarSom(new File("AUDIO/F2.wav")); break;
                        case KeyEvent.VK_F3: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/F3.png"))); tocarSom(new File("AUDIO/F3.wav")); break;
                        case KeyEvent.VK_F4: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/F4.png"))); tocarSom(new File("AUDIO/F4.wav")); break;
                        case KeyEvent.VK_F5: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/F5.png"))); tocarSom(new File("AUDIO/F5.wav")); break;
                        case KeyEvent.VK_F6: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/F6.png"))); tocarSom(new File("AUDIO/F6.wav")); break;
                        case KeyEvent.VK_F7: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/F7.png"))); tocarSom(new File("AUDIO/F7.wav")); break;
                        case KeyEvent.VK_F8: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/F8.png"))); tocarSom(new File("AUDIO/F8.wav")); break;
                        case KeyEvent.VK_F9: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/F9.png"))); tocarSom(new File("AUDIO/F9.wav")); break;
                        case KeyEvent.VK_F10: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/F10.png"))); tocarSom(new File("AUDIO/F10.wav")); break;
                        case KeyEvent.VK_F11: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/F11.png"))); tocarSom(new File("AUDIO/F11.wav")); break;
                        case KeyEvent.VK_F12: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/F12.png"))); tocarSom(new File("AUDIO/F12.wav")); break;
                        
                        case KeyEvent.VK_PRINTSCREEN: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/PRINT_SCREEN.png"))); tocarSom(new File("AUDIO/PRINT_SCREEN.wav")); break;
                        //case KeyEvent.VK_SCROLL_LOCK: lbImage.setText("Scroll Lock Pressed"); break;
                        case KeyEvent.VK_PAUSE: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/PAUSE.png"))); tocarSom(new File("AUDIO/PAUSE.wav")); break;
                        
                        
                        //Segunda Linha
                        case KeyEvent.VK_QUOTE: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/CRASE.png"))); tocarSom(new File("AUDIO/CRASE.wav")); break;
                        case KeyEvent.VK_1: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/1.png"))); tocarSom(new File("AUDIO/1.wav")); break;
                        case KeyEvent.VK_2: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/2.png"))); tocarSom(new File("AUDIO/2.wav")); break;
                        case KeyEvent.VK_3: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/3.png"))); tocarSom(new File("AUDIO/3.wav")); break;
                        case KeyEvent.VK_4: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/4.png"))); tocarSom(new File("AUDIO/4.wav")); break;
                        case KeyEvent.VK_5: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/5.png"))); tocarSom(new File("AUDIO/5.wav")); break;
                        case KeyEvent.VK_6: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/6.png"))); tocarSom(new File("AUDIO/6.wav")); break;
                        case KeyEvent.VK_7: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/7.png"))); tocarSom(new File("AUDIO/7.wav")); break;
                        case KeyEvent.VK_8: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/8.png"))); tocarSom(new File("AUDIO/8.wav")); break;
                        case KeyEvent.VK_9: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/9.png"))); tocarSom(new File("AUDIO/9.wav")); break;
                        case KeyEvent.VK_0: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/0.png"))); tocarSom(new File("AUDIO/0.wav")); break;
                        case KeyEvent.VK_MINUS: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/MENOS.png"))); tocarSom(new File("AUDIO/MENOS.wav")); break;
                        case KeyEvent.VK_EQUALS: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/IGUAL.png"))); tocarSom(new File("AUDIO/IGUAL.wav")); break;
                        case KeyEvent.VK_BACK_SPACE: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/BACK_SPACE.png"))); tocarSom(new File("AUDIO/BACK_SPACE.wav")); break;
                        
                        case KeyEvent.VK_INSERT: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/INSERT.png"))); tocarSom(new File("AUDIO/INSERT.wav")); break;
                        case KeyEvent.VK_HOME: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/HOME.png"))); tocarSom(new File("AUDIO/HOME.wav")); break;
                        case KeyEvent.VK_PAGE_UP: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/PAGE_UP.png"))); tocarSom(new File("AUDIO/PAGE_UP.wav")); break;
                        
                        
                        //terceira linha
                        case KeyEvent.VK_TAB: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/TAB.png"))); tocarSom(new File("AUDIO/TAB.wav")); break;
                        case KeyEvent.VK_Q: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/Q.png"))); tocarSom(new File("AUDIO/Q.wav")); break;
                        case KeyEvent.VK_W: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/W.png"))); tocarSom(new File("AUDIO/W.wav")); break;
                        case KeyEvent.VK_E: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/E.png"))); tocarSom(new File("AUDIO/E.wav")); break;
                        case KeyEvent.VK_R: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/R.png"))); tocarSom(new File("AUDIO/R.wav")); break;
                        case KeyEvent.VK_T: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/T.png"))); tocarSom(new File("AUDIO/T.wav")); break;
                        case KeyEvent.VK_Y: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/Y.png"))); tocarSom(new File("AUDIO/Y.wav")); break;
                        case KeyEvent.VK_U: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/U.png"))); tocarSom(new File("AUDIO/U.wav")); break;
                        case KeyEvent.VK_I: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/I.png"))); tocarSom(new File("AUDIO/I.wav")); break;
                        case KeyEvent.VK_O: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/O.png"))); tocarSom(new File("AUDIO/O.wav")); break;
                        case KeyEvent.VK_P: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/P.png"))); tocarSom(new File("AUDIO/P.wav")); break;
                        case KeyEvent.VK_DEAD_ACUTE: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/ACENTO_AGUDO.png"))); tocarSom(new File("AUDIO/ACENTO_AGUDO.wav")); break;
                        case KeyEvent.VK_OPEN_BRACKET: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/ABRIR_COLCHETE.png"))); tocarSom(new File("AUDIO/ABRIR_COLCHETE.wav")); break;
                        case KeyEvent.VK_CLOSE_BRACKET: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/FECHA_COLCHETE.png"))); tocarSom(new File("AUDIO/FECHA_COLCHETE.wav")); break;
                        
                        case KeyEvent.VK_DELETE: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/DELETE.png"))); tocarSom(new File("AUDIO/DELETE.wav")); break;
                        case KeyEvent.VK_END: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/END.png"))); tocarSom(new File("AUDIO/END.wav")); break;
                        case KeyEvent.VK_PAGE_DOWN: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/PAGE_DOWN.png"))); tocarSom(new File("AUDIO/PAGE_DOWN.wav")); break;
                        
                        
                        //quarta linha
                        //case KeyEvent.VK_CAPS_LOCK: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/CAPS_LOCK.png"))); tocarSom(new File("AUDIO/CAPS_LOCK.wav")); break;
                        case KeyEvent.VK_A: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/A.png"))); tocarSom(new File("AUDIO/A.wav")); break;
                        case KeyEvent.VK_S: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/S.png"))); tocarSom(new File("AUDIO/S.wav")); break;
                        case KeyEvent.VK_D: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/D.png"))); tocarSom(new File("AUDIO/D.wav")); break;
                        case KeyEvent.VK_F: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/F.png"))); tocarSom(new File("AUDIO/F.wav")); break;
                        case KeyEvent.VK_G: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/G.png"))); tocarSom(new File("AUDIO/G.wav")); break;
                        case KeyEvent.VK_H: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/H.png"))); tocarSom(new File("AUDIO/H.wav")); break;
                        case KeyEvent.VK_J: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/J.png"))); tocarSom(new File("AUDIO/J.wav")); break;
                        case KeyEvent.VK_K: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/K.png"))); tocarSom(new File("AUDIO/K.wav")); break;
                        case KeyEvent.VK_L: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/L.png"))); tocarSom(new File("AUDIO/L.wav")); break;
                        case KeyEvent.VK_DEAD_CEDILLA: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/CEDILLA.png"))); tocarSom(new File("AUDIO/CEDILLA.wav")); break;
                        case KeyEvent.VK_DEAD_TILDE: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/TIL.png"))); tocarSom(new File("AUDIO/TIL.wav")); break;
                        case KeyEvent.VK_ENTER: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/ENTER.png"))); tocarSom(new File("AUDIO/ENTER.wav")); break;
                        
                        
                        //quinta linha
                        case KeyEvent.VK_SHIFT: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/SHIFT.png"))); tocarSom(new File("AUDIO/SHIFT.wav")); break;
                        case KeyEvent.VK_BACK_SLASH: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/BACK_SLASH.png"))); tocarSom(new File("AUDIO/BACK_SLASH.wav")); break;
                        case KeyEvent.VK_Z: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/Z.png"))); tocarSom(new File("AUDIO/Z.wav")); break;
                        case KeyEvent.VK_X: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/X.png"))); tocarSom(new File("AUDIO/X.wav")); break;
                        case KeyEvent.VK_C: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/C.png"))); tocarSom(new File("AUDIO/C.wav")); break;
                        case KeyEvent.VK_V: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/V.png"))); tocarSom(new File("AUDIO/V.wav")); break;
                        case KeyEvent.VK_B: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/B.png"))); tocarSom(new File("AUDIO/B.wav")); break;
                        case KeyEvent.VK_N: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/N.png"))); tocarSom(new File("AUDIO/N.wav")); break;
                        case KeyEvent.VK_M: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/M.png"))); tocarSom(new File("AUDIO/M.wav")); break;
                        case KeyEvent.VK_COMMA: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/VIRGULA.png"))); tocarSom(new File("AUDIO/VIRGULA.wav")); break;
                        case KeyEvent.VK_PERIOD: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/PONTO.png"))); tocarSom(new File("AUDIO/PONTO.wav")); break;
                        case KeyEvent.VK_SEMICOLON: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/PONTO_VIRGULA.png"))); tocarSom(new File("AUDIO/PONTO_VIRGULA.wav")); break;
                        case KeyEvent.VK_SLASH: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/BARRA.png"))); tocarSom(new File("AUDIO/BARRA.wav")); break;
                        
                        case KeyEvent.VK_UP: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/UP.png"))); tocarSom(new File("AUDIO/UP.wav")); break;
                        
                        
                        //sexta linha
                        case KeyEvent.VK_CONTROL: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/CTRL.png"))); tocarSom(new File("AUDIO/CTRL.wav")); break;
                        case KeyEvent.VK_WINDOWS: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/WINDOWS.png"))); tocarSom(new File("AUDIO/WINDOWS.wav")); break;
                        case KeyEvent.VK_ALT: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/ALT.png"))); tocarSom(new File("AUDIO/ALT.wav")); break;
                        case KeyEvent.VK_SPACE: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/ESPAÇO.png"))); tocarSom(new File("AUDIO/ESPAÇO.wav")); break;
                        //case KeyEvent.VK_ALT_GRAPH: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/ALT.png"))); tocarSom(new File("AUDIO/ALT.wav")); break;
                        case KeyEvent.VK_CONTEXT_MENU: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/MENU.png"))); tocarSom(new File("AUDIO/MENU.wav")); break;
                        
                        case KeyEvent.VK_LEFT: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/LEFT.png"))); tocarSom(new File("AUDIO/LEFT.wav")); break;
                        case KeyEvent.VK_DOWN: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/DOWN.png"))); tocarSom(new File("AUDIO/DOWN.wav")); break;
                        case KeyEvent.VK_RIGHT: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/RIGHT.png"))); tocarSom(new File("AUDIO/RIGHT.wav")); break;
                        
                        //NUM PAD
                        
                        //primeira linha
                        //case KeyEvent.VK_NUM_LOCK: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/NUM_LOCK.png"))); tocarSom(new File("AUDIO/NUM_LOCK.wav")); break;
                        case KeyEvent.VK_DIVIDE: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/DIVIDE.png"))); tocarSom(new File("AUDIO/DIVIDE.wav")); break;
                        case KeyEvent.VK_MULTIPLY: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/ASTERISCO.png"))); tocarSom(new File("AUDIO/ASTERISCO.wav")); break;
                        case KeyEvent.VK_SUBTRACT: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/MENOS.png"))); tocarSom(new File("AUDIO/MENOS.wav")); break;
                        
                        //segunda linha
                        case KeyEvent.VK_NUMPAD7: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/7.png"))); tocarSom(new File("AUDIO/7.wav")); break;
                        case KeyEvent.VK_NUMPAD8: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/8.png"))); tocarSom(new File("AUDIO/8.wav")); break;
                        case KeyEvent.VK_NUMPAD9: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/9.png"))); tocarSom(new File("AUDIO/9.wav")); break;
                        case KeyEvent.VK_ADD: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/MAIS.png"))); tocarSom(new File("AUDIO/MAIS.wav")); break;
                        
                        //terceira linha
                        case KeyEvent.VK_NUMPAD4: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/4.png"))); tocarSom(new File("AUDIO/4.wav")); break;
                        case KeyEvent.VK_NUMPAD5: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/5.png"))); tocarSom(new File("AUDIO/5.wav")); break;
                        case KeyEvent.VK_NUMPAD6: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/6.png"))); tocarSom(new File("AUDIO/6.wav")); break;
                        
                        // PERIOD JÁ FOI
                        
                        //quarta linha
                        case KeyEvent.VK_NUMPAD1: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/1.png"))); tocarSom(new File("AUDIO/1.wav")); break;
                        case KeyEvent.VK_NUMPAD2: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/2.png"))); tocarSom(new File("AUDIO/2.wav")); break;
                        case KeyEvent.VK_NUMPAD3: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/3.png"))); tocarSom(new File("AUDIO/3.wav")); break;
                        //ENTER JA FOI
                        
                        //quinta linha
                        case KeyEvent.VK_NUMPAD0: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/0.png"))); tocarSom(new File("AUDIO/0.wav")); break;
                        case KeyEvent.VK_DECIMAL: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/PONTO.png"))); tocarSom(new File("AUDIO/PONTO.wav")); break;
                        case KeyEvent.VK_SEPARATOR: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/DEL.png"))); tocarSom(new File("AUDIO/DEL.wav")); break;
                        //ENTER JA FOI
                        
                        default: lbImage.setText(""); lbImage.setIcon(GeraImagem(new File("IMAGEM/DEFAULT.png"))); tocarSom(new File("AUDIO/DEFAULT.wav")); break;
                    }
//                    if (ev.getKeyCode() == KeyEvent.VK_F1) {
//                        lbTeste.setText("F1 Pressed");
//                    }
                }
            }
        }, AWTEvent.KEY_EVENT_MASK);
    }
    
    
    //Toca um arquivo de som WAV
    private void tocarSom(File arquivo)
    {
        try {


            InputStream is = new FileInputStream(arquivo);
            InputStream som = new BufferedInputStream(is);
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(som);  
            final DataLine.Info dataLineInfo = new DataLine.Info(Clip.class,audioInputStream.getFormat(),((int) audioInputStream.getFrameLength() * audioInputStream.getFormat().getFrameSize()));  
            Clip clip = (Clip) AudioSystem.getLine(dataLineInfo);  
            clip.open(audioInputStream);  
            clip.loop(0); 


        } catch (FileNotFoundException ex) {
            Logger.getLogger(Homescreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedAudioFileException | LineUnavailableException | IOException ex) {
            Logger.getLogger(Homescreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static ImageIcon GeraImagem(File arquivo) {
        ImageIcon imagem = new ImageIcon(arquivo.getAbsolutePath());
        ImageIcon thumbnail = null;
        if (imagem.getIconHeight() > IMAGE_HEIGHT) {
            thumbnail = new ImageIcon(
                    imagem.getImage().getScaledInstance(-1, IMAGE_HEIGHT, Image.SCALE_SMOOTH));
        } else {
            thumbnail = imagem;
        }
        
        if (thumbnail.getIconWidth() > IMAGE_WIDTH) {
            thumbnail = new ImageIcon(
                    thumbnail.getImage().getScaledInstance(IMAGE_WIDTH, -1, Image  .SCALE_SMOOTH));
        }

        return thumbnail;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbImage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(10, 10));
        setPreferredSize(new java.awt.Dimension(616, 480));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbImage.setBackground(new java.awt.Color(0, 204, 102));
        lbImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbImage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 470, 350));

        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 220, 40, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 480));

        setSize(new java.awt.Dimension(613, 482));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbImage;
    // End of variables declaration//GEN-END:variables
}
