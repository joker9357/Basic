package AdapterPattern;
/*
 * ��һ����Ľӿ�ת�ӳ��û����ڴ��ġ�һ������ʹ����ӿڲ����ݶ�������һ�������๤����һ�������ǽ�
 * ���Լ��Ľӿڰ�����һ���Ѵ��ڵ����С�
 * Step 1��Create interfaces for Media Player and Advanced Media Player.
 *         MediaPlayer.java/AdvancedMediaPlayer.java
 * Step 2��Create concrete classes implementing the AdvancedMediaPlayer interface.
 *         VlcPlayer.java/Mp4Player.java
 * Step 3��Create adapter class implementing the MediaPlayer interface.MediaAdapter.java
 * Step 4��Create concrete class implementing the MediaPlayer interface.AudioPlayer.java
 * Step 5��Use the AudioPlayer to play different types of audio formats.AdapterPatternDemo.java
 */

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AudioPlayer audioPlayer = new AudioPlayer();

	    audioPlayer.play("mp3", "beyond the horizon.mp3");
	    audioPlayer.play("mp4", "alone.mp4");
	    audioPlayer.play("vlc", "far far away.vlc");
	    audioPlayer.play("avi", "mind me.avi");

	}

}
