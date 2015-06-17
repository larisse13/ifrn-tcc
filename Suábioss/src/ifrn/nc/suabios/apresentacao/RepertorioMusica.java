package ifrn.nc.suabios.apresentacao;

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

public class RepertorioMusica {
	
	static Scanner teclado = new Scanner(System.in);
	
	public static Mixer mixer;
	
	public static Clip clip;

	public static void main(String[] args) throws IOException, UnsupportedAudioFileException {
		
		Mixer.Info[] mixInfos = AudioSystem.getMixerInfo();
		
		mixer = AudioSystem.getMixer(mixInfos[0]);
		
		DataLine.Info dataInfo = new DataLine.Info(Clip.class, null);
		
		try{
			
			clip = (Clip)mixer.getLine(dataInfo);
			
		} catch (LineUnavailableException lue) {
			
			lue.printStackTrace();
			
		}
		
		int opcao = 0;
		
		do{
			
			System.out.println(".:: REPERTÓRIO MUSICAL ::.");
			
			System.out.println("\n0 - >> Sair <<");
			
			System.out.println("1 - >> Nona Sinfonia <<");
			
			System.out.println("2 - >> Für Elise <<");
			
			opcao = teclado.nextInt();
				
			
		switch(opcao){
		
		case 0:
			
			System.out.println("\n .:: SUA CONEXÃO FOI ENCERRADA ::.");
			
			break;
		
		
		case 1: 
			
			try{

				File audio1 = new File("C:\\Users\\Larisse\\workspace\\Pesquisa\\Suabios\\music\\17. Nona Sinfonia Beethoven trecho.wav");
			
				
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
			
			
		break;
		
		case 2:
			
			try{			
				File audio2 = new File("C:\\Users\\Larisse\\workspace\\Pesquisa\\Suabios\\music\\Für Elise.wav");
			
				AudioInputStream audioStream = AudioSystem.getAudioInputStream(audio2);
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
			
			
		break;
		
		default:
			
			System.out.println("Opção inválida, por favor, tente novamente.");
			
		break;
		
		}
		
    } while(opcao != 0);
	

		
		}

}
