package genericLibraries;

import java.text.SimpleDateFormat;
import java.util.Random;

import org.apache.poi.hpsf.Date;

public class JavaUtility {
	public int generateRandomNum(int limit)
	{
		Random random=new Random();
		return random.nextInt(limit);
	}
	public String getCurrentTime()
	{
		Date date =new Date();
		SimpleDateFormat sdf =new SimpleDateFormat("dd_mm_yy_hh_mm_ss");
		return sdf.format(date);
		
	}

}
