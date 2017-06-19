public class AuthCommand extends Commands
{
	public AuthCommand()
	{
		super();
	}
	void msg(String message, String name)
	{
		super.msg(message, name);
	}
	private void ghost(String nick)
	{
		// Ghost code
	}
	private void release(String nick)
	{
		// Release code
	}
	void kick(String message, String channel, String name)
	{
		// kick from channel
	}
	void ban(String message, String channel, String name)
	{
		// ban from channel
	}
	void kickban(String message, String name)
	{
		// ban user
		// kick from channel
	}
	void sup(String name)
	{
		// ~ user
	}
	void op(String name)
	{
		// @ user
	}
	void hop(String name)
	{
		// % user
	}
	void voice(String name)
	{
		// + user
	}
	
	void ns(String message)
	{
		super.ns(message);
		// ghost method
		// release method
	}
	void cs(String message)
	{
		super.cs(message);
		// login to channel administrator
	}
	void ms(String message)
	{
		super.ms(message);
	}
	void whois()
	{
		super.whois();
	}
}
