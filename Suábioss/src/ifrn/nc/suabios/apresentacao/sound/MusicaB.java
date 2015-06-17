
	package ifrn.nc.suabios.apresentacao.sound;
	import javax.sound.sampled.AudioInputStream;
	import javax.sound.sampled.AudioSystem;
	import javax.sound.sampled.Clip;
	import javax.sound.sampled.DataLine;
	import javax.sound.sampled.LineUnavailableException;
	import javax.sound.sampled.Mixer;
	import javax.sound.sampled.UnsupportedAudioFileException;

	import java.io.File;
	import java.io.IOException;
	import java.util.Scanner;

public class MusicaB {



		public static void main(String[] args){
			
		}
		
		
		public static void musica(){
		
		Mixer mixer;
		
		Clip clip=null;

	        Mixer.Info[] mixInfos = AudioSystem.getMixerInfo();
			
			mixer = AudioSystem.getMixer(mixInfos[0]);
			
			DataLine.Info dataInfo = new DataLine.Info(Clip.class, null);
			
			try{
				
				clip = (Clip)mixer.getLine(dataInfo);
				
			} catch (LineUnavailableException lue) {
				
				lue.printStackTrace();
				
			}

				try{

					File audio1 = new File("C:\\Users\\Larisse\\workspace\\Pesquisa\\Suábioss\\src\\ifrn\\nc\\suabios\\apresentacao\\sound\\audioB.wav");
				
					AudioInputStream audioStream = AudioSystem.getAudioInputStream(audio1);
					clip.open(audioStream);
					

				} 
				
				
				catch(LineUnavailableException lue){
					lue.printStackTrace();
				}
				
				catch(UnsupportedAudioFileException uafe){
					uafe.printStackTrace();
				}
				
				catch(IOException ioe){
					ioe.printStackTrace();
				}
				
				clip.start();
				
				do{
					
					try{
						Thread.sleep(50);} 
					catch(InterruptedException ie){
						ie.printStackTrace();
					}
					
				} while(clip.isActive());
				
				
				do{
					
					try{
						Thread.sleep(50);} 
					catch(InterruptedException ie){
						ie.printStackTrace();
					}
					
				} while(clip.isActive());
		
				}

	
}
