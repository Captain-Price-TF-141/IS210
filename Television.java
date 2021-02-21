//Captain-Price-TF-141


public class Television
{
	private String manufacturer;

	private boolean powerOn;
	
	private int screenSize, channel, volume;

  

//The Television constructor accepts parameters for screenSize and manufacturer.
	
//The default powerOn value is false, the default volume is 20, and the default channel is 2.

	Television(String manufacturer, int screenSize)
	{
		this.manufacturer = manufacturer;
		
		this.screenSize = screenSize;
		
		powerOn = false;
		
		volume = 20;
		
		channel = 2;
	}
  

//The setChannel method accepts an int newChannel and sets the current channel to newChannel's value.
	
	public void setChannel(int newChannel)
	{
		channel = newChannel;
	}
  

//The power method will turn off the Television if it is on and vise versa.

	public void power()
	{
		powerOn = !powerOn;
	}
  

//The increaseVolume method will increase the volume by 1.

	public void increaseVolume()
	{
		volume += 1;
	}
  

//The decreaseVolume method will decrease the volume by 1.

	public void decreaseVolume()
	{
		volume -= 1;
	}
  

//The getChannel method will return the current value in cahnnel.

	public int getChannel()
	{
	return channel;
	}
  

//The getVolume method will return the current value in volume.

	public int getVolume()
	{
	return volume;
	}
  

//The getManufacturer mehtod will return the current String in manufacturer.

	public String getManufacturer()
	{
	return manufacturer;
	}
  

//The getScreenSize method will return the current value in screenSize.

	public int getScreenSize()
	{
	return screenSize;
	}
}
