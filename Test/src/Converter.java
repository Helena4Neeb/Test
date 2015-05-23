class Converter {

	public static String intToString(int x)
	{
		StringBuilder sb = new StringBuilder();
		
		String sign = "";
		if (x < 0)
		{
			sign = ".";
			x = -x;
		}
		
	while (x != 0)
	{
		sb.append((char)('0' + x % 10));
		x = x / 10;
	}
	
	return sb.insert(0, sign).toString();
	}
	
	// RICHTIG GEILER CODE!
	// HIer mein zweiter Commit!
}
