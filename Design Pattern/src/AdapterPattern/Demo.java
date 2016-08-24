package AdapterPattern;
/*
 * 将一个类的接口转接成用户所期待的。一个适配使得因接口不兼容而不能在一起工作的类工作在一起，做法是将
 * 类自己的接口包裹在一个已存在的类中。
 * Step 1：Create interfaces for Media Player and Advanced Media Player.
 *         MediaPlayer.java/AdvancedMediaPlayer.java
 * Step 2：Create concrete classes implementing the AdvancedMediaPlayer interface.
 *         VlcPlayer.java/Mp4Player.java
 * Step 3：Create adapter class implementing the MediaPlayer interface.MediaAdapter.java
 * Step 4：Create concrete class implementing the MediaPlayer interface.AudioPlayer.java
 * Step 5：Use the AudioPlayer to play different types of audio formats.AdapterPatternDemo.java
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
