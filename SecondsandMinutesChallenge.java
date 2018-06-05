
public class SecondsandMinutesChallenge {

	public static void main(String[] args) {
		System.out.println(getDurationString(65, 45));
		System.out.println(getDurationString(3945L));
		// method = getDurationString 
		// 2parameters - 1st = minutes, 2nd= seconds
		// validate first parameter minutes is >=0
		// validate second parameter seconds is >=0 and <=59.
		// return "invalid value" in method if either are not true
		// if parameters are valid then calculate how many hours,
		// minutes, seconds equal the minutes and seconds passed to the method
		// and return with XXh, YYm, ZZs,
		// XX - hours, YY - minutes, ZZ - seconds
		// 2nd method of the same name but with only one parameter seconds
		// Validate that it is >=0 and return "Invalid Value" if it is not true
		// if valid, calculate how many minutes are in the seconds value and then call the other 
		// overloaded method passing the correct minutes and seconds calculate, so that it can calculate correctly.
	}
		private static String getDurationString(long minutes, long seconds) {
			if((minutes <0) || (seconds<0) || ( seconds>59)) {
			return "Invalid Value"; 
		}
			long hours = minutes / 60;
			long remainingMinutes = minutes % 60;
			return hours + "h " +remainingMinutes+ "m " + seconds + "s ";
		
		}
		private static String getDurationString(long seconds) {
			
			if(seconds<0) {
				return "Invalid Value";
			}
			long minutes = seconds / 60;
			long remainingSeconds = seconds % 60;
			
			return getDurationString(minutes, remainingSeconds);
		}
	
		}
			
		

