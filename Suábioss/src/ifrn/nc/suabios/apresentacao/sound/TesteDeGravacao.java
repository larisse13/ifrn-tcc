
package ifrn.nc.suabios.apresentacao.sound;

import java.io.BufferedInputStream;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.TargetDataLine;

public class TesteDeGravacao {
	
	static Scanner teclado = new Scanner(System.in);
	
	static final long tempo_gravacao = 6000;
	
	File wavFile = new File ("C:\\Users\\Larisse\\workspace\\Pesquisa\\Su�bioss\\src\\ifrn\\nc\\suabios\\apresentacao\\sound\\audioB.wav");

	AudioFileFormat.Type tipo = AudioFileFormat.Type.WAVE;
	
	TargetDataLine line;
	
	
	public AudioFormat getAudioFormat() {
		
        float sampleRate = 16000;
        
        int sampleSizeInBits = 8;
        
        int channels = 2;
        
        boolean signed = true;
        
        boolean bigEndian = true;
        
        AudioFormat format = new AudioFormat(sampleRate, sampleSizeInBits, channels, signed, bigEndian);
        
        return format;
    
	}
	
	public void start() {
		
        try {
        
        	AudioFormat format = getAudioFormat();
            
        	DataLine.Info info = new DataLine.Info(TargetDataLine.class, format);
        	
            if (!AudioSystem.isLineSupported(info)) {
                
            	System.out.println("Arquivo n�o suportado, por favor tente novamente.");
                
            	System.exit(0);
            
            }
            
            line = (TargetDataLine) AudioSystem.getLine(info);
            
            line.open(format);
            
            line.start();  
 
            System.out.println("Inicializando a gravação do áudio...");
 
            AudioInputStream ais = new AudioInputStream(line);
 
            System.out.println("Gravando...");
 
            AudioSystem.write(ais, tipo, wavFile);
 
        } catch (LineUnavailableException ex) {
            
        	ex.printStackTrace();
        	
        } catch (IOException ioe) {
            
        	ioe.printStackTrace();
        
        }
    
	}
 
 
    void finish() {
    	
        line.stop();
        
        line.close();
        
        System.out.println("A gravação foi concluída com sucesso.");
    
    }
 
    
    public static void main(String[] args) {
    
    	final TesteDeGravacao recorder = new TesteDeGravacao();

    	Thread stopper = new Thread(new Runnable() {
        
    		public void run() {
            
    			try {
                
    				Thread.sleep(tempo_gravacao);
                
    			} catch (InterruptedException ex) {
                
    				ex.printStackTrace();
                
    			}
                
    			recorder.finish();
            
    		}
        
    	});
 
        stopper.start();
        
        recorder.start();  
        
      
    }
}
 
